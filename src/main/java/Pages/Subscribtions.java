package Pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscribtions {
	   WebDriver driver; 
	// Pass WebDriver as an input to a the constructor 
	   public Subscribtions( WebDriver driver ) { 
	     this.driver = driver; 
	// Call initElements() method by using PageFactory reference and pass driver and this as parameters. 
	    PageFactory.initElements( driver, this); 
	   } 
// Locate Element
	   @FindBy (id="country-btn")
	   WebElement country_list;
	   
	   
	   @FindBy (xpath="//*[@id=\"bh\"]")
	   WebElement bh_country;
	   
	   @FindBy (xpath="//*[@id=\"sa\"]")
	   WebElement sa_country;
	   
	   @FindBy (xpath="//*[@id=\"kw\"]")
	   WebElement kw_country;
	   
	   @FindBy(className="plan-title")
	   WebElement Plan;
	   
	   @FindBy(id="name-lite")
	   WebElement lite_plan;
	   
	   @FindBy(id="name-classic")
	   WebElement classic_plan;
	   
	   @FindBy(id="name-premium")
	   WebElement premium_plan;
	   
	   @FindBy(xpath="//*[@id=\"currency-lite\"]/b")
	   WebElement lite_price;
	   
	   @FindBy(xpath="//*[@id=\"currency-classic\"]/b")
	   WebElement classic_price;
	   
	   @FindBy(xpath="//*[@id=\"currency-premium\"]/b")
	   WebElement premium_price;
	   
	   @FindBy(xpath="//*[@id=\"currency-lite\"]/i/text()[1]")
	   WebElement currency;
	   
public void Validate_KSA()
{
	country_list.click();
	sa_country.click();
	Assert.assertEquals("LITE", lite_plan.getText());
	Assert.assertEquals("15", lite_price.getText());
	Assert.assertEquals("CLASSIC", classic_plan.getText());
	Assert.assertEquals("25", classic_price.getText());
	Assert.assertEquals("PREMIUM", premium_plan.getText());
	Assert.assertEquals("60", premium_price.getText());
	Assert.assertEquals("SAR", currency.getText());
}
	
public void Validate_KW()
{
	country_list.click();
	kw_country.click();
	Assert.assertEquals("LITE", lite_plan.getText());
	Assert.assertEquals("1.2", lite_price.getText());
	Assert.assertEquals("CLASSIC", classic_plan.getText());
	Assert.assertEquals("2.5", classic_price.getText());
	Assert.assertEquals("PREMIUM", premium_plan.getText());
	Assert.assertEquals("4.8", premium_price.getText());
	Assert.assertEquals("KWD", currency.getText());
}

public void Validate_BH()
{
	country_list.click();
	bh_country.click();
	Assert.assertEquals("LITE", lite_plan.getText());
	Assert.assertEquals("2", lite_price.getText());
	Assert.assertEquals("CLASSIC", classic_plan.getText());
	Assert.assertEquals("3", classic_price.getText());
	Assert.assertEquals("PREMIUM", premium_plan.getText());
	Assert.assertEquals("4.8", premium_price.getText());
	Assert.assertEquals("BHD", currency.getText());
}
	   	
}
