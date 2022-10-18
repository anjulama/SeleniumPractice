package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.saucedemo.com/");
		
//		//Above
//		By username  = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
//		driver.findElement(username).sendKeys("standard_user");
//		
//		//Below
//		By password  = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
//		driver.findElement(password).sendKeys("secret_sauce");
		
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		By q = RelativeLocator.with(By.tagName("li")).above(By.id("milk"));
		System.out.print(driver.findElement(q).getText());

		
		
		
	}

}
