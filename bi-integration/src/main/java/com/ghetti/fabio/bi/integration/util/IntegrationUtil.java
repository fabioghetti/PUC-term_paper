package com.ghetti.fabio.bi.integration.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegrationUtil {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String getCurrentDateFormated() {
		return dateFormat.format(new Date());
	}
	
	public static String getSimpleCurrentDateFormated() {
		return simpleDateFormat.format(new Date());
	}
}