package Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("ajith");
		
		
		
		String s="java";
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
	WebElement forgot_pass = driver.findElement(By.linkText("Forgotten password?"));
	String text=forgot_pass .getText();
	System.out.println(text);
	forgot_pass.click();
		
		
		
		
		
		
		
		
	}

}
