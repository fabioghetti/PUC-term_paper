package com.ghetti.fabio.controle.entrega.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ghetti.fabio.controle.entrega.model.Entrega;

public interface EntregaRepository extends Repository<Entrega, String> {
	
	public List<Entrega> findAll();
	
	public List<Entrega> findByDataPostagem(String dataPostagem);

	public List<Entrega> findByStatus(String status);
}
