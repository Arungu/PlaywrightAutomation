package org.Testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.BaseClass.BassClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;

public class AccountCreation extends BassClass {
	@BeforeTest
	public void LanchApplication() throws FileNotFoundException, IOException {
		lanchBrowser("chrome");
		context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1280, 720));
		page = context.newPage();
		page.navigate(getproperty("pc_url"));
	
	}
	@Test
	public void accountCreationPC() throws FileNotFoundException, IOException {
		
		login();
		
		accountCreation();

	}
	

}
