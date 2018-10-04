package com.ghetti.fabio.bi.integration.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ghetti.fabio.bi.integration.external.services.control.delivery.model.EntregaTO;
import com.ghetti.fabio.bi.integration.external.services.control.product.model.VendaTO;
import com.ghetti.fabio.bi.integration.external.services.model.EntregaVendaBIRequest;

public class IntegrationUtil {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String getCurrentDateFormated() {
		return dateFormat.format(new Date());
	}
	
	public static String getSimpleCurrentDateFormated() {
		return simpleDateFormat.format(new Date());
	}
	
	public static String getYesterdayDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -1);
		return simpleDateFormat.format(cal.getTime());
	}
	
	public static String getJson(VendaTO[] jsonObject) {
		String jsonInString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonInString = mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}
	
	public static String getJson(EntregaTO[] jsonObject) {
		String jsonInString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonInString = mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static String getJson(EntregaVendaBIRequest jsonObject) {
		String jsonInString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			jsonInString = mapper.writeValueAsString(jsonObject);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}
}