package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("food-item")).sendKeys("Av");
		driver.findElement(By.name("food-item")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("food-item")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("submit-button")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		}
	
	}


