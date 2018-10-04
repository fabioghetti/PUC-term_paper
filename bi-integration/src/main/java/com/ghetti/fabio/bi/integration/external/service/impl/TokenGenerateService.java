package com.ghetti.fabio.bi.integration.external.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.ghetti.fabio.bi.integration.external.services.gateway.model.TokenGenerateResponse;

@Service
public class TokenGenerateService {

	@Autowired
	protected RestTemplate restTemplate;
	
	@Value("${external.service.token.url}")
	private String serviceUrl;
	
	@Value("${external.service.token.authorization}")
	private String authorization;
	
	@Value("${external.service.token.username}")
	private String username;
	
	@Value("${external.service.token.password}")
	private String password;
	
	@Value("${external.service.token.grant_type}")
	private String granType;
	
	
	public String getToken() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		headers.set("Authorization", authorization);
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
		map.add("username", username);
		map.add("password", password);
		map.add("grant_type", granType);
		
		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

		ResponseEntity<TokenGenerateResponse> response = restTemplate.postForEntity( serviceUrl, request , TokenGenerateResponse.class );
		
		return response.getBody().getAccess_token();
	}
	
}