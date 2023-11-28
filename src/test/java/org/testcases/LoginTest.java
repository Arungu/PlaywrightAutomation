package org.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.baseclass.BassClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BassClass{
	
	@BeforeTest
	public void LanchApplication() throws FileNotFoundException, IOException {
		lanchBrowser("chrome");
		context = browser.newContext();
		page = context.newPage();
		page.navigate(getproperty("pc_url"));
	}
	@Test
	public void loginpage() throws FileNotFoundException, IOException {
		
		login();

	}

}
