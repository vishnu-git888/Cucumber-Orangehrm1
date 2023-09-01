package orangehrm.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.pageobjectmanager.PageObjectManager;

public class SearchEmp_Page {
	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Employee List']")
	private WebElement empList;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement empId;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchbtn;
	
	public WebElement getEmpList() {
		return empList;
	}
	public WebElement getEmpId() {
		return empId;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public SearchEmp_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
}
