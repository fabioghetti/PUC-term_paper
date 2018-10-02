package com.ghetti.fabio.controle.entrega.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Entrega {

	@Id
	private String id;
	
	private String status;
	
	private String fornecedor;
	
	private String vendedorExterno;
	
	private String cliente;
	
	private String dataPostagem;
	
	private String dataEntrega;
	
	private String telefone;
	
	private Endereco endereco;
	
	private List<Historico> historico;
	
	private Avaliacao avaliacao;

	public Entrega() {
		super();
	}

	public Entrega(String id, String status, String fornecedor, String vendedorExterno, String cliente,
			String dataPostagem, String dataEntrega, String telefone, Endereco endereco, List<Historico> historico,
			Avaliacao avaliacao) {
		super();
		this.id = id;
		this.status = status;
		this.fornecedor = fornecedor;
		this.vendedorExterno = vendedorExterno;
		this.cliente = cliente;
		this.dataPostagem = dataPostagem;
		this.dataEntrega = dataEntrega;
		this.telefone = telefone;
		this.endereco = endereco;
		this.historico = historico;
		this.avaliacao = avaliacao;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getVendedorExterno() {
		return vendedorExterno;
	}

	public void setVendedorExterno(String vendedorExterno) {
		this.vendedorExterno = vendedorExterno;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(String dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Historico> getHistorico() {
		return historico;
	}

	public void setHistorico(List<Historico> historico) {
		this.historico = historico;
	}
}
