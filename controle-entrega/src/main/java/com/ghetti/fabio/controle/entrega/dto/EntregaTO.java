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
	
	private EnderecoTO enderecoTO;
	
	private List<HistoricoTO> historicoTO;
	
	private AvaliacaoTO avaliacaoTO;

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
		this.enderecoTO = enderecoTO;
		this.historicoTO = historicoTO;
		this.avaliacaoTO = avaliacaoTO;
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

	public EnderecoTO getEnderecoTO() {
		return enderecoTO;
	}

	public void setEnderecoTO(EnderecoTO enderecoTO) {
		this.enderecoTO = enderecoTO;
	}

	public List<HistoricoTO> getHistoricoTO() {
		return historicoTO;
	}

	public void setHistoricoTO(List<HistoricoTO> historicoTO) {
		this.historicoTO = historicoTO;
	}

	public AvaliacaoTO getAvaliacaoTO() {
		return avaliacaoTO;
	}

	public void setAvaliacaoTO(AvaliacaoTO avaliacaoTO) {
		this.avaliacaoTO = avaliacaoTO;
	}
}
