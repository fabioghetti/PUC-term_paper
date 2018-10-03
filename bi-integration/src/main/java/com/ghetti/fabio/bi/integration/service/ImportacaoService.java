package com.ghetti.fabio.bi.integration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghetti.fabio.bi.integration.external.service.impl.ControleProdutoService;
import com.ghetti.fabio.bi.integration.external.services.control.product.model.VendaTO;
import com.ghetti.fabio.bi.integration.model.Importacao;
import com.ghetti.fabio.bi.integration.repository.ImportacaoRepository;
import com.ghetti.fabio.bi.integration.util.IntegrationUtil;

@Service
public class ImportacaoService {


	@Autowired
	private ControleProdutoService produtoService;
	
	@Autowired
	private ImportacaoRepository importacaoRepository;
	
	public void realizarImportacao() {
		
		
		if (!this.dadoJaImportado("ENTREGAS/VENDAS")) {
			this.registrarImportacao("ENTREGAS/VENDAS", "SUCESSO");	
			
			VendaTO[] vendas = produtoService.getVendas(IntegrationUtil.getSimpleCurrentDateFormated());
			
			System.out.println(vendas.length);
			System.out.println(vendas[0]);
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
