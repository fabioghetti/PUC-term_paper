package com.ghetti.fabio.controle.entrega.converter;

import com.ghetti.fabio.controle.entrega.dto.EntregaTO;
import com.ghetti.fabio.controle.entrega.model.Entrega;

public class EntregaConverter {

	public static EntregaTO convertToTransferObject(Entrega entrega) {
		if (entrega == null) return null;
		return new EntregaTO(entrega.getStatus(), entrega.getFornecedor(), entrega.getVendedorExterno(), 
				entrega.getCliente(), entrega.getDataPostagem(), entrega.getDataEntrega(), entrega.getTelefone(), 
				EnderecoConverter.convertToTransferObject(entrega.getEndereco()),
				HistoricoConverter.convertToTransferObjectList(entrega.getHistorico()),
				AvaliacaoConverter.convertToTransferObject(entrega.getAvaliacao()));
	}

}
