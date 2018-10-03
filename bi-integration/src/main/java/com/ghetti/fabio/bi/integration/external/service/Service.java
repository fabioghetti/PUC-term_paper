package com.ghetti.fabio.bi.integration.external.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public abstract class Service {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	@Value("${external.service.base.url}")
	private String BASE_URL;

	protected String createCompleteUrl(String service, String resource) {
		return BASE_URL + service + resource;
	}

	protected HttpEntity<String> createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		return new HttpEntity<String>("parameters", headers);
	}
	

}
