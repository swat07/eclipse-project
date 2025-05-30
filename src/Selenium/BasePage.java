package Selenium;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {

	WebDriver driver;
	Properties prop;

	public WebDriver init_driver(Properties prop) {
		WebDriver driver;
		Properties prop;

	public WebDriver init_driver(Properties prop)
	{
		String browser = prop.getProperty("browser");

		if(browser.equals("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}else if(browser.equals("firefox"))
		{

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		else
		{
			System.out.println("Please provide a proper browser value..");
		}

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));

		return driver;
	}

	public Properties init_properties()
	{
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("Properties file path");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e)
		{
			e.printStackTrace();
		}

		return prop;


	}
}



}
