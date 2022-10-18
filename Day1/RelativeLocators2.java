package Day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)"); 
		driver.findElement(By.xpath("//*[contains(text(),'DATA, TABLES & BUTTON STATES')]")).click();
		ArrayList<String> AllTabs = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(AllTabs.get(1));
		jse.executeScript("scroll(0, 3000)"); 
		WebElement w = driver.findElement(RelativeLocator.with(By.tagName("h2")).above(By.xpath("//*[contains(text(),'Home')]")));
		System.out.println(w.getText());
		WebElement w1 = driver.findElement(RelativeLocator.with(By.tagName("a")).below(By.xpath("//*[contains(text(),'Buttons & States')]")));
		System.out.println(w1.getText());
		WebElement w2 = driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.xpath("//*[contains(text(),'About')]")));
		System.out.println(w2.getText());
		WebElement w3 = driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(By.xpath("//*[contains(text(),'Danger')]")));
		System.out.println(w3.getText());
		WebElement w4 = driver.findElement(RelativeLocator.with(By.tagName("button")).near(By.xpath("//*[contains(text(),'Button-4')]")));
		System.out.println(w4.getText());
		
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		//String s1= driver.getPageSource();
		//System.out.println(s1);
		
		String s2 = driver.getTitle();
		System.out.println(s2);
		
		String s3 = driver.getWindowHandle();
		System.out.println(s3);
		
		List<WebElement> Wb = driver.findElements(By.tagName("button"));
		System.out.println(Wb.size());

		List<WebElement> Wb1 = driver.findElements(By.tagName("a"));
		System.out.println(Wb1.size());
		
		driver.quit();
		
		
		
		
		
	
	
		
		
//		 driver.get("https://www.saucedemo.com/");
//		 driver.manage().window().maximize();
//		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		 driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("password"))).click();
//		 WebElement q = driver.findElement(RelativeLocator.with(By.tagName("div")).above(By.className("inventory_item_desc")));
//	     System.out.println(q.getText());
//	     
//		 driver.findElement(RelativeLocator.with(By.tagName("button")).toRightOf(By.className("inventory_item_price"))).click();
//		 driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(By.className("inventory_item_price"))).click();
//		 driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.className("app_logo"))).click();
//		 
//		 List<WebElement> s = driver.findElements(By.tagName("button"));
//		 System.out.println(s.size());
//	 
//		 driver.close();
		
		
		
		
	}

}
