package stepDefinition;

import org.openqa.selenium.WebDriver;

import commonFIles.CommonFunctionality;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 

public class StepDefinition {
	public static WebDriver drv;

	@Given("Launch url {string} in a browser")
	public void launch_url_in_a_browser(String url) {
	  drv= CommonFunctionality.openBrowser(url);
	}
	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String LcType, String LctVal, String Value) {
	 
		CommonFunctionality.textFunction(LcType, LctVal, Value);
	}
	@When("Enter poassword with {string} and {string} and {string}")
	public void enter_poassword_with_and_and(String LcType, String LctVal, String Value) {
	  CommonFunctionality.textFunction(LcType, LctVal, Value);   
	}
	@When("Click on login button with  {string} and {string}")
	public void click_on_login_button_with_and(String LcType, String LctVal) {
	    CommonFunctionality.clickFunction(LcType,LctVal);
		
	}
	@Then("Validate title with {string}")
	public void validate_title_with(String ttl) throws Exception {
	  Thread.sleep(2000);
	  CommonFunctionality.titleFunction(ttl);
		
	}
	@When("Click on the link suppliers with {string} and {string}")
	public void click_on_the_link_suppliers_with_and(String LcType, String LcVal) throws Exception {
		Thread.sleep(2000);
	    CommonFunctionality.clickFunction(LcType,LcVal);
	}
	@When("Click on add icon with {string} and {string}")
	public void click_on_add_icon_with_and(String LcType, String LcVal) {
	   
		CommonFunctionality.clickFunction(LcType,LcVal);
	}
	@When("Capture Supplier Number with {string} ands {string}")
	public void capture_supplier_number_with_ands(String LcType, String LcVal) {
	    CommonFunctionality.supplierNumber(LcType, LcVal);
	}
	@When("Enter in {string}  with {string} and {string}")
	public void enter_in_with_and(String LcType, String LcVal, String val) throws Exception {
		Thread.sleep(2000);
	     CommonFunctionality.textFunction(LcType, LcVal, val);
			Thread.sleep(2000);

	}
	
	@When("Click on Add button with {string} and {string}")
	public void click_on_add_button_with_and(String LcType, String LcVal){
	    CommonFunctionality.clickFunction(LcType, LcVal);
		
	}
	@When("Click on Confirm   with {string} and {string}")
	public void click_on_confirm_with_and(String LcType, String LcVal) {
	   CommonFunctionality.clickFunction(LcType, LcVal);
	}
	@When("Click Alert Ok with {string} and {string}")
	public void click_alert_ok_with_and(String LcType, String LcVal) {
	   CommonFunctionality.clickFunction(LcType, LcVal);
	}
	@When("Click on search link with {string} and {string}")
	public void click_on_search_link_with_and(String LcType, String LcVal) {
	   CommonFunctionality.clickFunction(LcType, LcVal);
	}
	@Then("Validate supplier table")
	public void validate_supplier_table() throws Exception {
	    CommonFunctionality.validateSupp();
	}
	@When("Close the broweser")
	public void close_the_broweser() {
	 drv.quit();
	}



}
