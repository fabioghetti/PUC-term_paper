package com.ghetti.fabio.controle.entrega.converter;

import com.ghetti.fabio.controle.entrega.dto.EnderecoTO;
import com.ghetti.fabio.controle.entrega.model.Endereco;

public class EnderecoConverter {

	public static EnderecoTO convertToTransferObject(Endereco endereco) {
		return new EnderecoTO(endereco.getRua(), endereco.getNumero(), endereco.getBairro(), 
				endereco.getCidade(), endereco.getEstado(), endereco.getCep(), endereco.getComplemento());
	}

}
