package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	// Browser Launch
	public static WebDriver browser_Launch(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
	}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();			
		}
		return driver;
		}
	//URL
	public static void get_Url(String url) {
		driver.get(url);
	}
	//get Text
	public static void get_Text(WebElement element,String value) {
		value=element.getText();
	}
	public static void get_Attribute(WebElement element,String value, String attribute) {
		value=element.getAttribute(attribute);
	
	}
	
	//get Title
	public static void get_Title(String title) {
		 title=driver.getTitle();
		 System.out.println(title);
	}
	//get Page source
	public static void get_PageSource(String pageSource) {
		pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
	// get Current URL
	public static void get_CurrentUrl(String CurrentUrl) {
		CurrentUrl=driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	}
	//click
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	//Click
	public static void clear(WebElement element) {
		element.clear();
	}
	//Send keys
	public static void inputOnElement(WebElement element, String value) {
		element.sendKeys(value);
	}
	//Close
	public static void close() {
		driver.close();
	}
	//Quite
	public static void quite() {
		driver.quit();
	}
	//Navigating 
	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}
	public static void navigate_Forward() {
		driver.navigate().forward();
	}
	public static void navigate_Backward() {
		driver.navigate().back();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	//Handling Drop downs
	//Select
	public static void select_ByValue(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}	
	public static void select_ByIndex(WebElement element,int value) {
		Select select=new Select(element);
		select.selectByIndex(value);
	}
	public static void select_ByVisibleText(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByVisibleText(value);
	}
	//Deselect
	public static void deselect_All(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}	
	public static void deselect_ByValue(WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}	
	public static void deselect_ByIndex(WebElement element,int value) {
		Select select=new Select(element);
		select.deselectByIndex(value);
	}
	public static void deselect_ByVisibleText(WebElement element, String value) {
		Select select=new Select(element);
		select.deselectByVisibleText(value);
	}
	
	//is Displayed
	public static void is_Displayed(WebElement element, boolean output) {
		
		output=element.isDisplayed();
	}
	public static void is_Selected(WebElement element,boolean output) {
		output=element.isSelected();
	}
	public static void is_Enabled(WebElement element,boolean output) {
		output=element.isEnabled();
	}
	//Alert															
	public static void alert_Dismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void alert_Accept() {
		driver.switchTo().alert().accept();
	}
	public static void alert_getText() {
		driver.switchTo().alert().getText();
	}
	public static void alert_sendKeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	//Wait
	
	public static void implicitly_Wait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	//Screen Shot
	
	public static File getScreenShot(String FileName) {
		Date d = new Date();
		System.out.println(d);
		FileName = "ScreenShot"+d.toString().replace(":", "_").replace(" ", "_") + ".png";
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile=new File("E:\\eclipse-workspace\\Orangehrm\\target"+FileName);
        try {
			FileHandler.copy(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return DestFile;
	}
}
