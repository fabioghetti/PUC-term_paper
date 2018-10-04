package com.ghetti.fabio.controle.entrega.dto;

import java.util.List;

public class EntregaTO {

	private String status;
	
	private String fornecedor;
	
	private String vendedorExterno;
	
	private String cliente;
	
	private String dataPostagem;
	
	private String dataEntrega;
	
	private String telefone;
	
	private EnderecoTO endereco;
	
	private List<HistoricoTO> historico;
	
	private AvaliacaoTO avaliacao;

	public EntregaTO() {
		super();
	}

	public EntregaTO(String status, String fornecedor, String vendedorExterno, String cliente, String dataPostagem,
			String dataEntrega, String telefone, EnderecoTO enderecoTO, List<HistoricoTO> historicoTO,
			AvaliacaoTO avaliacaoTO) {
		super();
		this.status = status;
		this.fornecedor = fornecedor;
		this.vendedorExterno = vendedorExterno;
		this.cliente = cliente;
		this.dataPostagem = dataPostagem;
		this.dataEntrega = dataEntrega;
		this.telefone = telefone;
		this.endereco = enderecoTO;
		this.historico = historicoTO;
		this.avaliacao = avaliacaoTO;
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

	public EnderecoTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoTO enderecoTO) {
		this.endereco = enderecoTO;
	}

	public List<HistoricoTO> getHistorico() {
		return historico;
	}

	public void setHistorico(List<HistoricoTO> historicoTO) {
		this.historico = historicoTO;
	}

	public AvaliacaoTO getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(AvaliacaoTO avaliacaoTO) {
		this.avaliacao = avaliacaoTO;
	}
}
