package orangehrm.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import orangehrm.pageobjectmanager.PageObjectManager;


public class Login_Page {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public Login_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
}
