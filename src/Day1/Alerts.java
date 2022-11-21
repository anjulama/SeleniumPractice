package Day1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("button1")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("button4")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("button2")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"btn btn-default\"]")).click();
		driver.findElement(By.id("button3")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("button1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"btn btn-default\"]")).click();
		driver.quit();
		
		}
	
	}


