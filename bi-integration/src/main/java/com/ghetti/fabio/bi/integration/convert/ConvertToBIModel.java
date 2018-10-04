package com.ghetti.fabio.bi.integration.convert;

import java.util.ArrayList;
import java.util.List;

import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.AvaliacaoTO;
import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.EnderecoTO;
import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.EntregaTO;
import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.HistoricoTO;
import com.ghetti.fabio.bi.integration.external.services.control.product.model.ProdutoTO;
import com.ghetti.fabio.bi.integration.external.services.control.product.model.VendaTO;
import com.ghetti.fabio.bi.integration.external.services.model.AvaliacaoBI;
import com.ghetti.fabio.bi.integration.external.services.model.EnderecoBI;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaBI;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBIRequest;
import com.ghetti.fabio.bi.integration.external.services.model.HistoricoBI;
import com.ghetti.fabio.bi.integration.external.services.model.ProdutoBI;
import com.ghetti.fabio.bi.integration.external.services.model.VendaBI;

public class ConvertToBIModel {

	public static EntregaVendaBIRequest createModelSupportedByBI(EntregaTO[] entregas, VendaTO[] vendas) {
		/*
		 * Classe responsável pela conversão de dados dos nossos serviços para os dados esperados pelo BI.
		 * Tudo referente a transformação para o BI deverá partir daqui, como por exemplo uma chamada para o SEFAZ
		 * para acrescentar uma informação ou algo similar.
		 * 
		*/
		return new EntregaVendaBIRequest(
				ConvertToBIModel.convertVendaTransferObjectArrayToVendaBIList(vendas),
				ConvertToBIModel.convertEntregaTransferObjectArrayToEntregaBIList(entregas)
						);
	}
	
	private static List<VendaBI> convertVendaTransferObjectArrayToVendaBIList(VendaTO[] vendasTO) {
		if (vendasTO == null || vendasTO.length < 0) return null;
		List<VendaBI> vendasBI = new ArrayList<VendaBI>();
		for (VendaTO vendaTO : vendasTO) {
			vendasBI.add(ConvertToBIModel.convertVendaTransferObjectToVendaBI(vendaTO));
		}
		return vendasBI;
	}
	
	private static VendaBI convertVendaTransferObjectToVendaBI(VendaTO vendaTO) {
		if (vendaTO == null) return null;
		return new VendaBI(vendaTO.getCliente(), vendaTO.getData(), vendaTO.getStatus(), vendaTO.getNumeroNotaFiscal(), vendaTO.getDesconto(), 
				vendaTO.getCupom(), vendaTO.getPromocao(), vendaTO.getVendedorExterno(), vendaTO.getFormaPagamento(), vendaTO.getDataEntrega(),
				vendaTO.getTipoEntrega(), ConvertToBIModel.convertProdutoTransferObjectListToProdutoBIList(vendaTO.getProdutos()));
	}
	
	private static List<ProdutoBI> convertProdutoTransferObjectListToProdutoBIList(List<ProdutoTO> produtosTO) {
		if (produtosTO == null || produtosTO.isEmpty()) return null;
		List<ProdutoBI> produtosBI = new ArrayList<ProdutoBI>();
		for (ProdutoTO produtoTO : produtosTO) {
			produtosBI.add(ConvertToBIModel.convertProdutoTransferObjecttoProdutoBI(produtoTO));
		}
		return produtosBI;
	}
	
	private static ProdutoBI convertProdutoTransferObjecttoProdutoBI(ProdutoTO produtoTO) {
		if (produtoTO == null) return null;
		return new ProdutoBI(produtoTO.getDescricao(), produtoTO.getFornecedor(), produtoTO.getSetor(), produtoTO.getQuantidade(), produtoTO.getValor());
	}
	
	private static List<EntregaBI> convertEntregaTransferObjectArrayToEntregaBIList(EntregaTO[] entregasTO) {
		if (entregasTO == null || entregasTO.length < 0) return null;
		List<EntregaBI> entregasBI = new ArrayList<EntregaBI>();
		for (EntregaTO entregaTO : entregasTO) {
			entregasBI.add(ConvertToBIModel.convertEntregaTransferObjectToEntregaBI(entregaTO));
		}
		return entregasBI;
	}
	
	private static EntregaBI convertEntregaTransferObjectToEntregaBI(EntregaTO entregaTO) {
		if (entregaTO == null) return null;
		return new EntregaBI(entregaTO.getStatus(), entregaTO.getFornecedor(), entregaTO.getVendedorExterno(), entregaTO.getCliente(), 
				entregaTO.getDataPostagem(), entregaTO.getDataEntrega(), entregaTO.getTelefone(), 
				ConvertToBIModel.convertEnderecoTransferObjectToEnderecoBI(entregaTO.getEndereco()), 
				ConvertToBIModel.convertHistoricoTransferObjectListToHistoricoBIList(entregaTO.getHistorico()),
				ConvertToBIModel.convertAvaliacaoTransferObjectToAvaliacaoBI(entregaTO.getAvaliacao()));
	}
	
	private static EnderecoBI convertEnderecoTransferObjectToEnderecoBI(EnderecoTO enderecoTO) {
		if (enderecoTO == null) return null;
		return new EnderecoBI(enderecoTO.getRua(), enderecoTO.getNumero(), enderecoTO.getBairro(), 
				enderecoTO.getCidade(), enderecoTO.getEstado(), enderecoTO.getCep(), 
				enderecoTO.getComplemento());
	}
	
	private static List<HistoricoBI> convertHistoricoTransferObjectListToHistoricoBIList(List<HistoricoTO> historicosTO) {
		if (historicosTO == null || historicosTO.isEmpty()) return null;
		List<HistoricoBI> historicosBI = new ArrayList<HistoricoBI>();
		for (HistoricoTO historicoTO : historicosTO) {
			historicosBI.add(ConvertToBIModel.convertHistoricoTransferObjectToHistoricoBI(historicoTO));
		}
		return historicosBI;
	}
	
	private static HistoricoBI convertHistoricoTransferObjectToHistoricoBI(HistoricoTO historicoTO) {
		if (historicoTO == null) return null;
		return new HistoricoBI(historicoTO.getData(), historicoTO.getStatus());
	}
	
	private static AvaliacaoBI convertAvaliacaoTransferObjectToAvaliacaoBI(AvaliacaoTO avaliacaoTO) {
		if (avaliacaoTO == null) return null;
		return new AvaliacaoBI(avaliacaoTO.getNota(), avaliacaoTO.getComentario());
	}
}
