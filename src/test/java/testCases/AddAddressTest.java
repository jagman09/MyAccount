package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import okhttp3.Address;
import pageClass.AddToCart;
import pageClass.Addresses;
import pageClass.HomePage;
import pageClass.LoginPage;
import pageClass.MyAccount;
import pageClass.AddAddress;

public class AddAddressTest extends BaseClass {
	HomePage hp;
	LoginPage lp;
	MyAccount ma;
	Addresses ad;
	AddAddress aad;

	@Test 
	public void verifyAddAddress() throws InterruptedException {
		hp = new HomePage(driver);
		hp.signInClick();
		lp= new LoginPage(driver);
		lp.enterUserName("jagman.jatt09@gmail.com");
		lp.enterPassword("automation");
		lp.clickSubmitLogin();
		ad = new Addresses(driver);
		ad.addAddress();
		aad =new AddAddress(driver);
		aad.clickBtnAddAddress();
		Thread.sleep(8000);
		aad.enterAddress();
	}
	

}
