package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://");
		 driver.manage().window().maximize();
		 
		 WebElement usName = driver.findElement(By.id("username"));
		 usName.sendKeys("Swati");
		 WebElement psName = driver.findElement(By.className("pswd"));
		 psName.sendKeys("pswd");
		 WebElement login = driver.findElement(By.id("loginbtn"));
		 login.click();
		 
		 String expText = "Dashboard";
		 String actualtext = driver.getTitle();
		 if(actualtext.equals(expText)) {
			 System.out.println("Login successfully.");
		 }
		 else {
			 System.out.println("Login Failed");
		 }
		 driver.quit();
		 
		 
		 
	 }

}
	