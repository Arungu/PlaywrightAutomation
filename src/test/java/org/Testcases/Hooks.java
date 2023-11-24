package org.Testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.BaseClass.BassClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hooks extends BassClass{
	@BeforeTest
	public void LanchApplication() throws FileNotFoundException, IOException {
		lanchBrowser("chrome");
		context = browser.newContext();
		page = context.newPage();
		page.navigate(getproperty("pc_url"));
	}
	
	
	@AfterTest
	public void closeBrowser() {
	   // page.context().browser().close();
		browser.close();

	}
	
}
