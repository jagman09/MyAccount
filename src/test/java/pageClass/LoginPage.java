package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	WebDriver driver;
	
	@FindBy(id= "email")
	public WebElement txtBoxUsername;
	
	@FindBy(id="passwd")
	public WebElement txtBoxPassword;
	
	@FindBy(id="SubmitLogin")
	public WebElement btnSubmitLogin;

	public void enterUserName(String uname) {
		txtBoxUsername.sendKeys(uname);
		
	}
	
	public void enterPassword(String pword) {
		txtBoxPassword.sendKeys(pword);
		
	}
	
	public void clickSubmitLogin() {
		btnSubmitLogin.click();
		
}

}
