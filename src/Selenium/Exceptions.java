package Selenium;

public class Exceptions {
//Top Common Selenium Exceptions and How to Handle Them:
	
//Exception	Description	Handling Strategy========
	
//NoSuchElementException	Occurs when an element is not found on the page.	✅ Use WebDriverWait (Explicit Wait)
//✅ Validate element presence with isDisplayed() or findElements().size() > 0

//ElementNotInteractableException	Element is present but not clickable or visible.	✅ Use WebDriverWait with ExpectedConditions.elementToBeClickable()

//TimeoutException	WebDriver waits too long for a condition to be met.	✅ Adjust timeout value
//✅ Use proper wait conditions (visibility, clickable, etc.)

//StaleElementReferenceException	DOM has changed, and the previously found element is no longer valid.	✅ Re-locate the element just before interacting
//✅ Use try-catch with retry logic

}
