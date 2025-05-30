package Selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpConnectTimeoutException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {
	
	public static void validateBrokenLinks(WebDriver driver) {
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			if(url == null || url.isEmpty() || url.startsWith("javascript")) {
				continue;
			}
			try {
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("Head");
			connection.connect();
			int respCode = connection.getResponseCode();
			if(respCode >= 400) {
				System.out.println("Broken link:" +respCode);
			}
			else {
				System.out.println("Valid link:" +respCode);
			}
			}
			catch(Exception e) {
				System.out.println("Exception for Url:" +e.getMessage());
			}
			
		}
//		Step-by-Step Approach:
//			Use Selenium to get all <a> tags.
//			Extract the href attribute for each.
//			Send HTTP request using HttpURLConnection.
//			Check status code:
//			200 → OK
//			404, 500, etc. → Broken
	}

}
