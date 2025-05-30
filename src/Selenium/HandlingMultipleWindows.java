package Selenium;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//*[contains(@href,'popups.php')]")).click();
        String mainWindow = driver.getWindowHandle(); //It will return parent window
        
     // Get all window handles
        Set<String> allWindows  = driver.getWindowHandles();
        for(String window: allWindows) {
        	if(!window.equals(mainWindow)) {
        		
        		driver.switchTo().window(window);
        		System.out.println("Switched to child window: " + driver.getTitle());
        		driver.close();
        	}
        	
        }
     // Switch back to parent
        driver.switchTo().window(mainWindow);
        System.out.println("Back to parent: " + driver.getTitle());
        driver.quit();
        
        
	}

}
