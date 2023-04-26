package Selenium.Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTest {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		TakesScreenshot Screenshot=(TakesScreenshot) driver;
	
		File scr=Screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Welcome\\eclipse-workspace\\selenium\\Screenshot\\sec.png");
		FileHandler.copy(scr, dest);
		
	}

}
