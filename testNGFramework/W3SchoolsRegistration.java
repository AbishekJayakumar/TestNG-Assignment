package testNGFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class W3SchoolsRegistration extends SpecificCode {
	
	@DataProvider(name="getData")
	public String[][] fetchData() throws IOException{
		return TestdataFromExcel.testData();
		
	}

	@Test(dataProvider="getData")
	public void registration(String fName, String email, String address, String city, String zip, String state, String cName, String CNum,
			String expMonth, String cvv, String expYear) {
		
		driver.switchTo().frame("iframeResult");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver; 
		jse.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.id("fname")).sendKeys(fName);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("adr")).sendKeys(address);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zip")).sendKeys(zip);
		driver.findElement(By.id("state")).sendKeys(state);
		
		jse.executeScript("window.scrollBy(500,0)");
		driver.findElement(By.id("cname")).sendKeys(cName);
		driver.findElement(By.id("ccnum")).sendKeys(CNum);
		driver.findElement(By.id("expmonth")).sendKeys(expMonth);
		driver.findElement(By.id("cvv")).sendKeys(cvv);
		driver.findElement(By.id("expyear")).sendKeys(expYear);
		
		
		
		

	}

}
