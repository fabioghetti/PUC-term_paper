package com.ghetti.fabio.controle.entrega.converter;

import com.ghetti.fabio.controle.entrega.dto.AvaliacaoTO;
import com.ghetti.fabio.controle.entrega.model.Avaliacao;

public class AvaliacaoConverter {

	public static AvaliacaoTO convertToTransferObject(Avaliacao avaliacao) {
		return new AvaliacaoTO(avaliacao.getNota(), avaliacao.getComentario());
	}

}
