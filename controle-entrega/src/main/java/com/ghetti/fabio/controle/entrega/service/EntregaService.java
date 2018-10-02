package com.ghetti.fabio.controle.entrega.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghetti.fabio.controle.entrega.converter.EntregaConverter;
import com.ghetti.fabio.controle.entrega.dto.EntregaTO;
import com.ghetti.fabio.controle.entrega.model.Entrega;
import com.ghetti.fabio.controle.entrega.repository.EntregaRepository;

@Service
public class EntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	public List<EntregaTO> buscarEntregas(String status) {
		List<Entrega> entregas = new ArrayList<Entrega>();
		if (status == null || "".equals(status)) {
			entregas = entregaRepository.findAll();
		} else {
			entregas = entregaRepository.findByStatus(status);
		}
		List<EntregaTO> entregasTO = new ArrayList<EntregaTO>();
		for (Entrega entrega : entregas) {
			entregasTO.add(EntregaConverter.convertToTransferObject(entrega));
		}
		
		return entregasTO;
	}
}
