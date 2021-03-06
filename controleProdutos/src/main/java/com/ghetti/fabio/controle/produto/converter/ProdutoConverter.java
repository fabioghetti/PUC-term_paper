package com.ghetti.fabio.controle.produto.converter;

import java.util.ArrayList;
import java.util.List;

import com.ghetti.fabio.controle.produto.dto.ProdutoTO;
import com.ghetti.fabio.controle.produto.model.Produto;

public class ProdutoConverter {

	public static ProdutoTO convertToTransferObject(Produto produto) {
		if (produto == null) return null;
		return new ProdutoTO(produto.getDescricao(), produto.getFornecedor(), 
				produto.getSetor(), produto.getQuantidade(), produto.getValor());
	}
	
	public static List<ProdutoTO> convertToTransferObjectList(List<Produto> produtos) {
		if (produtos == null || produtos.isEmpty()) return null;
		List<ProdutoTO> produtosTO = new ArrayList<ProdutoTO>();
		for (Produto produto : produtos) {
			produtosTO.add(ProdutoConverter.convertToTransferObject(produto));
		}
		return produtosTO;
	}
}
