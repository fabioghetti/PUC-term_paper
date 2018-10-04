package com.ghetti.fabio.bi.integration.external.services.control.product.model;

public class ProdutoTO extends BasicTO {
	
	private String descricao;
	
	private String fornecedor;
	
	private String setor;
	
	private Integer quantidade;
	
	private Double valor;

	public ProdutoTO() {
		super();
	}

	public ProdutoTO(String descricao, String fornecedor, String setor, Integer quantidade, Double valor) {
		super();
		this.descricao = descricao;
		this.fornecedor = fornecedor;
		this.setor = setor;
		this.quantidade = quantidade;
		this.valor = valor;
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
