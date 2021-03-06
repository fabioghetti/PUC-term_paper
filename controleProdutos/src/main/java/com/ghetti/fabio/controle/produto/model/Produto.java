package com.ghetti.fabio.controle.produto.model;

public class Produto {

	private String id;
	
	private String descricao;
	
	private String fornecedor;
	
	private String setor;
	
	private Integer quantidade;
	
	private Double valor;

	public Produto() {
		super();
	}

	public Produto(String id, String descricao, String fornecedor, String setor, Integer quantidade, Double valor) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.setor = setor;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
}
