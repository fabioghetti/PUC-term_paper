package com.ghetti.fabio.bi.integration.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IntegrationUtil {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String getCurrentDateFormated() {
		return dateFormat.format(new Date());
	}
}