package stepDefinition;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.Subscribtions;
public class Test_Steps {

	private static WebDriver driver;

	Subscribtions sub=new Subscribtions(driver);
@Given("User in subscribtions page")
public void user_in_subscribtions_page() {
	driver = new ChromeDriver();
	driver.get("https://subscribe.stctv.com/sa-en");
	driver.manage().window().maximize();
	System.out.print("chrome open \n");   
}
@When("Subscribtions page loaded successfully")
public void subscribtions_page_loaded_successfully() {
	Assert.assertTrue(driver.getTitle().contains("stc"));
	System.out.print("assertion done \n");

}
@Then("Validate tarrif for ksa")
public void user_select_ksa_country() throws Exception {
	Thread.sleep(2000);
	sub.Validate_KSA();  
}
@Then("Validate tarrif for kw")
public void validate_packages_types() {
	sub.Validate_KW();
}
@Then("Validate tarrif for bh")
public void validate_packagaes_prices() {
sub.Validate_BH();   
}
@Then("Close driver")
public void close_driver() {
driver.close();   
}



}
