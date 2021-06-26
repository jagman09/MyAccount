package testCases;
import org.testng.annotations.Test;
import base.BaseClass;
import pageClass.AddToCart;
import pageClass.HomePage;
import pageClass.LoginPage;

public class AddToCartTest extends BaseClass {
	AddToCart ac;
	HomePage hp;
	LoginPage lp;

	@Test 
	public void verifyAddToCart() throws InterruptedException {
		hp = new HomePage(driver);
		hp.signInClick();
		lp= new LoginPage(driver);
		lp.enterUserName("jagman.jatt09@gmail.com");
		lp.enterPassword("automation");
		lp.clickSubmitLogin();
		ac = new AddToCart(driver);
		ac.clickDresses();
		ac.addToCart();
		Thread.sleep(8000);
	}
}
