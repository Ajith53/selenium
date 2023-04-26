package Selenium.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserLanch {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\selenium\\drive\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/search?gs_ssp=eJzj4tLP1TfIyK1MKy5TYDRgdGDw4khLTE5Nys_PBgBmYAfL&q=facebook&oq=fac&aqs=chrome.1.69i57j46i131i199i433i465i512j0i131i433i457i512j0i131i402i433i512j0i402j0i131i433i512l2j5.36229j0j4&sourceid=chrome&ie=UTF-8");
	driver.getTitle();
	System.out.println(driver.getTitle());
	Thread.sleep(3000);
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(3000);
	driver.navigate().to("www.facebook.com");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.close();
	
	
	
	}

}

