package com.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//featureFile",
glue = "com.stepdefinition")
public class TestRunner extends BaseClass  {
	public static WebDriver driver;
	
	@BeforeClass 
	public static void set_Up() {
		 driver= browser_Launch("Chrome");

	}
	
	@AfterClass
	public static void tear_Down() {
		quite();
	}

}
