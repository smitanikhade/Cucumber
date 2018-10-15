package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {


	WebDriver driver;
	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.CSS, using = ".wpsc_buy_button") 
	private WebElement btn_AddToCart;

	@FindAll(@FindBy(how = How.XPATH, using = "//div[@class='article-wrap']/article//div[@class='title-container']//a"
			+ "a"))
	private List<WebElement> prd_List;	

	public void clickOn_AddToCart() {
		btn_AddToCart.click();
	}

	public void select_Product(String productNumber) {
		driver.findElement(By.xpath("//div[@class='article-wrap']/article/div[2]//a[contains(@title,'"+productNumber+"')]")).click();
		//prd_List.get(productNumber).click();
	}
	public String getProductName(int productNumber) {
		return prd_List.get(productNumber).getText();
	}

}
