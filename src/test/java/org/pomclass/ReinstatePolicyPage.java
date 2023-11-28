package org.pomclass;

public class ReinstatePolicyPage {
	
	private String actions="//*[@id='AccountFile:AccountFileMenuActions-btnEl']";
	private String reinstate_Policy="//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_ReinstatePolicy-textEl']";
	private String reason="//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonCode-inputEl']";
	private String reason_Description="//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:ReinstatePolicyDV:ReasonDescription-inputEl']";
	private String quote="//*[@id='ReinstatementWizard:ReinstatementWizard_ReinstatePolicyScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']";
	private String next="//*[@id='ReinstatementWizard:Next-btnInnerEl']";
	private String reinstateBtn="//*[@id='ReinstatementWizard:ReinstatementWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:Reinstate-btnInnerEl']";
	private String warning_Message_Ok="//*[text()='OK']";
	private String tittle_Bar_Status="//*[@id='JobComplete:JobCompleteScreen:ttlBar']";
	private String view_Your_Policy="//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']";
	private String policy_Number="//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl']";
	private String policy_Transactions="//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']";
	private String policy_Current_Status="//div[@id='PolicyFile_Jobs/DetailsTitleCard']//table//table[1]//tr//td[5]//div";
	
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public String getReinstate_Policy() {
		return reinstate_Policy;
	}
	public void setReinstate_Policy(String reinstate_Policy) {
		this.reinstate_Policy = reinstate_Policy;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason_Description() {
		return reason_Description;
	}
	public void setReason_Description(String reason_Description) {
		this.reason_Description = reason_Description;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getReinstateBtn() {
		return reinstateBtn;
	}
	public void setReinstateBtn(String reinstateBtn) {
		this.reinstateBtn = reinstateBtn;
	}
	public String getWarning_Message_Ok() {
		return warning_Message_Ok;
	}
	public void setWarning_Message_Ok(String warning_Message_Ok) {
		this.warning_Message_Ok = warning_Message_Ok;
	}
	public String getTittle_Bar_Status() {
		return tittle_Bar_Status;
	}
	public void setTittle_Bar_Status(String tittle_Bar_Status) {
		this.tittle_Bar_Status = tittle_Bar_Status;
	}
	public String getView_Your_Policy() {
		return view_Your_Policy;
	}
	public void setView_Your_Policy(String view_Your_Policy) {
		this.view_Your_Policy = view_Your_Policy;
	}
	public String getPolicy_Number() {
		return policy_Number;
	}
	public void setPolicy_Number(String policy_Number) {
		this.policy_Number = policy_Number;
	}
	public String getPolicy_Transactions() {
		return policy_Transactions;
	}
	public void setPolicy_Transactions(String policy_Transactions) {
		this.policy_Transactions = policy_Transactions;
	}
	public String getPolicy_Current_Status() {
		return policy_Current_Status;
	}
	public void setPolicy_Current_Status(String policy_Current_Status) {
		this.policy_Current_Status = policy_Current_Status;
	}
	

}
