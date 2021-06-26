package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class AddAddress extends BasePage {

	public AddAddress(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Add a new address")
	public WebElement btnAddAddress;
	
	public void clickBtnAddAddress() {
		btnAddAddress.click();
	}
	@FindBy(id ="firstname" )
	public WebElement txtBoxFname;
	
	@FindBy(id ="lastname" )
	public WebElement txtBoxLname;
	
	@FindBy(id ="company" )
	public WebElement txtBoxCompany;
	
	@FindBy(id ="address1" )
	public WebElement txtBoxAddress1;
	
	@FindBy(id ="city" )
	public WebElement txtBoxCity;
	
	@FindBy(id="id_state")
	public WebElement dropDownState;
	 
	 
	@FindBy(id ="postcode" )
	public WebElement txtBoxPostalcode;
	
	@FindBy(id ="id_country")
	public WebElement dropDownCountry;
	  
	  
	@FindBy(id ="phone" )
	public WebElement txtBoxPhone;
		
	@FindBy(id ="other" )
	public WebElement txtBoxAdditionalInfo;
		
	@FindBy(id ="alias" )
	public WebElement txtBoxTitle;
		
	@FindBy(id ="submitAddress" )
	public WebElement btnSave;
	 
	 
	 public void enterAddress() {
		 txtBoxFname.sendKeys("abc");
		 txtBoxLname.sendKeys("xyz");
		 txtBoxCompany.sendKeys("Automation Testing");
		 txtBoxAddress1.sendKeys("123 street");
		 txtBoxCity.sendKeys("Surrey");
		 Select state= new Select(dropDownState);
		 state.selectByVisibleText("Alaska");
		 txtBoxPostalcode.sendKeys("12345");
		 Select country = new Select(dropDownCountry);
		 country.selectByVisibleText("United States");
		 txtBoxPhone.sendKeys("123456789");
		 txtBoxAdditionalInfo.sendKeys("address");
		 txtBoxTitle.sendKeys("second Address");
		 btnSave.click();
		 
		 
	 }
	 
	

}
