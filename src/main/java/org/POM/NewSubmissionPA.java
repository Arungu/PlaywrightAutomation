package org.POM;

public class NewSubmissionPA {
	
	private String actions="//*[@id='AccountFile:AccountFileMenuActions-btnEl']";
	private String new_Submission="//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission-itemEl']";
	private String personal_Auto="//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:6:addSubmission']";
	private String offering_Selection="//*[@id='SubmissionWizard:OfferingScreen:OfferingSelection-inputEl']";
	private String next="//*[@id='SubmissionWizard:Next-btnInnerEl']";
	private String term_Type="//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:TermType-inputEl']";
	private String add_Drvier="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver-btnInnerEl']";
	private String newPerson_Driver="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver:0:ContactType-textEl']";
	private String first_Name="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']";
	private String last_Name="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']";
	private String dateOfBirth="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl']";
	private String addressOne="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
	private String city ="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']";
	private String address_Type="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:AddressType-inputEl']";
	private String License_No="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseNumber-inputEl']";
	private String license_State_Driver="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:NewPolicyContactRoleDetailsCV:PolicyContactDetailsDV:LicenseInputSet:LicenseState-inputEl']";
	private String ok_Driver="//*[@id='NewPolicyDriverPopup:ContactDetailScreen:Update-btnInnerEl']";
	private String roles="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:RolesCardTab-btnInnerEl']";
	private String year_licensed="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:PolicyDriverInfoDV:yearlicensed-inputEl']";
	private String noOfAccidents_Account="(//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:2-body']//tr)[1]//td[3]";
	private String noOfAccidents_Policy="(//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:2-body']//tr)[1]//td[2]";
	private String noOfVoilations_Account="(//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:2-body']//tr)[2]//td[3]";
	private String noOfVoilations_Policy="(//div[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:0:PolicyContactRolePanelSet:2-body']//tr)[2]//td[2]";
	private String value0="(//li[contains(text(),'0') and not(contains(@id,\"ext-element\"))])[1]";
	private String create_Vehicle="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']";
	private String vehicle_Type="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Type_DV-inputEl']";
	private String VIN="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Vin_DV-inputEl']";
	private String license_State_Vehicle="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicenseState_DV-inputEl']";
	private String cost_New="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:CostNew_DV-inputEl']";
	private String add_Assign_Driver="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver-btnInnerEl']";
	private String add_Driver_Assign="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_AssignDriversDV:DriverPctLV_tb:AddDriver:0:Driver-textEl']";
	private String auto_Liability_Package="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:0:CoverageInputSet:CovPatternInputGroup:LiabilityTermInput-inputEl']";
	private String medical_Limit="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:1:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']";
	private String uninsured_Motorist_BI_Limits="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:2:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:PackageTermInput-inputEl']";
	private String uninsured_Motorist_Property_Damage_Limit="//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PersonalAuto_AllVehicleCoveragesDV:PALiabCategoryIterator:3:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']";
	private String quote="//*[@id='SubmissionWizard:SubmissionWizard_PolicyReviewScreen:JobWizardToolbarButtonSet:QuoteOrReview-btnInnerEl']";
	private String bind_Options="//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:BindOptions-btnInnerEl']";
	private String issue_Policy="//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:BindOptions:BindAndIssue-textEl']";
	private String bind_Only="//*[@id='SubmissionWizard:SubmissionWizard_PaymentScreen:JobWizardBillingToolbarButtonSet:BindOptions:BindOnly-itemEl']";
	private String warning_Message_Ok="//*[text()='OK']";
	private String tittle_Bar_Status="//*[@id='JobComplete:JobCompleteScreen:ttlBar']";
	private String policy_Number="//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:PolicyNumber-inputEl']";
	private String view_Your_Policy="//*[@id='JobComplete:JobCompleteScreen:JobCompleteDV:ViewPolicy-inputEl']";
	private String product_Name="//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_PolicyDV:Product-inputEl']";
	private String effective_Date="//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerEffDate-inputEl']";
	private String expiry_Date="//*[@id='PolicyFile_Summary:Policy_SummaryScreen:Policy_Summary_DatesDV:PolicyPerExpirDate-inputEl']";
	private String policy_Transactions="//*[@id='PolicyFile:MenuLinks:PolicyFile_PolicyFile_Jobs']";
	private String policy_Current_Status="//div[@id='PolicyFile_Jobs/DetailsTitleCard']//table//table[1]//tr//td[5]//div";
	
	public String getActions() {
		return actions;
	}
	public void setActions(String actions) {
		this.actions = actions;
	}
	public String getNew_Submission() {
		return new_Submission;
	}
	public void setNew_Submission(String new_Submission) {
		this.new_Submission = new_Submission;
	}
	public String getPersonal_Auto() {
		return personal_Auto;
	}
	public void setPersonal_Auto(String personal_Auto) {
		this.personal_Auto = personal_Auto;
	}
	public String getOffering_Selection() {
		return offering_Selection;
	}
	public void setOffering_Selection(String offering_Selection) {
		this.offering_Selection = offering_Selection;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getTerm_Type() {
		return term_Type;
	}
	public void setTerm_Type(String term_Type) {
		this.term_Type = term_Type;
	}
	public String getAdd_Drvier() {
		return add_Drvier;
	}
	public void setAdd_Drvier(String add_Drvier) {
		this.add_Drvier = add_Drvier;
	}
	public String getNewPerson_Driver() {
		return newPerson_Driver;
	}
	public void setNewPerson_Driver(String newPerson_Driver) {
		this.newPerson_Driver = newPerson_Driver;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}	
	public String getAddress_Type() {
		return address_Type;
	}
	public void setAddress_Type(String address_Type) {
		this.address_Type = address_Type;
	}
	public String getLicense_No() {
		return License_No;
	}
	public void setLicense_No(String license_No) {
		License_No = license_No;
	}
	public String getLicense_State_Driver() {
		return license_State_Driver;
	}
	public void setLicense_State_Driver(String license_State_Driver) {
		this.license_State_Driver = license_State_Driver;
	}
	public String getOk_Driver() {
		return ok_Driver;
	}
	public void setOk_Driver(String ok_Driver) {
		this.ok_Driver = ok_Driver;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getYear_licensed() {
		return year_licensed;
	}
	public void setYear_licensed(String year_licensed) {
		this.year_licensed = year_licensed;
	}
	public String getNoOfAccidents_Account() {
		return noOfAccidents_Account;
	}
	public void setNoOfAccidents_Account(String noOfAccidents_Account) {
		this.noOfAccidents_Account = noOfAccidents_Account;
	}
	public String getNoOfAccidents_Policy() {
		return noOfAccidents_Policy;
	}
	public void setNoOfAccidents_Policy(String noOfAccidents_Policy) {
		this.noOfAccidents_Policy = noOfAccidents_Policy;
	}
	public String getNoOfVoilations_Account() {
		return noOfVoilations_Account;
	}
	public void setNoOfVoilations_Account(String noOfVoilations_Account) {
		this.noOfVoilations_Account = noOfVoilations_Account;
	}
	public String getNoOfVoilations_Policy() {
		return noOfVoilations_Policy;
	}
	public void setNoOfVoilations_Policy(String noOfVoilations_Policy) {
		this.noOfVoilations_Policy = noOfVoilations_Policy;
	}
	public String getValue0() {
		return value0;
	}
	public void setValue0(String value0) {
		this.value0 = value0;
	}
	public String getCreate_Vehicle() {
		return create_Vehicle;
	}
	public void setCreate_Vehicle(String create_Vehicle) {
		this.create_Vehicle = create_Vehicle;
	}
	public String getVehicle_Type() {
		return vehicle_Type;
	}
	public void setVehicle_Type(String vehicle_Type) {
		this.vehicle_Type = vehicle_Type;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getLicense_State_Vehicle() {
		return license_State_Vehicle;
	}
	public void setLicense_State_Vehicle(String license_State_Vehicle) {
		this.license_State_Vehicle = license_State_Vehicle;
	}
	public String getCost_New() {
		return cost_New;
	}
	public void setCost_New(String cost_New) {
		this.cost_New = cost_New;
	}
	public String getAdd_Assign_Driver() {
		return add_Assign_Driver;
	}
	public void setAdd_Assign_Driver(String add_Assign_Driver) {
		this.add_Assign_Driver = add_Assign_Driver;
	}
	public String getAdd_Driver_Assign() {
		return add_Driver_Assign;
	}
	public void setAdd_Driver_Assign(String add_Driver_Assign) {
		this.add_Driver_Assign = add_Driver_Assign;
	}
	public String getAuto_Liability_Package() {
		return auto_Liability_Package;
	}
	public void setAuto_Liability_Package(String auto_Liability_Package) {
		this.auto_Liability_Package = auto_Liability_Package;
	}
	public String getMedical_Limit() {
		return medical_Limit;
	}
	public void setMedical_Limit(String medical_Limit) {
		this.medical_Limit = medical_Limit;
	}
	public String getUninsured_Motorist_BI_Limits() {
		return uninsured_Motorist_BI_Limits;
	}
	public void setUninsured_Motorist_BI_Limits(String uninsured_Motorist_BI_Limits) {
		this.uninsured_Motorist_BI_Limits = uninsured_Motorist_BI_Limits;
	}
	public String getUninsured_Motorist_Property_Damage_Limit() {
		return uninsured_Motorist_Property_Damage_Limit;
	}
	public void setUninsured_Motorist_Property_Damage_Limit(String uninsured_Motorist_Property_Damage_Limit) {
		this.uninsured_Motorist_Property_Damage_Limit = uninsured_Motorist_Property_Damage_Limit;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getBind_Options() {
		return bind_Options;
	}
	public void setBind_Options(String bind_Options) {
		this.bind_Options = bind_Options;
	}
	public String getIssue_Policy() {
		return issue_Policy;
	}
	public void setIssue_Policy(String issue_Policy) {
		this.issue_Policy = issue_Policy;
	}
	public String getBind_Only() {
		return bind_Only;
	}
	public void setBind_Only(String bind_Only) {
		this.bind_Only = bind_Only;
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
	public String getPolicy_Number() {
		return policy_Number;
	}
	public void setPolicy_Number(String policy_Number) {
		this.policy_Number = policy_Number;
	}
	public String getView_Your_Policy() {
		return view_Your_Policy;
	}
	public void setView_Your_Policy(String view_Your_Policy) {
		this.view_Your_Policy = view_Your_Policy;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getEffective_Date() {
		return effective_Date;
	}
	public void setEffective_Date(String effective_Date) {
		this.effective_Date = effective_Date;
	}
	public String getExpiry_Date() {
		return expiry_Date;
	}
	public void setExpiry_Date(String expiry_Date) {
		this.expiry_Date = expiry_Date;
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
