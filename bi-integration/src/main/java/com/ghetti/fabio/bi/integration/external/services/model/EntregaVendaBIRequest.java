package com.ghetti.fabio.bi.integration.external.services.model;

import java.util.List;

public class EntregaVendaBIRequest {

	private List<VendaBI> vendas;
	
	private List<EntregaBI> entregas;

	public List<VendaBI> getVendas() {
		return vendas;
	}

	public void setVendas(List<VendaBI> vendas) {
		this.vendas = vendas;
	}

	public List<EntregaBI> getEntregas() {
		return entregas;
	}

	public void setEntregas(List<EntregaBI> entregas) {
		this.entregas = entregas;
	}

	public EntregaVendaBIRequest(List<VendaBI> vendas, List<EntregaBI> entregas) {
		super();
		this.vendas = vendas;
		this.entregas = entregas;
	}

	public EntregaVendaBIRequest() {
		super();
	}
	
	
}
