package com.ghetti.fabio.controle.produto.converter;

import com.ghetti.fabio.controle.produto.dto.VendaTO;
import com.ghetti.fabio.controle.produto.model.Venda;

public class VendaConverter {

	public static VendaTO convertToTransferObject(Venda venda) {
		return new VendaTO(venda.getCliente(), venda.getData(), venda.getStatus(), venda.getNumeroNotaFiscal(), venda.getDesconto(), 
				venda.getCupom(), venda.getPromocao(), venda.getVendedorExterno(), venda.getFormaPagamento(), venda.getDataEntrega(),
				venda.getTipoEntrega(), ProdutoConverter.convertToTransferObjectList(venda.getProdutos()));
	}

}
