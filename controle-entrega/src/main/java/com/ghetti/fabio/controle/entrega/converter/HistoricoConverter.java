package com.ghetti.fabio.controle.entrega.converter;

import java.util.ArrayList;
import java.util.List;

import com.ghetti.fabio.controle.entrega.dto.HistoricoTO;
import com.ghetti.fabio.controle.entrega.model.Historico;

public class HistoricoConverter {

	public static HistoricoTO convertToTransferObject(Historico historico) {
		if (historico == null) return null;
		return new HistoricoTO(historico.getData(), historico.getStatus());
	}

	public static List<HistoricoTO> convertToTransferObjectList(List<Historico> historicos) {
		if (historicos == null || historicos.isEmpty()) return null;
		List<HistoricoTO> result = new ArrayList<HistoricoTO>();
		for (Historico historico : historicos) {
			result.add(HistoricoConverter.convertToTransferObject(historico));
		}
		return result;
	}
}
