package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class WebElements2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		boolean s1 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isDisplayed();
		System.out.println(s1);
		boolean s2 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled();
		System.out.println(s2);
		driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).click();
		boolean s3 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected();
		System.out.println(s3);
		
		
		driver.quit();
		


		
		
		

	
		
	}
}