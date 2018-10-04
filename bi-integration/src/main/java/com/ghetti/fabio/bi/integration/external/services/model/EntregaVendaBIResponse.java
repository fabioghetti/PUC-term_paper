package com.ghetti.fabio.bi.integration.external.services.model;

public class EntregaVendaBIResponse {

	private String status;
	
	private String mensagem;

	@Override
	public String toString() {
		return "EntregaVendaBIResponse [status=" + status + ", mensagem=" + mensagem + "]";
	}

	public EntregaVendaBIResponse() {
		super();
	}

	public EntregaVendaBIResponse(String status, String mensagem) {
		super();
		this.status = status;
		this.mensagem = mensagem;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
