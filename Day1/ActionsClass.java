package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
//		driver.manage().window().maximize();
//				
//		Actions  a = new Actions (driver);
//		WebElement doubleClick = driver.findElement(By.id("double-click"));
//		a.doubleClick(doubleClick).perform();
//		
//		WebElement from = driver.findElement(By.cssSelector("#draggable"));
//		WebElement to = driver.findElement(By.cssSelector("#droppable"));
//		a.dragAndDrop(from,to).build().perform();
//		
//		WebElement clickHold= driver.findElement(By.cssSelector("#click-box"));
//		a.moveToElement(clickHold);
//		a.clickAndHold().perform();
//		
//		WebElement rightClick = driver.findElement(By.cssSelector("#double-click"));
//		a.contextClick(rightClick).perform();
		
		
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		
		Actions a1 = new Actions (driver);
		WebElement doubleClick1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		a1.doubleClick(doubleClick1).perform();
		
		WebElement rightClick1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		a1.contextClick().perform();
		
		WebElement hoverOver =  driver.findElement(By.cssSelector(".dropbtn"));
		a1.moveToElement(hoverOver).perform();
		
		
		
		

	}
	}


