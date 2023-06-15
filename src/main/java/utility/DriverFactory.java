package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public void init()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreea\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		
		driver=new ChromeDriver();
	}

}
