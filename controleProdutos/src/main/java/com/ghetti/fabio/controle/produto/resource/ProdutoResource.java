package com.ghetti.fabio.controle.produto.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	
	@GetMapping
	public String test() {
		return "test qualquer coisa";
	}
}
