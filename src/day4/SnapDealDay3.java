package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealDay3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	chrome.manage().window().maximize();
	chrome.get("https://www.snapdeal.com/");
	WebElement btnSignin = chrome.findElement(By.xpath("//span[text()='Sign In']"));
	btnSignin.click();
	WebElement btnRegister = chrome.findElement(By.xpath("//span[text()='Register']"));
	btnRegister.click();
	chrome.switchTo().frame("loginIframe");
	WebElement loginNumber  = chrome.findElement(By.xpath("//input[@name='username']"));
	loginNumber.sendKeys("9791268599");
}
}
