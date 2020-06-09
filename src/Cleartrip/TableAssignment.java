package Cleartrip;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows=web.findElements(By.cssSelector("table[id=\"product\"] tbody tr"));
		
		System.out.println("Number of rows are "+" "+rows.size());
		List<WebElement> column=web.findElements(By.cssSelector("table[id=\"product\"] tbody tr th"));
		System.out.println("Number of columns are "+" "+column.size());
		
		List<WebElement> SecondRow=web.findElements(By.cssSelector("table[id=\"product\"] tbody tr:nth-child(3)"));
		for(int i=0;i<SecondRow.size();i++) {
		System.out.println(SecondRow.get(i).getText());
	
	


}
	}
}
