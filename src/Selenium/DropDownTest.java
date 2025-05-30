package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownTest extends SelectClassUtility {
	
	public static void selectValues() {
		
		WebDriver driver;
		WebElement countryDropdown = driver.findElement(By.id("country"));
		
		SelectClassUtility.selectByVisibleText(countryDropdown, "India");
	
}
}