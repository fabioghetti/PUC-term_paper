package com.ghetti.fabio.bi.integration.model;

import org.springframework.data.annotation.Id;

public class Importacao {

	@Id
	private String id;
	
	private String dataImportacao;
	
	private String fonteDado;
	
	private String status;

	public Importacao() {
		super();
	}

	public Importacao(String id, String fonteDado, String status, String dataImportacao) {
		super();
		this.id = id;
		this.fonteDado = fonteDado;
		this.status = status;
		this.dataImportacao = dataImportacao;
	}

	public String getDataImportacao() {
		return dataImportacao;
	}

	public void setDataImportacao(String dataImportacao) {
		this.dataImportacao = dataImportacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFonteDado() {
		return fonteDado;
	}

	public void setFonteDado(String fonteDado) {
		this.fonteDado = fonteDado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
