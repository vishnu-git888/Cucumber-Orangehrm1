package orangehrm.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.pageobjectmanager.PageObjectManager;

public class AddEmployee_Page {
	public static WebDriver driver;
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pim;
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addEmployee;
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleName;
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebtn;
	
	public WebElement getPim() {
		return pim;
	}
	public WebElement getAddEmployee() {
		return addEmployee;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getMiddleName() {
		return middleName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public AddEmployee_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	

}
