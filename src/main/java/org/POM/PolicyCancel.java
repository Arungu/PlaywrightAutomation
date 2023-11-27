package org.POM;

public class PolicyCancel {
	
	private String actions="//*[@id='PolicyFile:PolicyFileMenuActions-btnInnerEl']";
	private String cancel_Policy="//*[@id='PolicyFile:PolicyFileMenuActions:PolicyFileMenuActions_NewWorkOrder:PolicyFileMenuActions_CancelPolicy-textEl']";
	private String source="//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Source-inputEl']";
	private String reason="//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:Reason-inputEl']";
	private String reason_Description="//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:ReasonDescription-inputEl']";
	private String refund_Method="//*[@id='StartCancellation:StartCancellationScreen:CancelPolicyDV:CalcMethod-inputEl']";
	private String start_CancellationBtn="//*[@id='StartCancellation:StartCancellationScreen:NewCancellation-btnInnerEl']";
	private String bind_Option="//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions-btnInnerEl']";
	private String cancel_Now="//*[@id='CancellationWizard:CancellationWizard_QuoteScreen:JobWizardToolbarButtonSet:BindOptions:CancelNow-textEl']";
	private String warning_Message_Ok="//*[text()='OK']";
	private String tittle_Bar_Status="//*[@id='JobComplete:JobCompleteScreen:ttlBar']";
	private String view_Your_Policy="//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']";
	private String policy_Transactions="//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']";
	private String policy_Current_Status="//div[@id='PolicyFile_Jobs/DetailsTitleCard']//table//table[1]//tr//td[5]//div";
	
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public String getCancel_Policy() {
		return cancel_Policy;
	}
	public void setCancel_Policy(String cancel_Policy) {
		this.cancel_Policy = cancel_Policy;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
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
	public String getRefund_Method() {
		return refund_Method;
	}
	public void setRefund_Method(String refund_Method) {
		this.refund_Method = refund_Method;
	}
	public String getStart_CancellationBtn() {
		return start_CancellationBtn;
	}
	public void setStart_CancellationBtn(String start_CancellationBtn) {
		this.start_CancellationBtn = start_CancellationBtn;
	}
	public String getBind_Option() {
		return bind_Option;
	}
	public void setBind_Option(String bind_Option) {
		this.bind_Option = bind_Option;
	}
	public String getCancel_Now() {
		return cancel_Now;
	}
	public void setCancel_Now(String cancel_Now) {
		this.cancel_Now = cancel_Now;
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
