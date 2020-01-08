package Day1;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GetBrowser {
public static void main(String[] args) {
	List <String> urllist1 = new ArrayList<String>();
	List <String> urllist2 = new ArrayList<String>();
	List <String> urllist3 = new ArrayList<String>();
	urllist1.add("http://www.greenstechnologys.com/");
	urllist1.add("https://www.facebook.com/");
	urllist1.add("https://www.amazon.in");
	urllist1.add("http://www.greenstechnologys.com/selenium-course-content.html");
	urllist2.add("http://www.greenstechnologys.com/");
	urllist2.add("http://gmail.com/");
	urllist2.add("http://www.flipkart.com/");
	urllist2.add("http://www.greenstechnologys.com/selenium-course-content.html");
	urllist3.add("http://www.greenstechnologys.com/");
	urllist3.add("http://demo.automationtesting.in/Register.html");
	urllist3.add("http://www.greenstechnologys.com/selenium-course-content.html");
	System.setProperty("webdriver.chrome.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\chromedriver.exe");
	WebDriver chrome = new ChromeDriver();
	System.setProperty("webdriver.gecko.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\geckodriver.exe");
	WebDriver firefox = new FirefoxDriver();
	System.setProperty("webdriver.ie.driver", "D:\\MyProjects\\LearningJava\\SeleniumDay1\\driver\\IEDriverServer.exe");
	WebDriver ie = new InternetExplorerDriver();
	for (int i =0; i<urllist1.size();i++) {
		chrome.get(urllist1.get(i));
	}
	chrome.close();
	for (int i =0; i<urllist1.size();i++) {
		firefox.get(urllist2.get(i));
	}
	firefox.close();
	for (int i =0; i<urllist1.size();i++) {
		ie.get(urllist3.get(i));
	}
	ie.close();
}
}
