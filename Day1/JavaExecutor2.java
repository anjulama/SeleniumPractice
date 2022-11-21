package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class JavaExecutor2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = "return document.title;";
		System.out.println(js.executeScript(title));
	
		
		WebElement border = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/a[1]"));
		js.executeScript("arguments[0].style.border = '5px solid red'",border);
		
		driver.navigate().to("https://www.w3schools.com/");
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"main\"]/footer/a"));
		js.executeScript("arguments[0].scrollIntoView(true);", a);
		js.executeScript("clickFBLike()");
		
		Thread.sleep(3000);
		js.executeScript("hideFBLike()");		
		
		}
	
	}


