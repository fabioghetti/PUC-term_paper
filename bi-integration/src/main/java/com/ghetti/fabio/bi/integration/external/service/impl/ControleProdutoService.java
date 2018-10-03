package com.ghetti.fabio.bi.integration.external.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ghetti.fabio.bi.integration.external.service.Service;
import com.ghetti.fabio.bi.integration.external.services.control.product.model.VendaTO;

@org.springframework.stereotype.Service
public class ControleProdutoService extends Service{

	@Value("${external.service.product.control}")
	protected String service;
	
	@Value("${external.service.sales.resource}")
	protected String salesResource;

	public VendaTO[] getVendas(final String data) {
		ResponseEntity<VendaTO[]> response = restTemplate.exchange(
				this.createCompleteUrl(service, salesResource), 
				HttpMethod.GET, this.createHeaders(), VendaTO[].class);
		return response.getBody();
	}
	
	private void getFromJson(String json) {
		try {
			ObjectMapper mapper = new ObjectMapper();
//			return mapper.readValue(json, new Venda());
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
