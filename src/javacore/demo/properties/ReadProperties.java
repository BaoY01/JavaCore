package javacore.demo.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public Properties readFileProperties() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("config.properties"));		
		} catch (IOException e) {		
			e.printStackTrace();
		}
		return properties;
	}
	public static void main(String[] args) {
		ReadProperties readProperties =  new ReadProperties();
		Properties properties = readProperties.readFileProperties();
		String ulr = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String database = properties.getProperty("database");
		String port = properties.getProperty("port");
		
		System.out.println("ULR = " + ulr);
		System.out.println("Usernam = " + username);
		System.out.println("Password = " + password);
		System.out.println("Usernam = " + database);
		System.out.println("Usernam = " + port);
	}
}
