package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	public CheckoutPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.XPATH, using = "//input[@title='billingemail']") 
	private WebElement txtbx_Email;
	
	@FindBy(how = How.XPATH, using = "//input[@title='billingfirstname']") 
	private WebElement txtbx_FirstName;
	
	@FindBy(how = How.XPATH, using = "//input[@title='billinglastname']") 
	private WebElement txtbx_LastName;
	
	@FindBy(how = How.XPATH, using = "//input[@title='billingphone']") 
	private WebElement txtbx_Phone;
	
	@FindBy(how = How.XPATH, using = "//select[@title='billingcountry']") 
	private WebElement drpdwn_CountryDropDownArrow;
	
	@FindAll(@FindBy(how = How.XPATH, using = "//select[@title='billingcountry']/option"))
	private List<WebElement> country_List;	
	
	@FindBy(how = How.XPATH, using = "//input[@title='billingcity']") 
	private WebElement txtbx_City;
	
	@FindBy(how = How.XPATH, using = "//textarea[@title='billingaddress']") 
	private WebElement txtbx_Address;
	
	@FindBy(how = How.XPATH, using = "//input[@title='billingpostcode']") 
	private WebElement txtbx_PostCode;
	
	@FindBy(how = How.XPATH, using = "//input[@title='billingstate']") 
	private WebElement txtbx_BState;
	
	
	@FindBy(how = How.XPATH, using = "//input[@title='shippingstate']") 
	private WebElement txtbx_SState;
	
	@FindBy(how = How.XPATH, using = "//input[@name='shippingSameBilling']") 
	private WebElement chkbx_ShipToSameAddress;
	
	@FindAll(@FindBy(how = How.XPATH, using = "ul.wc_payment_methods li"))
	private List<WebElement> paymentMethod_List;	
	
	@FindBy(how = How.XPATH, using = "#terms.input-checkbox") 
	private WebElement chkbx_AcceptTermsAndCondition;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Purchase']") 
	private WebElement btn_PlaceOrder;
	public void enter_Email(String email) {
		txtbx_Email.sendKeys(email);
	}
	
	public void enter_Name(String name) {
		txtbx_FirstName.sendKeys(name);
	}
	
	public void enter_LastName(String lastName) {
		txtbx_LastName.sendKeys(lastName);
	}
 
	public void enter_Phone(String phone) {
		txtbx_Phone.sendKeys(phone);
	}
	public void enter_BState(String state) {
		txtbx_BState.sendKeys(state);
	}
	
	public void enter_SState(String state) {
		txtbx_SState.sendKeys(state);
	}
	
	public void enter_City(String city) {
		txtbx_City.sendKeys(city);
	}
	
	public void enter_Address(String address) {
		txtbx_Address.sendKeys(address);
	}
	
	public void enter_PostCode(String postCode) {
		txtbx_PostCode.sendKeys(postCode);
	}
	
	public void check_ShipToDifferentAddress(boolean value) {
		if(!value) chkbx_ShipToSameAddress.click();
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
	}
	
	public void select_Country(String countryName) {
Select select=new Select(drpdwn_CountryDropDownArrow);
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
		select.selectByVisibleText(countryName);

		/*for(WebElement country : country_List){
			if(country.getText().equals(countryName)) {
				country.click();	
				try { Thread.sleep(3000);}
				catch (InterruptedException e) {}
				break;
			}
		}*/
	}
	
	/*public void select_County(String countyName) {
		drpdwn_CountyDropDownArrow.click();
		try { Thread.sleep(2000);}
		catch (InterruptedException e) {}
 
		for(WebElement county : country_List){
			if(county.getText().equals(countyName)) {
				county.click();	
				try { Thread.sleep(3000);}
				catch (InterruptedException e) {}
				break;
			}
		}
	}*/
	
	public void select_PaymentMethod(String paymentMethod) {
		if(paymentMethod.equals("CheckPayment")) {
			paymentMethod_List.get(0).click();
		}else if(paymentMethod.equals("Cash")) {
			paymentMethod_List.get(1).click();
		}else {
			new Exception("Payment Method not recognised : " + paymentMethod);
		}
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
		
	}
	
	public void check_TermsAndCondition(boolean value) {
		if(value) chkbx_AcceptTermsAndCondition.click();
	}
	
	public void clickOn_PlaceOrder() {
		btn_PlaceOrder.submit();
	}
	
	
	public void fill_PersonalDetails() {
		enter_Email("automation1@gmail.com");
		enter_Name("Automation");
		enter_LastName("Test");
		enter_Address("Shalimar Bagh");
		enter_City("Pune");
		enter_BState("Maharashtra");
		select_Country("India");
		enter_PostCode("110088");
		enter_Phone("0000000000");
		enter_SState("Maharashtra");

		
		
	}
 
}
