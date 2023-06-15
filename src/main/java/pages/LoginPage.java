package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class LoginPage extends DriverFactory{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	public WebElement emailTextbox;
	
	@FindBy(name="password")
	public WebElement passwordTextbox;
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signInButton;
	
	public void enterEmail(String email)
	{
		emailTextbox.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		passwordTextbox.sendKeys(password);
	}

	public void clickSignInButton()
	{
		signInButton.click();
	}
}
