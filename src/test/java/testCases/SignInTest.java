package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

import base.BaseClass;
import pageClass.HomePage;
import pageClass.LoginPage;
import pageClass.MyAccount;

public class SignInTest extends BaseClass{
	
	HomePage hp;
	LoginPage lp;
	MyAccount ma;
@Test 
public void verifyLogin() {
	test = report.startTest("Verify Login Test started");
	hp = new HomePage (driver);
	test.log(LogStatus.INFO, "Clicked Signin button");
	hp.signInClick();
	test.log(LogStatus.INFO, "Entered Username and Password");
	lp = new LoginPage(driver);
	lp.enterUserName("jagman.jatt09@gmail.com");
	lp.enterPassword("automation");
	test.log(LogStatus.INFO, "Click Submit button");
	lp.clickSubmitLogin(); 
	String expectedTitle= "My account - My Store";
	String actualTitle=driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	test.log(LogStatus.INFO, "verify Login Test completed");

	
}

/*
 * @AfterMethod public void tearDown() { driver.quit();
 * 
 * 
 * }
 */



}
