package Cleartrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement select=web.findElement(By.id("autocomplete"));
		select.clear();
		select.sendKeys("ind");
		Thread.sleep(5000);
		select.sendKeys(Keys.ARROW_DOWN);
		select.sendKeys(Keys.ARROW_DOWN);
		select.sendKeys(Keys.ENTER);
		if(select.getAttribute("value").equalsIgnoreCase("india")) {
			System.out.println("correct text is selected");
		}
		else
			System.out.println("invalid text");
		

	}

}
