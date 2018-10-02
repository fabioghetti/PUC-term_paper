package com.ghetti.fabio.controle.entrega.converter;

import com.ghetti.fabio.controle.entrega.dto.EntregaTO;
import com.ghetti.fabio.controle.entrega.model.Entrega;

public class EntregaConverter {

	public static EntregaTO convertToTransferObject(Entrega entrega) {
		return new EntregaTO(entrega.getStatus(), entrega.getFornecedor(), entrega.getVendedorExterno(), 
				entrega.getCliente(), entrega.getDataPostagem(), entrega.getDataEntrega(), entrega.getTelefone(), 
				EnderecoConverter.convertToTransferObject(entrega.getEndereco()),
				HistoricoConverter.convertToTransferObject(entrega.getHistorico()),
				AvaliacaoConverter.convertToTransferObject(entrega.getAvaliacao()));
	}

}
