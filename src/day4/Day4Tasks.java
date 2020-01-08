package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day4Tasks {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	chrome.manage().window().maximize();
	chrome.get("http://www.google.com/");
	WebElement query = chrome.findElement(By.xpath("//input[@name='q']"));
	query.sendKeys("greens velmurugan");
	query.sendKeys(Keys.RETURN);
	WebElement firstlink = chrome.findElement(By.xpath("(//div[@class='g'])[1]//span"));
	firstlink.click();
	chrome.get("http://www.greenstechnologys.com");
	WebElement review = chrome.findElement(By.xpath("//div[@class='box']/h2"));
	System.out.println(review.getText());
	WebDriverWait wait = new WebDriverWait(chrome, 10);
	chrome.get("https://www.snapdeal.com/");
	for (int i = 1; i < 3; i++) {
		String xpath = "(//a[@class='product-card dp-widget-link'])["+ i +"]";
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement item = chrome.findElement(By.xpath(xpath));
		String url = item.getAttribute("href");
		chrome.get(url);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='add-cart-button-id']")));
		WebElement addtoCart = chrome.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		addtoCart.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Snapdeal']")));
		WebElement home = chrome.findElement(By.xpath("//img[@title='Snapdeal']"));
		if(i<2)
			home.click();
		chrome.switchTo().activeElement();
	}
	chrome.switchTo().activeElement();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']")));
	WebElement cartlink = chrome.findElement(By.xpath("//i[@class='sd-icon sd-icon-cart-icon-white-2']"));
	cartlink.click();
	chrome.switchTo().activeElement();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='rfloat']")));
	WebElement total_price = chrome.findElement(By.xpath("//span[@class='rfloat']"));
	System.out.println("Cart Value is:" + total_price.getText() );
}
}
