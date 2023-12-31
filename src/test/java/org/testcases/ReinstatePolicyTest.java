package org.testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.baseclass.BassClass;
import org.pomclass.NewSubmissionPA;
import org.pomclass.PolicyCancelPage;
import org.pomclass.ReinstatePolicyPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReinstatePolicyTest extends BassClass {

	PolicyCancelPage cancel;
	NewSubmissionPA panewSubmission;
	ReinstatePolicyPage reinstatePolicyPage;
	
	@BeforeClass
	public void LanchApplication() throws FileNotFoundException, IOException {
			lanchBrowser("chrome");
			context = browser.newContext();
			page = context.newPage();
			page.navigate(getproperty("pc_url"));
		}
	@Test(priority = 0)
	public void new_Submission_PA() throws FileNotFoundException, IOException {
			login();
			accountCreation();
			HomePage(page);
			panewSubmission = new NewSubmissionPA();
			page.click(panewSubmission.getActions());
			page.click(panewSubmission.getNew_Submission());
			page.click(panewSubmission.getPersonal_Auto());
			dropdown(panewSubmission.getOffering_Selection(),getproperty_PC_Data("offering"));
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getNext());
			dropdown(panewSubmission.getTerm_Type(),getproperty_PC_Data("term_Type"));
			//page.click(panewSubmission.getNext());
			page.click(panewSubmission.getAdd_Drvier());
			page.click(panewSubmission.getNewPerson_Driver());
			page.fill(panewSubmission.getFirst_Name(),getproperty_PC_Data("first_Name1"));
			page.fill(panewSubmission.getLast_Name(),getproperty_PC_Data("last_Name"));
			page.fill(panewSubmission.getDateOfBirth(),getproperty_PC_Data("dateOfBirth"));
			page.fill(panewSubmission.getAddressOne(),getproperty_PC_Data("address_1"));
			page.fill(panewSubmission.getCity(),getproperty_PC_Data("city"));
			dropdown(panewSubmission.getAddress_Type(),getproperty_PC_Data("address_Type"));
			page.fill(panewSubmission.getLicense_No(),getproperty_PC_Data("license"));
			dropdown(panewSubmission.getLicense_State_Driver(),getproperty_PC_Data("license_State"));
			page.click(panewSubmission.getOk_Driver());
			page.click(panewSubmission.getRoles());
			page.fill(panewSubmission.getYear_licensed(),getproperty_PC_Data("year_First_Licensed"));
			page.click(panewSubmission.getNoOfAccidents_Policy());
			page.click(panewSubmission.getValue0());
			page.click(panewSubmission.getNoOfAccidents_Account());
			page.click(panewSubmission.getValue0());
			page.click(panewSubmission.getNoOfVoilations_Policy());
			page.click(panewSubmission.getValue0());
			page.click(panewSubmission.getNoOfVoilations_Account());
			page.click(panewSubmission.getValue0());
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getCreate_Vehicle());
			dropdown(panewSubmission.getVehicle_Type(),getproperty_PC_Data("vehicle_Type"));
			setText(panewSubmission.getVIN(), getproperty_PC_Data("VIN"));
			//page.fill(panewSubmission.getVIN(),getproperty_PC_Data("VIN"));
			//page.locator(panewSubmission.getVIN()).press("Enter");
			setText(panewSubmission.getCost_New(),getproperty_PC_Data("cost"));
			dropdown(panewSubmission.getLicense_State_Vehicle(),getproperty_PC_Data("license_State"));
			//page.fill(panewSubmission.getCost_New(),getproperty_PC_Data("cost"));
			page.click(panewSubmission.getAdd_Assign_Driver());
			page.click(panewSubmission.getAdd_Driver_Assign());
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getQuote());
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getNext());
			page.click(panewSubmission.getBind_Options());
			page.click(panewSubmission.getIssue_Policy());
			page.click(panewSubmission.getWarning_Message_Ok());
			page.waitForTimeout(3000);
			String tittle_Bar_Status = page.locator(panewSubmission.getTittle_Bar_Status()).textContent();
			assertEquals(tittle_Bar_Status,getproperty_PC_Data("title_Bar_Status"));
//			page.screenshot(new Page.ScreenshotOptions()
//				      .setPath(Paths.get("screenshot.png")));
			page.click(panewSubmission.getView_Your_Policy());
			String policyNumber = page.locator(panewSubmission.getPolicy_Number()).textContent();
			System.out.println("Policy Number is " + policyNumber);
			String pol_EffectiveDate = page.locator(panewSubmission.getEffective_Date()).textContent();
			String pol_ExpiryDate = page.locator(panewSubmission.getExpiry_Date()).textContent();
			page.click(panewSubmission.getPolicy_Transactions());
			String pol_Current_Status = page.locator(panewSubmission.getPolicy_Current_Status()).textContent();
			assertEquals(pol_Current_Status,getproperty_PC_Data("pol_Status"));
			
		}
	
	
	@Test(priority = 1)
	public void policy_Cancel() throws FileNotFoundException, IOException {	
		HomePage(page);
		cancel = new PolicyCancelPage();
		page.click(cancel.getActions());		
		page.click(cancel.getCancel_Policy());	
		dropdown(cancel.getSource(), getproperty_PC_Data("source"));
		dropdown(cancel.getReason(), getproperty_PC_Data("reason"));
		setText(cancel.getReason_Description(), getproperty_PC_Data("reason_Description"));
		page.click(cancel.getStart_CancellationBtn());
		page.click(cancel.getBind_Option());
		page.click(cancel.getCancel_Now());
		page.click(cancel.getWarning_Message_Ok());
		page.waitForTimeout(3000);
		String tittle_Bar_Status = page.locator(cancel.getTittle_Bar_Status()).textContent();
		System.out.println("Transaction Status is "+ tittle_Bar_Status);
		assertEquals(tittle_Bar_Status,getproperty_PC_Data("title_Cancel_Status"));
		page.click(cancel.getView_Your_Policy());
		String policyNumber = page.locator(cancel.getPolicy_Number()).textContent();
		System.out.println("Policy Number is " + policyNumber);
		page.click(cancel.getPolicy_Transactions());
		String pol_Current_Status = page.locator(cancel.getPolicy_Current_Status()).textContent();
		System.out.println("Policy Current Status is "+ pol_Current_Status);
		assertEquals(pol_Current_Status,getproperty_PC_Data("pol_Cancel_Status"));
		

	}
	
	@Test(priority = 2)
	public void reinstatePolicy() throws FileNotFoundException, IOException {
		
		HomePage(page);
		reinstatePolicyPage = new ReinstatePolicyPage();
		page.locator(reinstatePolicyPage.getActions()).click();
		page.locator(reinstatePolicyPage.getReinstate_Policy()).click();
		dropdown(reinstatePolicyPage.getReason(), getproperty_PC_Data("reinstate_Reason"));
		page.keyboard().press("Tab");
		setText(reinstatePolicyPage.getReason_Description(), getproperty_PC_Data("reinstate_Reason_Description"));
		page.locator(reinstatePolicyPage.getQuote()).click();
		page.locator(reinstatePolicyPage.getNext()).click();
		page.locator(reinstatePolicyPage.getReinstateBtn()).click();
		page.locator(reinstatePolicyPage.getWarning_Message_Ok()).click();
		page.locator(reinstatePolicyPage.getWarning_Message_Ok()).click();
		page.waitForTimeout(3000);
		String tittle_Bar_Status = page.locator(cancel.getTittle_Bar_Status()).textContent();
		System.out.println("Transaction Status is "+ tittle_Bar_Status);
		assertEquals(tittle_Bar_Status,getproperty_PC_Data("title_Reinstate_Status"));
		page.click(reinstatePolicyPage.getView_Your_Policy());
		String policyNumber = page.locator(cancel.getPolicy_Number()).textContent();
		System.out.println("Policy Number is " + policyNumber);
		page.click(reinstatePolicyPage.getPolicy_Transactions());
		String pol_Current_Status = page.locator(reinstatePolicyPage.getPolicy_Current_Status()).textContent();
		System.out.println("Policy Current Status is "+ pol_Current_Status);
		assertEquals(pol_Current_Status,getproperty_PC_Data("pol_Reinstate_Status"));
	
		
	}
	
	
	
	
	
}
