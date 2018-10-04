package com.ghetti.fabio.bi.integration.external.services.model;

import java.util.List;

public class EntregaBI {
	
	private String status;
	
	private String fornecedor;
	
	private String vendedorExterno;
	
	private String cliente;
	
	private String dataPostagem;
	
	private String dataEntrega;
	
	private String telefone;
	
	private EnderecoBI enderecoBI;
	
	private List<HistoricoBI> historicoBI;
	
	private AvaliacaoBI avaliacaoBI;

	public EntregaBI() {
		super();
	}

	public EntregaBI(String status, String fornecedor, String vendedorExterno, String cliente,
			String dataPostagem, String dataEntrega, String telefone, EnderecoBI endereco, List<HistoricoBI> historico,
			AvaliacaoBI avaliacao) {
		super();
		this.status = status;
		this.fornecedor = fornecedor;
		this.vendedorExterno = vendedorExterno;
		this.cliente = cliente;
		this.dataPostagem = dataPostagem;
		this.dataEntrega = dataEntrega;
		this.telefone = telefone;
		this.enderecoBI = endereco;
		this.historicoBI = historico;
		this.avaliacaoBI = avaliacao;
	}

	public AvaliacaoBI getAvaliacao() {
		return avaliacaoBI;
	}

	public void setAvaliacao(AvaliacaoBI avaliacao) {
		this.avaliacaoBI = avaliacao;
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

	public EnderecoBI getEndereco() {
		return enderecoBI;
	}

	public void setEndereco(EnderecoBI endereco) {
		this.enderecoBI = endereco;
	}

	public List<HistoricoBI> getHistorico() {
		return historicoBI;
	}

	public void setHistorico(List<HistoricoBI> historico) {
		this.historicoBI = historico;
	}
}
