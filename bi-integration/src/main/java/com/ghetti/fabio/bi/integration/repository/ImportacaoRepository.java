package com.ghetti.fabio.bi.integration.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.ghetti.fabio.bi.integration.model.Importacao;

public interface ImportacaoRepository extends Repository<Importacao, String>{

	public Importacao save(Importacao importacao);
	
	public List<Importacao> findByStatusAndDataImportacaoAndFonteDado(String status, String dataImportacao, String fonteDado);
}
