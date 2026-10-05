package com.globalsqaxyz.qa.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertFileUtility {
	
	FileInputStream fis;
	public String readPropertyFile(String Key) throws IOException {
		fis=new FileInputStream("C:\\Users\\adigo\\eclipse-workspace\\BankingProject\\src\\test\\resources\\commonDataBanking.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
		
	}

}
