package utill_flipkart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class navigate_flipkart_homepage {
	
	WebDriver driver;
	@Test
	public void flipkart_login() {
		try {
			System.setProperty("webdriver.chrome.driver","D:\\jee-oxygen\\Browsers\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
			driver.get("http://www.flipkart.com");
			test("vishnu160787@gmail.com","jyoti2003");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void test(String username,String password) {
		try {
			driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
			//driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

