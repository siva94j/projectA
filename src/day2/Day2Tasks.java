package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Tasks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	chrome.get("https://www.facebook.com");
	WebElement email = chrome.findElement(By.id("email"));
	email.sendKeys("siva94j");
	WebElement pass = chrome.findElement(By.id("pass"));
	pass.sendKeys("password");
	WebElement loginbtn = chrome.findElement(By.id("loginbutton"));
	loginbtn.click();
	chrome.get("https://www.redbus.in/");
	WebElement from = chrome.findElement(By.id("src"));
	from.sendKeys("Chennai");
	WebElement dest = chrome.findElement(By.id("dest"));
	dest.sendKeys("Tirunelveli");
	chrome.get("https://www.google.com/");
	WebElement search = chrome.findElement(By.name("q"));
	search.sendKeys("GreensTechnology");
	chrome.get("https://infinity.icicibank.com/corp/Login.jsp");
	WebElement username = chrome.findElement(By.id("DUMMY1"));
	username.click();
	WebElement og_usrname = chrome.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
	og_usrname.sendKeys("siva94j");
	WebElement password = chrome.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	password.sendKeys("password");
	chrome.get("https://netbanking.hdfcbank.com/");
	chrome.switchTo().frame(chrome.findElement(By.name("login_page")));
	WebElement hd_usrname = chrome.findElement(By.name("fldLoginUserId"));
	hd_usrname.sendKeys("siva94j");
	WebElement hd_submit = chrome.findElement(By.cssSelector("img[src='/gif/continue_new1.gif?v=1']"));
	hd_submit.click();
	chrome.switchTo().defaultContent();
	chrome.switchTo().frame(chrome.findElement(By.name("login_page")));
//	WebElement hd_password = chrome.findElement(By.xpath("//input[@name='fldPassword']")); This is throwing exception even after switching, maybe should wait for the page?
//	hd_password.sendKeys("password");
	chrome.get("https://www.swiggy.com/");
	WebElement location = chrome.findElement(By.id("location"));
	location.sendKeys("Velacherry");
	chrome.get("https://www.snapdeal.com/login");
	WebElement snap_username = chrome.findElement(By.id("userName"));
	snap_username.sendKeys("siva94j");
	
}
}
