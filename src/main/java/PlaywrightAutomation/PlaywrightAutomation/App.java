package PlaywrightAutomation.PlaywrightAutomation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class App 
{
    public static void main( String[] args )
    {
      
    	Playwright playwright = Playwright.create();
    	LaunchOptions launchOptions = new LaunchOptions();
    	launchOptions.setChannel("chrome");
    	launchOptions.setHeadless(false);
    	Browser browser = playwright.chromium().launch(launchOptions);
    	
    //	Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    	Page page = browser.newPage();
    	page.pause();
    	page.navigate("http://192.168.99.147:8080/cc/ClaimCenter.do");
    //	page.pause();
    	String title = page.title();
    	System.out.println(title);
    	String url = page.url();
    	System.out.println(url);
    	browser.close();
    	playwright.close();
    	
    }
}
