package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public static void hello(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/urajendran4/workspace/selenium/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.google.com";
		driver.get(url);
	}
	
	
}
