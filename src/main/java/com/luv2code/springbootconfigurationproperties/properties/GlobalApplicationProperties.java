package com.luv2code.springbootconfigurationproperties.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:GlobalApplication.properties")
@ConfigurationProperties("app") // prefix app, find app.* values
public class GlobalApplicationProperties {
	
	private String error;
	private List<Menu> menus = new ArrayList<Menu>();
	private Compiler compiler = new Compiler();
	
	
	public static class Menu {
		private String path;
		private String name;
		private String title;
		@Override
		public String toString() {
			return "Menu [path=" + path + ", name=" + name + ", title=" + title
					+ "]";
		}
	}
	
	public static class Compiler {
		private String timeout;
		private String outputFolder;
		@Override
		public String toString() {
			return "Compiler [timeout=" + timeout + ", outputFolder="
					+ outputFolder + "]";
		}
	}
}
