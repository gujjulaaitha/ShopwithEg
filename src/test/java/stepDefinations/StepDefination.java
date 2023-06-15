package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.LoginPage;
import utility.DriverFactory;

public class StepDefination extends DriverFactory{
	

	LandingPage landingPage=new LandingPage(driver);
	LoginPage loginPage=new LoginPage(driver);
	
	@Given("user launches shopwitheg site")
	public void user_launches_shopwitheg_site() {

		
		driver.get("https://stg.shopwitheg.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		landingPage.clickLoginButton();
		loginPage.enterEmail("selenium.livetrainings@gmail.com");
		loginPage.enterPassword("Welcome@12");
	    
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickSignInButton();
	}

	@Then("user will be navigated to landing page")
	public void user_will_be_navigated_to_landing_page() {
	    
	}
	
	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
		landingPage.clickLoginButton();
		loginPage.enterEmail("kjasjfhdkjsad@gmail.com");
		loginPage.enterPassword("lkkjsdffl");
	}

	@Then("user will be displayed with error message")
	public void user_will_be_displayed_with_error_message() {
		
		
	}
	   

}
