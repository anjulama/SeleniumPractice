package Day1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class IFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.webdriveruniversity.com/IFrame/index.html");
//		driver.manage().window().maximize();
//		WebElement frm = driver.findElement(By.id("frame"));
//		driver.switchTo().frame(frm);
//		WebElement t = driver.findElement(By.cssSelector("#button-find-out-more"));
//		System.out.println(t.getText());
//		t.click();
//		driver.switchTo().parentFrame();
//		driver.quit();
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		driver.manage().window().maximize();
		WebElement i = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(i);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Visit W3Schools')]")).click();;

		
		}
	
	}


