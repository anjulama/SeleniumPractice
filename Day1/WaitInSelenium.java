package Day1;

import java.time.Duration;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
//		// Implicit wait
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.manage().window().maximize();
//	    WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
//	    Actions action = new Actions(driver);
//	    action.moveToElement(e).perform();
//	    
//	    // Explicit wait
//	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
//	    wait.until(ExpectedConditions.elementToBeClickable(e));
//	    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
//	  
//	    // Fluent Wait
//	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//	    		  .withTimeout(Duration.ofSeconds(30))
//	    		  .pollingEvery(Duration.ofSeconds(5))
//	    		  .withMessage("trying to get the element")
//	    		  .ignoring(NoSuchElementException.class);
	    
	    driver.get("https://www.etsy.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	    driver.manage().window().maximize();
	    WebElement a = driver.findElement(By.id("catnav-primary-link-10855"));
	    Actions action =  new Actions(driver);
	    action.moveToElement(a).perform();
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.elementToBeSelected(a));
	    driver.findElement(By.id("catnav-primary-link-10855")).click();
	    
	    Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
	    		 .withTimeout(Duration.ofSeconds(20))
	    		 .pollingEvery(Duration.ofSeconds(5))
	    		 .withMessage("finding Element")
	    		 .ignoring(NoSuchElementException.class);
	    
	    wait.until(ExpectedConditions.elementToBeSelected(a));
	    driver.findElement(By.id("catnav-primary-link-10855")).click(); 
	 
	    
		}
	
	}


