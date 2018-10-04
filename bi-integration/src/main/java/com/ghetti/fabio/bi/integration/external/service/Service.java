package com.ghetti.fabio.bi.integration.external.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import com.ghetti.fabio.bi.integration.external.service.impl.TokenGenerateService;

public abstract class Service {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	@Autowired
	private TokenGenerateService tokenService;
	
	protected static final Logger log = LoggerFactory.getLogger(Service.class);
	
	@Value("${external.service.base.url}")
	private String BASE_URL;

	protected String createCompleteUrl(String service, String resource, String data) {
		String url = BASE_URL + service + resource;
		if (data != null && !"".equals(data)) {
			url+="?data="+data;
		}
		return url;
	}

	protected HttpEntity<String> createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "Bearer "+tokenService.getToken());
		return new HttpEntity<String>("parameters", headers);
	}
	

}
