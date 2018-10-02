package com.ghetti.fabio.controle.entrega.converter;

import com.ghetti.fabio.controle.entrega.dto.HistoricoTO;
import com.ghetti.fabio.controle.entrega.model.Historico;

public class HistoricoConverter {

	public static HistoricoTO convertToTransferObject(Historico historico) {
		return new HistoricoTO(historico.getData(), historico.getStatus());
	}

}
