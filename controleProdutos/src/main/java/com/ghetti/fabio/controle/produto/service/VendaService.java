package com.ghetti.fabio.controle.produto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ghetti.fabio.controle.produto.converter.VendaConverter;
import com.ghetti.fabio.controle.produto.dto.VendaTO;
import com.ghetti.fabio.controle.produto.model.Venda;
import com.ghetti.fabio.controle.produto.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;
	
	public List<VendaTO> buscarVendas() {
		return this.buscarVendas(null);
	}
	
	public List<VendaTO> buscarVendas(final String data) {
		List<VendaTO> result = new ArrayList<VendaTO>();
		
		List<Venda> vendas = new ArrayList<Venda>();
		if (data == null || "".equals(data)) {
			vendas = vendaRepository.findAll();			
		} else {
			vendas = vendaRepository.findByData(data);
		}
		
		for (Venda venda : vendas) {
			result.add(VendaConverter.convertToTransferObject(venda));
		}
		
		return result;
	}
}
