package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
	
//		driver.get("https://www.facebook.com/");
		
//		driver.manage().window().maximize();
//		driver.findElement(By.id("email")).sendKeys("ansu4friend@yahoo.com");
//		driver.findElement(By.className("inputtext")).sendKeys("ansu4friend@yahoo.com");
//   	driver.findElement(By.tagName("input")).sendKeys("ansu4friend@yahoo.com");
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.linkText("Forgot password?")).click();
//		driver.findElement(By.partialLinkText("password")).click();
//		driver.findElement(By.cssSelector("#email")).sendKeys("ansu4friend@yahoo.com");
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ansu4ffriend@yahoo.com");

//		String url = driver.getCurrentUrl();
//		System.out.println("url);
	
//		String title = driver.getTitle();
//		System.out.println(title);
//		driver.quit();
		
//		driver.close();
		
		
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		List<WebElement> w = driver.findElements(By.tagName("a"));
		System.out.println(w.size());
		List<WebElement> w1 = driver.findElements(By.tagName("button"));
		System.out.println(w1.size());
		System.out.println(driver.getTitle());
		
		

		
//		driver.get("https://www.youtube.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//tp-yt-paper-button[@class=\"style-scope ytd-button-renderer style-suggestive size-small\"]")).click();
//		driver.findElement(By.id("identifierId")).sendKeys("pemba_14@hotmail.com");
//		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
//		driver.findElement(By.xpath("//input[@aria-label=\"Enter your password\"]" )).sendKeys("619Delta");
//
//


	}

}
