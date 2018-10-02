package com.ghetti.fabio.controle.produto.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ghetti.fabio.controle.produto.model.Venda;

public interface VendaRepository extends Repository<Venda, String> {

	public List<Venda> findAll();
	
	public List<Venda> findByData(String data);
}
