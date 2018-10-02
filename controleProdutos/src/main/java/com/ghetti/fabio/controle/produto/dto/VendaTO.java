package com.ghetti.fabio.controle.produto.dto;

import java.util.List;

public class VendaTO {

private String cliente;
	
	private String data;
	
	private String status;
	
	private String numeroNotaFiscal;
	
	private String desconto;
	
	private String cupom;
	
	private String promocao;
	
	private String vendedorExterno;
	
	private String formaPagamento;
	
	private String dataEntrega;
	
	private String tipoEntrega;
	
	private List<ProdutoTO> produtoTO;

	public VendaTO() {
		super();
	}

	public VendaTO(String cliente, String data, String status, String numeroNotaFiscal, String desconto,
			String cupom, String promocao, String vendedorExterno, String formaPagamento, String dataEntrega,
			String tipoEntrega, List<ProdutoTO> produtoTO) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.status = status;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.desconto = desconto;
		this.cupom = cupom;
		this.promocao = promocao;
		this.vendedorExterno = vendedorExterno;
		this.formaPagamento = formaPagamento;
		this.dataEntrega = dataEntrega;
		this.tipoEntrega = tipoEntrega;
		this.produtoTO = produtoTO;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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

	public String getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(String numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String getCupom() {
		return cupom;
	}

	public void setCupom(String cupom) {
		this.cupom = cupom;
	}

	public String getPromocao() {
		return promocao;
	}

	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}

	public String getVendedorExterno() {
		return vendedorExterno;
	}

	public void setVendedorExterno(String vendedorExterno) {
		this.vendedorExterno = vendedorExterno;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public List<ProdutoTO> getProdutos() {
		return produtoTO;
	}

	public void setProdutos(List<ProdutoTO> produtos) {
		this.produtoTO = produtos;
	}
}
