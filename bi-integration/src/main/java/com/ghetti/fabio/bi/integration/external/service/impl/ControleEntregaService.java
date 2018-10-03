package com.ghetti.fabio.bi.integration.external.service.impl;

import org.springframework.beans.factory.annotation.Value;

import com.ghetti.fabio.bi.integration.external.service.Service;

@org.springframework.stereotype.Service
public class ControleEntregaService extends Service {

	@Value("${external.service.delivery.control}")
	protected static String SERVICE;
	
	@Value("${external.service.delivery.resource}")
	protected static String DELIVERY_RESOURCE;

	
	
	
}
