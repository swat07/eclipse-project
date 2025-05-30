package Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClassUtility {
	
	public static void selectByVisibleText(WebElement dropdownElement , String visibleText) {
		Select select = new Select(dropdownElement);
		select.selectByVisibleText(visibleText);
		
	}
	
	public static void selectByIndex(WebElement dropdownElement , int index) {
		Select select = new Select(dropdownElement);
		select.selectByIndex(index);
	}
	
	public static void selectByValue(WebElement dropdownElement, String value) {
		Select select = new Select(dropdownElement);
		select.selectByValue(value);
	}
	
	
}
