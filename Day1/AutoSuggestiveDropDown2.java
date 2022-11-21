package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AutoSuggestiveDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("fromCity")).sendKeys("lga");	
//		Thread.sleep(3000);	
//		driver.findElement(By.id("fromCity")).sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(3000);
//		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
//		driver.findElement(By.id("toCity")).sendKeys("dfw");
//		Thread.sleep(3000);
//		driver.findElement(By.id("toCity")).sendKeys(Keys.ARROW_DOWN);	
//		driver.findElement(By.id("toCity")).sendKeys(Keys.ENTER);
//		
//		driver.findElement(By.cssSelector("a[class=\"primaryBtn font24 latoBold widgetSearchBtn \"]  ")).click();

		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys("flights");
		 driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys(Keys.ENTER);
		 driver.findElement(By.cssSelector("input[placeholder=\"Enter an origin\"]")).sendKeys("new");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[placeholder=\"Enter an origin\"]")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.cssSelector("input[placeholder=\"Enter an origin\"]")).sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[placeholder=\"Enter a destination\"]")).sendKeys("vegas");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[placeholder=\"Enter a destination\"]")).sendKeys(Keys.ARROW_DOWN);
		 driver.findElement(By.cssSelector("input[placeholder=\"Enter a destination\"]")).sendKeys(Keys.ENTER);
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("div[data-ved=\"0CA8Q1qcCahgKEwiQxuuFi-_6AhUAAAAAHQAAAAAQmgE\"]")).click();
	}
	}


