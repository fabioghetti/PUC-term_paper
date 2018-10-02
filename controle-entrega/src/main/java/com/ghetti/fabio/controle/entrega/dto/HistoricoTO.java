package com.ghetti.fabio.controle.entrega.dto;

public class HistoricoTO {

	private String data;
	
	private String status;

	public HistoricoTO() {
		super();
	}

	public HistoricoTO(String data, String status) {
		super();
		this.data = data;
		this.status = status;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
