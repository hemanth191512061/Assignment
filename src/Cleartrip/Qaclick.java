package Cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qaclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement element=web.findElement(By.id("checkBoxOption2"));
		element.click();
		String choice=element.getText();
		Select sel=new Select(web.findElement(By.id("dropdown-class-example")));
		sel.selectByValue(choice);
	    web.findElement(By.id("name")).sendKeys(choice);
        web.findElement(By.id("alertbtn")).click();
        System.out.println(web.switchTo().alert().getText().contains(choice));
        web.switchTo().alert().accept();
        
	}

}
