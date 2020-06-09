package Cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("user.dir");
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();
		web.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		web.findElement(By.xpath("//a[contains(text(),'Ajax')]")).click();
		WebDriverWait wait=new WebDriverWait(web,10);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id=\"results\"]")));
		System.out.println(element.getText());


	}

}
