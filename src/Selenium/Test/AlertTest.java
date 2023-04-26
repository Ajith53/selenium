package Selenium.Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertTest {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Welcome\\eclipse-workspace\\selenium\\drive\\chromedriver.exe");
	
	ChromeOptions ch=new ChromeOptions();
	ch.addArguments("incognito");
	
	WebDriver driver=new ChromeDriver(ch); 
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("alertButton")).click();

Alert simple_alert = driver.switchTo().alert();
Thread.sleep(5000);
simple_alert.accept();
Thread.sleep(3000);

WebElement confirm_popup = driver.findElement(By.id("confirmButton"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();",confirm_popup );
confirm_popup.click();

Alert confirm_alert = driver.switchTo().alert();
Thread.sleep(3000);
confirm_alert.dismiss();
Thread.sleep(3000);

driver.findElement(By.id("promtButton")).click();
Alert prompt_alert = driver.switchTo().alert();
Thread.sleep(3000);
prompt_alert.sendKeys("JAVA");

System.out.println(prompt_alert.getText());

prompt_alert.accept();
Thread.sleep(3000);
driver.close();
}
}
