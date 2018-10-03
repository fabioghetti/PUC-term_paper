package com.ghetti.fabio.bi.integration.external.services.control.delivery.model;

public class AvaliacaoTO {

	private String nota;
	
	private String comentario;

	public AvaliacaoTO() {
		super();
	}

	public AvaliacaoTO(String nota, String comentario) {
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
