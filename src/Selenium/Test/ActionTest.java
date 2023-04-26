package Selenium.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\selenium\\drive\\chromedriver.exe");
		ChromeOptions ch = new ChromeOptions();
		WebDriver driver =new ChromeDriver();
	String currentUrl = driver.getCurrentUrl();
	
	}

}
