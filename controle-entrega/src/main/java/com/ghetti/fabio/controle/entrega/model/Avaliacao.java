package com.ghetti.fabio.controle.entrega.model;

public class Avaliacao {

	private String nota;
	
	private String comentario;

	public Avaliacao() {
		super();
	}

	public Avaliacao(String nota, String comentario) {
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
