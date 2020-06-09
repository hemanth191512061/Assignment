package Cleartrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		web.get("https://the-internet.herokuapp.com/");
		//web.get("http://the-internet.herokuapp.com/");



		web.findElement(By.linkText("Nested Frames")).click();



		web.switchTo().frame("frame-top");



		web.switchTo().frame("frame-middle");



		System.out.println(web.findElement(By.id("content")).getText());



		}
	}


