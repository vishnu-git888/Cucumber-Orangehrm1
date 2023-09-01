package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;
import com.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orangehrm.pageobjectmanager.PageObjectManager;

public class StepDefinition extends BaseClass  {
	public static WebDriver driver=TestRunner.driver;
	public static PageObjectManager pom=new PageObjectManager(driver);

	@Given("^User Launch The URL$")
	public void user_Launch_The_URL() throws Throwable {
	    get_Url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		implicitly_Wait(2000);
	   inputOnElement(pom.getLp().getUsername(), "Admin");
	}

	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputOnElement(pom.getLp().getPassword(), "admin123");
	}

	@Then("^User Cick On The Loing Button And It Navigate Home Page$")
	public void user_Cick_On_The_Loing_Button_And_It_Navigate_Home_Page() throws Throwable {
	    clickOnElement(pom.getLp().getLoginbtn());
	}

	
}
