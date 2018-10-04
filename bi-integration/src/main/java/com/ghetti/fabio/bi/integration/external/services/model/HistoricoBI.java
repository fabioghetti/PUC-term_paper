package com.ghetti.fabio.bi.integration.external.services.model;

public class HistoricoBI {

	private String data;
	
	private String status;

	public HistoricoBI() {
		super();
	}

	public HistoricoBI(String data, String status) {
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
