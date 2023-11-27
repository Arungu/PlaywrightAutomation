package org.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.POM.AccountCreation;
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
	AccountCreation accountCreation;
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
	public void dropdown(String element,String value) {
		page.locator(element).click();
		//page.locator(element).click();
		//page.locator(element).clear();
		page.locator(element).press("Delete");
		//page.locator(element).click();
		page.locator(element).fill(value);
		page.waitForTimeout(2000);
		page.locator(element).press("Enter");		

	}
	
	public String getproperty_PC_Data(String value) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config\\PC_TestData.properties"));
		Object object = properties.get(value);
		String key = (String) object;
		return key;

	}
	public void mousehover(String element) {
		page.locator(element).hover();

	}
	
	public void setText(String element,String value) {
		page.locator(element).click();
		page.locator(element).fill(value);
		page.locator(element).press("Enter");
       // page.keyboard().press("Enter");
	}
	
//	public void getdata() {
//        FileInputStream inputStream = new FileInputStream(new File(filePath));
//        Workbook workbook = new XSSFWorkbook(inputStream);
//
//	}

	
	public void login() throws FileNotFoundException, IOException {
		HomePage(page);
		loginPage = new LoginPage();
		 page.fill(loginPage.getUserName(),getproperty("userName"));
		 page.fill(loginPage.getPassword(),getproperty("password"));
		 page.click(loginPage.getLoginBtn());
	}
	
	public void accountCreation() throws FileNotFoundException, IOException {
		HomePage(page);
		accountCreation = new AccountCreation();
		page.click(accountCreation.getAction());
		page.click(accountCreation.getAccount_ceation());
		page.fill(accountCreation.getCompany_name(), getproperty_PC_Data("first_Name"));
		page.click(accountCreation.getSearch());
		page.click(accountCreation.getNew_account());
		page.click(accountCreation.getPerson());
		page.fill(accountCreation.getFirst_name(), getproperty_PC_Data("first_Name1"));
		page.fill(accountCreation.getLast_name(), getproperty_PC_Data("last_Name"));
		page.fill(accountCreation.getAddress1(), getproperty_PC_Data("address_1"));
		setText(accountCreation.getCity(), getproperty_PC_Data("city"));
		dropdown(accountCreation.getAddress_type(), getproperty_PC_Data("address_Type"));
		page.click(accountCreation.getOriganization());
		dropdown(accountCreation.getOriganization_type(), getproperty_PC_Data("origanization_type"));
		page.click(accountCreation.getSearch_origanization());
		page.click(accountCreation.getSelect_origanization());
		dropdown(accountCreation.getProducer_code(), getproperty_PC_Data("producer_Code"));
		page.click(accountCreation.getUpdate());
		String accNumber = page.locator(accountCreation.getGet_account_number()).textContent();
		System.out.println(accNumber);
		String accName = page.locator(accountCreation.getAccount_name()).textContent();
		System.out.println(accName);
		String accstatus = page.locator(accountCreation.getStatus()).textContent();
		System.out.println(accstatus);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
