package com.ghetti.fabio.bi.integration.external.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import com.ghetti.fabio.bi.integration.external.service.Service;
import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.EntregaTO;

@org.springframework.stereotype.Service
public class ControleEntregaService extends Service {

	@Value("${external.service.delivery.control}")
	protected String service;
	
	@Value("${external.service.delivery.resource}")
	protected String deliveryResource;

	public EntregaTO[] getEntregas(final String data) {
		try {
			ResponseEntity<EntregaTO[]> response = restTemplate.exchange(
					this.createCompleteUrl(service, deliveryResource, data), 
					HttpMethod.GET, this.createHeaders(), EntregaTO[].class);
			return response.getBody();
		} catch (RestClientException e) {
			log.error(e.getMessage());
			return null;
		}	
	}
	
	
}
