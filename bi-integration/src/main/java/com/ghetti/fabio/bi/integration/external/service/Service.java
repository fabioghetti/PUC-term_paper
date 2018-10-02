package com.ghetti.fabio.bi.integration.external.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

public abstract class Service {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected static final String BASE_URL = "";
	
	protected String completeUrl;
	
	protected String resource;
	
	protected String searching;
	
	
	public Service(final String baseURL, final String resource, final String searching) {
		this.completeUrl = baseURL;
		this.resource = resource;
		this.searching = searching;
	}
	
	private HttpEntity<String> createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		return new HttpEntity<String>("parameters", headers);
	}
	
	private String createResourceSearch(final String param) {
		return this.completeUrl+this.resource+this.searching+param;
	}
	

}
