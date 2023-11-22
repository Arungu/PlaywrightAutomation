package PlaywrightAutomation.PlaywrightAutomation;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class First {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
//		      page.getByLabel("User name").click();
//		      page.getByLabel("User name").click();
//		      page.getByLabel("User name").fill("exp_test");
//		      page.getByLabel("Password").click();
//		      page.getByLabel("Password").fill("exp_test");
//		      page.locator("a").filter(new Locator.FilterOptions().setHasText("Log In")).click();
//		      page.locator("a").filter(new Locator.FilterOptions().setHasText("Claim")).click();
//		      page.locator("[id=\"Claim\\:ClaimMenuActions\"]").click();
//		      page.getByRole(AriaRole.MENUITEM, new Page.GetByRoleOptions().setName("Assign Claim")).click();
//		      page.getByRole(AriaRole.CELL, new Page.GetByRoleOptions().setName("Find a user or group:").setExact(true)).getByLabel("").click();
//		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Search")).click();
//		      page.locator("[id=\"AssignClaimsPopup\\:AssignmentPopupScreen\\:AssignmentUserLV\\:1\\:_Select\"]").click();
		    }

	}

}
