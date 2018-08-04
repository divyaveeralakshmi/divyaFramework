package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.Annotattion;
import wdMethods.SeMethods;

public class CreateLead extends Annotattion{

	@Test
	
    public void createlead() throws InterruptedException {
		
		
		WebElement elecreate = locateElement("linktext","Create Lead");
		click(elecreate);
		
		WebElement elecompanyname = locateElement("id","createLeadForm_companyName1");
		type(elecompanyname, "CGI India Pvt Ltd"); //divya change IBM to CGI
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname, "mathura");
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname, "meenakshisundaram"); //divya change lastname ganesh to ms
		WebElement elesource = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(elesource,"Direct Mail");
		WebElement elephoneno = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elephoneno, "9962066736");
		String sGetFirstName=getAttribute(elefirstname,"value");
		WebElement elesubmit = locateElement("class","smallSubmit");
		click(elesubmit);
		Thread.sleep(1000);
		WebElement eleverifyfirstname = locateElement("id","viewLead_firstName_sp");
		verifyExactText(eleverifyfirstname,sGetFirstName);
		
	}
	
}






