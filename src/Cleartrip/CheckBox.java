package Cleartrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://rahulshettyacademy.com/AutomationPractice/");
		//WebElement element=web.findElement(By.id("checkBoxOption1"));
		/*
		 * element.click(); System.out.println(element.isSelected());
		 * 
		 * element.click(); System.out.println(element.isSelected());
		 */
		List<WebElement> element=web.findElements(By.cssSelector("*[type='checkbox']"));
		
		System.out.println(element.size());
		
		
	}

}
