package Day1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search2")).sendKeys("SQL");
		driver.findElement(By.id("search2")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("search2")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'SQL HOME')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Try it Yourself »')]")).click();
		
		Set<String> WinH = driver.getWindowHandles();
		System.out.println(WinH);
		
		Iterator <String> It = WinH.iterator();
		String firstTab = It.next();
		String secondTab = It.next();
		driver.switchTo().window(secondTab);
		
		driver.findElement(By.className("ws-btn")).click();
		
		//driver.switchTo().window(firstTab);
		System.out.println(driver.getTitle());		

		
		
		}
	
	}


