package org.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.baseclass.BassClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hooks extends BassClass{
	@BeforeMethod
	public void LanchApplication() throws FileNotFoundException, IOException {
		lanchBrowser("chrome");
		context = browser.newContext();
		page = context.newPage();
		page.navigate(getproperty("pc_url"));
	}
	
	
	@AfterMethod
	public void closeBrowser() {
	   // page.context().browser().close();
		browser.close();

	}
	
}
