package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class JavaExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement  e =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		
		
//		driver.findElement(By.cssSelector("body > button")).click();
//		driver.switchTo().alert().accept();
		
//		System.out.println(driver.getTitle());
		
//		String script = "return document.title;";
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		System.out.println(js.executeScript(script));
		 
		
//		javascript executor way to invoke function
//		js.executeScript("myFunction()");
//		driver.switchTo().alert().accept();
		
		
		
		
		WebElement e1 = driver.findElement(By.cssSelector("body > button"));
		js.executeScript("arguments[0].style.border = '5px dotted red'",e1);
		
		
		}
	
	}


