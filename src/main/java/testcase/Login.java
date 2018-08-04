package testcase;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() throws InterruptedException {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		Thread.sleep(1000);
		WebElement elelinkclick= locateElement("linktext","CRM/SFA");
		click(elelinkclick);
		Thread.sleep(1000);
		WebElement elemenuclick= locateElement("linktext","Create Lead");
		click(elemenuclick);
		Thread.sleep(1000);
		WebElement elecompanyname = locateElement("createLeadForm_companyName");
		type(elecompanyname, "CGI");
		WebElement elefirstname = locateElement("createLeadForm_firstName");
		type(elefirstname, "Divya");
	
		//System.out.println("given input "+sGetFirstName);
		WebElement elelastname = locateElement("createLeadForm_lastName");
		type(elelastname, "Meenakshisundaram");
		
		WebElement elesourceselect= locateElement("createLeadForm_dataSourceId");
		selectDropDownUsingText(elesourceselect,"Existing Customer");
		
		WebElement eleindustryselect= locateElement("createLeadForm_industryEnumId");
		selectDropDownUsingText(eleindustryselect,"Computer Software");
		
		WebElement eleownershipselect= locateElement("createLeadForm_ownershipEnumId");
		selectDropDownUsingText(eleownershipselect,"Partnership");
		
		WebElement elemarketingselect= locateElement("createLeadForm_marketingCampaignId");
		selectDropDownUsingText(elemarketingselect,"Road and Track");
		
		String sGetFirstName=getAttribute(elefirstname);
		WebElement elebuttonclick= locateElement("class","smallSubmit");
		
		click(elebuttonclick);
		Thread.sleep(1000);
		//WebElement eleVerifyfirstname= locateElement("viewLead_firstName_sp");
		//String sVerifyFirstName=getText(eleVerifyfirstname);
		//System.out.println("The Available value "+sVerifyFirstName);
		WebElement eleVerifyExactText= locateElement("viewLead_firstName_sp");
		verifyExactText(eleVerifyExactText,sGetFirstName);
		
		
		
		
		
		
		
	}
	
}






