package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://www.saucedemo.com/");
		
		// id 
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//name
		driver.findElement(By.className("user-name")).sendKeys("standard_user");
		//tagName
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		//Css selector
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		// Xpath
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		//linkText 
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		driver.findElement(By.linkText("Overview")).click();
		
		//partialLinkText
		driver.findElement(By.partialLinkText("Getting")).click();
	
	}

}
