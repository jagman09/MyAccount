package base;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExtentManager;

public class BaseClass {
	public static Actions action =null;
	public static WebDriver driver;
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	
	
	@BeforeSuite
	public static void init() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagma\\eclipse-workspace\\MyAccount\\src\\test\\resources\\browserexe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
	

}
