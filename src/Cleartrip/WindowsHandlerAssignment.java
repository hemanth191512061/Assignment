package Cleartrip;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlerAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver web = new ChromeDriver();System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		web.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		web.get("https://the-internet.herokuapp.com/");
		web.findElement(By.xpath("//a[contains(text(),'Multiple')]")).click();
		Thread.sleep(2000);
		web.findElement(By.xpath("//a[contains(text(),'Click')]")).click();
		Set<String> handle=web.getWindowHandles();
	    Iterator<String> iterate=handle.iterator();
		String parent=iterate.next();
	
		for(String next:handle)
		{
			if(!next.equals(parent))
			{
			
				web.switchTo().window(next);
				System.out.println(web.getTitle());
			}
	}
		
		web.switchTo().window(parent);
		System.out.println(web.findElement(By.cssSelector("[class='example'] h3")).getText());
		}
	}
