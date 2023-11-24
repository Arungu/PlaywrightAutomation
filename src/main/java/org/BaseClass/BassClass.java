package org.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.POM.LoginPage;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BassClass {

	Playwright playwright;
	public Browser browser;
	public BrowserContext context;
	public Page page;
	Properties prop;
	LoginPage loginPage;

	public Page lanchBrowser(String browserName) {
		playwright = Playwright.create();

		switch (browserName.toLowerCase()) {
//		case "chromium":
//			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
//			break;
		case "chrome":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

			break;
		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));

			break;
		case "safari":
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));

			break;

		default:
			break;
		}
//		context = browser.newContext();
//		page = context.newPage();
//		page.navigate("pc_url");
		return page;
	}

	public String getproperty(String value) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\config.properties"));
		Object object = properties.get(value);
		String key = (String) object;
		return key;

	}

	public Properties init_property() {

		try {
			FileInputStream fileInputStream = new FileInputStream("\\src\\test\\resources\\config\\config.properties");
			prop = new Properties();
			prop.load(fileInputStream);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;

	}
	
	public void HomePage(Page page) {
		this.page=page;

	}
	private void dropdown(String element,String value) {
		
		

	}
	
	
	
	
	
	public void login() {
		HomePage(page);
		loginPage = new LoginPage();
		 page.fill(loginPage.getUserName(), "exp_test");
		 page.fill(loginPage.getPassword(), "exp_test");
		 page.click(loginPage.getLoginBtn());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
