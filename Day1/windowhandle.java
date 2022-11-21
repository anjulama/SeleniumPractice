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

public class windowhandle {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Properties pro = new Properties();

		FileInputStream input = new FileInputStream(
				"C:\\Users\\Anju Lama\\eclipse-workspace\\Selenium\\src\\Day1\\testdata.properties");
		pro.load(input);
		
		
		driver.get(pro.getProperty("baseUrl2"));
		driver.manage().window().maximize();
		String username = pro.getProperty("username1");
		String password = pro.getProperty("password2");
		System.out.println(username);
		System.out.println(password);
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		FileOutputStream output = new FileOutputStream(
				"C:\\Users\\Anju Lama\\eclipse-workspace\\Selenium\\src\\Day1\\testdata.properties"	);
		pro.setProperty("state", "Texas");
		pro.store(output, "storing the data");

		
		

		
		
		

	}
	}


