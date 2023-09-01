package orangehrm.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import orangehrm.POM.AddEmployee_Page;
import orangehrm.POM.Login_Page;
import orangehrm.POM.SearchEmp_Page;

public class PageObjectManager {
	public static WebDriver driver;
	private Login_Page lp;
	private AddEmployee_Page AddEmp;
	private SearchEmp_Page SrchEmp;
	
	public Login_Page getLp() {
		lp=new Login_Page(driver);
		return lp;
	}
	public AddEmployee_Page getAddEmp() {
		AddEmp=new AddEmployee_Page(driver);
		return AddEmp;
	}
	public SearchEmp_Page getSrchEmp() {
		SrchEmp=new SearchEmp_Page(driver);
		return SrchEmp;
	}
	public PageObjectManager(WebDriver driver1) {
		this.driver=driver1;
	}

}
