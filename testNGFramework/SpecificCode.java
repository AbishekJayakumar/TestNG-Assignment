package testNGFramework;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SpecificCode {
	
	public RemoteWebDriver driver;
 
	@BeforeMethod
	public void preCondition() {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		

	}
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}

}
