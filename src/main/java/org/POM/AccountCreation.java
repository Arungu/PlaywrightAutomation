package org.POM;

public class AccountCreation {
	
	private String action= "//*[@id='Desktop:DesktopMenuActions-btnEl']";
	private String account_ceation= "//*[@id='Desktop:DesktopMenuActions:DesktopMenuActions_Create:DesktopMenuActions_NewAccount-textEl']";
	private String company_name= "//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:GlobalContactNameInputSet:Name-inputEl']";
	private String search= "//*[@id='NewAccount:NewAccountScreen:NewAccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']";
	private String new_account= "//*[@id='NewAccount:NewAccountScreen:NewAccountButton-btnInnerEl']";
	private String person= "//*[@id='NewAccount:NewAccountScreen:NewAccountButton:NewAccount_Person-itemEl']";
	private String first_name= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:FirstName-inputEl']";
	private String last_name= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:CreateAccountContactInputSet:GlobalPersonNameInputSet:LastName-inputEl']";
	private String address1= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']";
	private String city= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City-inputEl']";
	private String postcode= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']";
	private String address_type= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:AddressType-inputEl']";
	private String origanization= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:Producer:SelectOrganization']";
	private String origanization_type= "//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:Type-inputEl']";
	private String search_origanization= "//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']";
	private String select_origanization= "//*[@id='OrganizationSearchPopup:OrganizationSearchPopupScreen:OrganizationSearchResultsLV:0:_Select']";
	private String producer_code= "//*[@id='CreateAccount:CreateAccountScreen:CreateAccountDV:ProducerSelectionInputSet:ProducerCode-inputEl']";
	private String update= "//*[@id='CreateAccount:CreateAccountScreen:Update-btnInnerEl']";
	private String account_name= "//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:Name-inputEl']";
	private String Get_account_number= "//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-inputEl']";
	private String status= "//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountStatus-inputEl']";
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAccount_ceation() {
		return account_ceation;
	}
	public void setAccount_ceation(String account_ceation) {
		this.account_ceation = account_ceation;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getNew_account() {
		return new_account;
	}
	public void setNew_account(String new_account) {
		this.new_account = new_account;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;

	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public String getOriganization() {
		return origanization;
	}
	public void setOriganization(String origanization) {
		this.origanization = origanization;
	}
	public String getOriganization_type() {
		return origanization_type;
	}
	public void setOriganization_type(String origanization_type) {
		this.origanization_type = origanization_type;
	}
	public String getSearch_origanization() {
		return search_origanization;
	}
	public void setSearch_origanization(String search_origanization) {
		this.search_origanization = search_origanization;
	}
	public String getSelect_origanization() {
		return select_origanization;
	}
	public void setSelect_origanization(String select_origanization) {
		this.select_origanization = select_origanization;
	}
	public String getProducer_code() {
		return producer_code;
	}
	public void setProducer_code(String producer_code) {
		this.producer_code = producer_code;
	}
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getGet_account_number() {
		return Get_account_number;
	}
	public void setGet_account_number(String get_account_number) {
		Get_account_number = get_account_number;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
