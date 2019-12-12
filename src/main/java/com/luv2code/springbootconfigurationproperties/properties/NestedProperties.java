package com.luv2code.springbootconfigurationproperties.properties;

import java.util.List;
import java.util.Map;

import com.luv2code.springbootconfigurationproperties.util.Credential;

public class NestedProperties {
	
	 	private String appName;
	    private int port;
	    private List<String> user;
	    private Map<String, String> additionalHeaders;
	    private Credential credential;
		
	    @Override
		public String toString() {
			return "NestedProperties [appName=" + appName + ", port=" + port
					+ ", user=" + user + ", additionalHeaders="
					+ additionalHeaders + ", credential=" + credential + "]";
		}
}	
