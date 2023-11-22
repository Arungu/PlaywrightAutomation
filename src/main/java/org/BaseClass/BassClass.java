package org.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BassClass {
	
	Playwright playwright;
	Browser browser;
	BrowserContext context;
	Page page;
	public Page lanchBrowser(String browserName) {
		playwright=Playwright.create();
		
		switch (browserName.toLowerCase()) {
		case "chromium":
			 browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
			break;
		case "chrome":
			browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
			break;
		case "firefox":
			browser =playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
			break;
		case "safari":
			browser =playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			
			break;

		default:
			break;
		}
		context = browser.newContext();
		page = context.newPage();
		page.navigate("http://192.168.99.145:8180/pc/PolicyCenter.do");
		return page; 
	}
	
	public String getproperty(String value) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Config\\config.properties"));
		Object object = properties.get(value);
		String key =(String) object;
		return key;
		
	}
	

}
