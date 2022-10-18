package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.SystemPropertyUtil;

public class SelectDropDown {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		WebElement dropd = driver.findElement(By.id("dropdowm-menu-1"));		
		Select select = new Select(dropd);
		select.selectByIndex(2);
		select.selectByVisibleText("SQL");
		select.selectByValue("c#");
		
		
	
		
		
		
		
		
		
		

	
		
	}
}