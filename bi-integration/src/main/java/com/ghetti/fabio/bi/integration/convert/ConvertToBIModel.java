package com.ghetti.fabio.bi.integration.convert;

import com.ghetti.fabio.bi.integration.external.services.model.Entrega;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBI;
import com.ghetti.fabio.bi.integration.external.services.model.Venda;

public class ConvertToBIModel {

	public static EntregaVendaBI createModelSupportedByBI(Entrega entrega, Venda venda) {
		/*
		 * Classe responsável pela conversão de dados dos nossos serviços para os dados esperados pelo BI.
		 * Tudo referente a transformação para o BI deverá partir daqui, como por exemplo uma chamada para o SEFAZ
		 * para acrescentar uma informação ou algo similar.
		 * 
		*/
		
		return new EntregaVendaBI();
	}
}
