package Day1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WebDriveMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");
		String title = driver.getTitle();
		System.out.println(title);
		 
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
		
	    List<WebElement> r= driver.findElements(By.tagName("span"));
		System.out.println(r.size());
		driver.quit();
		
		
	}

}
