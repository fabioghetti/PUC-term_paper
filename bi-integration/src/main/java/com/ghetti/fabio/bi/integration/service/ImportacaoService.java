package com.ghetti.fabio.bi.integration.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghetti.fabio.bi.integration.convert.ConvertToBIModel;
import com.ghetti.fabio.bi.integration.external.service.bi.BIDataService;
import com.ghetti.fabio.bi.integration.external.service.impl.ControleEntregaService;
import com.ghetti.fabio.bi.integration.external.service.impl.ControleProdutoService;
import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.EntregaTO;
import com.ghetti.fabio.bi.integration.external.services.control.product.model.VendaTO;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBIRequest;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBIResponse;
import com.ghetti.fabio.bi.integration.model.Importacao;
import com.ghetti.fabio.bi.integration.repository.ImportacaoRepository;
import com.ghetti.fabio.bi.integration.util.IntegrationUtil;

@Service
public class ImportacaoService {

	@Autowired
	private ControleProdutoService produtoService;
	@Autowired
	private ControleEntregaService entregaService;
	@Autowired
	private BIDataService biDataService;
	@Autowired
	private ImportacaoRepository importacaoRepository;
	
	private static final Logger log = LoggerFactory.getLogger(ImportacaoService.class);
	
	public void realizarImportacao() {
		
		
		if (!this.dadoJaImportado("ENTREGAS/VENDAS")) {
			
			
			VendaTO[] vendas = produtoService.getVendas(IntegrationUtil.getYesterdayDate());
			log.info("JSON recuperado do microserviço controle-produto: \n {}", IntegrationUtil.getJson(vendas));
			
			EntregaTO[] entregas = entregaService.getEntregas(IntegrationUtil.getYesterdayDate());
			log.info("JSON recuperado do microserviço controle-entrega: \n {}", IntegrationUtil.getJson(entregas));
			
			EntregaVendaBIRequest requestBi = ConvertToBIModel.createModelSupportedByBI(entregas, vendas);
			log.info("JSON gerado para ser enviado ao BI: \n {}", IntegrationUtil.getJson(requestBi));
			
			EntregaVendaBIResponse biResponse = biDataService.sendDataToBusinessIntelligence(requestBi);
			
			if ("sucesso".equals(biResponse.getStatus()))
				this.registrarImportacao("ENTREGAS/VENDAS", "SUCESSO");
			else
				this.registrarImportacao("ENTREGAS/VENDAS", "ERROR");
		} else {
			log.info("Não existem mais dados para serem importados hoje.");
		}
		
	}
	
	private void registrarImportacao(String fonteDado, String status) {
		Importacao importacao = new Importacao();
		importacao.setDataImportacao(IntegrationUtil.getSimpleCurrentDateFormated());
		importacao.setStatus(status);
		importacao.setFonteDado(fonteDado);
		importacaoRepository.save(importacao);
	}
	
	private boolean dadoJaImportado(String fonteDado) {
		List<Importacao> importacoes = importacaoRepository.findByStatusAndDataImportacaoAndFonteDado(
				"SUCESSO", IntegrationUtil.getSimpleCurrentDateFormated(), fonteDado);
		
		if (importacoes != null && !importacoes.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
