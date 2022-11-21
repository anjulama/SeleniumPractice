 package Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Testdataproperties {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		Properties pro = new Properties();
	
		FileInputStream input = new FileInputStream(
				"C:\\Users\\Anju Lama\\eclipse-workspace\\Selenium\\src\\Day1\\testdata.properties");
		pro.load(input);
		
		String username = pro.getProperty("Username");
		String password = pro.getProperty("Password");
		System.out.println(username);
		System.out.println(password);
		
		driver.get(pro.getProperty("baseUrl"));
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
		FileOutputStream output = new FileOutputStream(
				"C:\\Users\\Anju Lama\\eclipse-workspace\\Selenium\\src\\Day1\\testdata.properties"	);
		pro.setProperty("name", "Anju");
		pro.setProperty("city", "dallas");
		pro.store(output, "storing the data");

		
		

		
		
		

	}
	}


