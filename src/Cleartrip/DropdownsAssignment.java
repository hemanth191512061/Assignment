package Cleartrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownsAssignment {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver web = new ChromeDriver();
	web.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	web.get("https://www.cleartrip.com/");
	WebElement calender=web.findElement(By.xpath("(//*[contains(@class,'datePicker')])[2] "));
	//web.findElement(By.xpath("(//a[text='28'])[1]")).click();
	JavascriptExecutor java= (JavascriptExecutor)web;
	java.executeScript("arguments[0].click();", calender);
	web.findElement(By.xpath("(//a[text()=\"28\"])[1]")).click();
	Select sel=new Select(web.findElement(By.id("Adults")));
	sel.selectByValue("3");
	Select childrens=new Select(web.findElement(By.id("Childrens")));
	childrens.selectByValue("3");
	Select infants=new Select(web.findElement(By.xpath("//select[@id='Infants']")));
	infants.selectByValue("1");
	web.findElement(By.xpath("//a[@id=\"MoreOptionsLink\"]/strong")).click();
	web.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
	web.findElement(By.id("SearchBtn")).click();
	System.out.println(web.findElement(By.id("homeErrorMessage")).getText());
	
}
}
