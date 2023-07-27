package com.actitime.generic;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
public class Baseclass {
public static  WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		Reporter.log("Openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest 
	public void closeBrowser() {
		Reporter.log("closebrowser",true);
		driver.close();
	}
@BeforeMethod
public void Login() {
	Reporter.log("login",true);
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login '] "));
	
}
}
