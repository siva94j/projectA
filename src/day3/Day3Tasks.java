package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Tasks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	chrome.manage().window().maximize();
	chrome.get("http://www.greenstechnologys.com/");
	WebElement contactus = chrome.findElement(By.xpath("//a[@href='contact.php']"));
	contactus.click();
	WebElement name = chrome.findElement(By.xpath("//input[@name='name']"));
	name.sendKeys("Siva");
	WebElement email = chrome.findElement(By.xpath("//input[@name='email']"));
	email.sendKeys("siva94j@gmail.com");
	WebElement phone = chrome.findElement(By.xpath("//input[@name='phone']"));
	phone.sendKeys("9791268599");
	chrome.get("https://www.redbus.in/");
	WebElement signlogo = chrome.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
	signlogo.click();
	WebElement signlink = chrome.findElement(By.xpath("//li[@id='signInLink']"));
	signlink.click();
	chrome.switchTo().frame(chrome.findElement(By.className("modalIframe")));
	WebElement mobile = chrome.findElement(By.xpath("//input[@id='mobileNoInp']"));
	mobile.sendKeys("9791268599");
}
}
