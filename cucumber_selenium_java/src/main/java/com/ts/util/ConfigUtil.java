package com.ts.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {
	private static ConfigUtil _instance = null;
	private String configFilePath = "src/main/resources/config.properties";
	private Properties configProps = null;
	
	public Properties getConfigProps() {
		return configProps;
	}
	public void setConfigProps(Properties configProps) {
		this.configProps = configProps;
	}
	private ConfigUtil() throws Exception
	{
		configProps = new Properties();
		configProps.load( new BufferedReader(new FileReader(configFilePath)));
	}
	public static ConfigUtil getInstance() throws Exception {
		if(_instance == null) {
			_instance = new ConfigUtil();
		}
		return _instance;
	}
	public String getChromeDriverPath(){
		String driverPath = configProps.getProperty("chrome.driverpath");
		System.out.println("driver pth::"+driverPath);
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	public long getImplicitlyWait() {		
		String implicitlyWait = configProps.getProperty("implicitlywait");
		if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
		else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");		
	}
	
}
