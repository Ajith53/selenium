package Selenium.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class NykaaTest {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Welcome\\eclipse-workspace\\selenium\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.nykaa.com/");
		Actions a = new Actions(driver);
		Robot r = new Robot();

		WebElement entry = driver.findElement(By.xpath("//a[text()='mom & baby']"));
		a.moveToElement(entry).build().perform();

		WebElement bay_powder = driver.findElement(By.linkText("Baby Powder"));
		bay_powder.click();
		Thread.sleep(5000);
		Set<String> firstWin = driver.getWindowHandles();
		System.out.println(firstWin);

		for (String handels1 : firstWin) {
			System.out.println(handels1);
			driver.switchTo().window(handels1);

		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,400)");
		WebElement himalaya = driver.findElement(By.xpath("//div[text()='Himalaya Baby Powder']"));
		himalaya.click();
		Thread.sleep(3000);

		Set<String> secWin = driver.getWindowHandles();
		for (String handles2 : secWin) {
			System.out.println(secWin);
			driver.switchTo().window(handles2);

		}
		// driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']")).click();

		// select[@title='SIZE']

		WebElement size = driver.findElement(By.xpath("//select[@title='SIZE']"));
		size.click();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement proceed = driver.findElement(By.xpath("(//span[@class='btn-text'])[1]"));
		proceed.click();
		Thread.sleep(5000);
		WebElement add_tobag = driver.findElement(By.xpath("(//div[@class='css-0 e1ewpqpu1'])"));
		add_tobag.click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@class='css-acpm4k'])")));
		WebElement quantity = driver.findElement(By.xpath("//img[@alt='Image'][1]"));
		quantity.click();
		Thread.sleep(3000);
		WebElement increase_quantity = driver.findElement(By.xpath("(//div[@class='css-m37lhi'])[3]"));
		increase_quantity.click();
		Thread.sleep(3000);
		WebElement order_now = driver.findElement(By.xpath("(//div[@class='css-15vhhhd e25lf6d4'])"));
		order_now.click();
		WebElement login = driver.findElement(By.xpath("(//button[@class='css-v61n2j e8tshxd0'])"));
		login.click();
		WebElement email_id = driver.findElement(By.xpath("//input[@type='email']"));
		email_id.click();
		WebElement mobile_no = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		mobile_no.sendKeys("7845924330");

		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		Scanner sc = new Scanner(System.in);
		String sb = sc.nextLine();
		System.out.println(sb);
		WebElement otp = driver.findElement(By.xpath("//input[@type='number']"));
		otp.sendKeys(sb);
		System.out.println(sb);

		WebElement verify = driver.findElement(By.xpath("//button[@type='submit']"));
		verify.click();
		WebElement delevery_add = driver.findElement(By.xpath("(//button[@class='css-n7wnfc e8tshxd0'])"));
		delevery_add.click();
		Thread.sleep(5000);
		// String cn=sc.nextLine();
		// System.out.println(cn);
		WebElement card_number = driver.findElement(By.xpath("(//input[@label='Card Number'])"));
		card_number.sendKeys("4263 9826 4026 9299"); 
																											// 4263982640269299"
		Thread.sleep(5000);
		WebElement Exp_date = driver.findElement(By.xpath("(//input[@type='tel'])[2]"));
		Exp_date.sendKeys("0426");
		Thread.sleep(7000);
		WebElement cvv = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cvv.sendKeys("738");
		WebElement pay = driver.findElement(By.xpath("(//button[@class='css-v61n2j e8tshxd0'])"));
		pay.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='css-v61n2j e8tshxd0'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='css-1iwzqhf emgaj5l0'])")).click();
		driver.findElement(By.xpath("(//img[@alt='Image'])[23]")).click();
		driver.findElement(By.xpath("//p[@class='css-z7wmhp eka6zu20']")).click();
		driver.findElement(By.xpath("(//span[@class='css-175whwo ehes2bo0'])[2]")).click();
		driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])")).click();
		// driver.quit();

         //	WebElement goin = driver.findElement(By.xpath("//button[@kind='secondary'][1]"));
		// goin.click();
		// Thread.sleep(3000);
        //	WebElement num = driver.findElement(By.xpath("//input[@name='emailMobile']"));
		// Thread.sleep(3000);
		// num.sendKeys("7845924330");

		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.wait(3000);
        //	driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
