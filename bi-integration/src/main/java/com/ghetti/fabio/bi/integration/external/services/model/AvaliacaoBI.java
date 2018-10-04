package com.ghetti.fabio.bi.integration.external.services.model;

public class AvaliacaoBI {

	private String nota;
	
	private String comentario;

	public AvaliacaoBI() {
		super();
	}

	public AvaliacaoBI(String nota, String comentario) {
		super();
		this.nota = nota;
		this.comentario = comentario;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
