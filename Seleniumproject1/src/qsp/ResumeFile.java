package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeFile {
public static void main(String[] args) throws InterruptedException {
	WebDriver  driver=new ChromeDriver();
	driver.get("file:///C:/Users/Samanth/OneDrive/Desktop/Nokari.html");
	Thread.sleep(4000);
	 File f = new File("./data/SAMANTH K_RESUME.docx");
	 String abpath = f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(abpath);
}
}
