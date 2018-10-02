package com.ghetti.fabio.controle.produto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghetti.fabio.controle.produto.dto.VendaTO;
import com.ghetti.fabio.controle.produto.service.VendaService;

@RestController
@RequestMapping("/vendas")
public class VendaResource {

	@Autowired
	private VendaService service;
	
	@GetMapping
	public ResponseEntity<List<VendaTO>> buscarVendas(@RequestParam(value = "data", required = false) String data) {
		List<VendaTO> vendas = service.buscarVendas(data);
		return vendas != null ? ResponseEntity.ok(vendas) : ResponseEntity.notFound().build();
	}
}
