package com.ghetti.fabio.bi.integration.external.service.bi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBIRequest;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBIResponse;

@Service
public class BIDataService {

	@Autowired
	protected RestTemplate restTemplate;
	
	@Value("${external.service.bi.data}")
	private String biDataResource;
	
	public EntregaVendaBIResponse sendDataToBusinessIntelligence(EntregaVendaBIRequest request) {
		HttpEntity<EntregaVendaBIRequest> postRequest = new HttpEntity<>(request);
		try {
			ResponseEntity<EntregaVendaBIResponse> response = restTemplate.exchange(
					biDataResource, HttpMethod.POST, postRequest, EntregaVendaBIResponse.class);
			System.out.println(response.getBody());
			return response.getBody();
		} catch (RestClientException exception) {
			System.out.println(exception.getMessage());
			return null;
		}
		
	}
	
	protected HttpEntity<String> createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		return new HttpEntity<String>("parameters", headers);
	}
	
}
