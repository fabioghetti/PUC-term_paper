package com.ghetti.fabio.controle.entrega.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ghetti.fabio.controle.entrega.dto.EntregaTO;
import com.ghetti.fabio.controle.entrega.service.EntregaService;

@RestController
@RequestMapping("/entregas")
public class EntregaResource {

	@Autowired
	private EntregaService entregaService;
	
	@GetMapping()
	public ResponseEntity<List<EntregaTO>> buscarEntregas(@RequestParam(value = "data", required = false) String data) {
		List<EntregaTO> entregas = entregaService.buscarEntregas(data);
		return entregas != null ? ResponseEntity.ok(entregas) : ResponseEntity.notFound().build();
	}
}
