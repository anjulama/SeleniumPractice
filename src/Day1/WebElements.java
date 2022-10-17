package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class WebElements {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id=\"search_query_top\"]")).sendKeys("dresses");
		driver.findElement(By.cssSelector("button[name=\"submit_search\"]")).click();
		driver.findElement(By.cssSelector("input[id=\"search_query_top\"]")).clear();
		String s = driver.findElement(By.linkText("Printed Chiffon Dress")).getAttribute("class");
		System.out.println(s);
		String s1 = driver.findElement(By.linkText("Printed Chiffon Dress")).getAttribute("href");
		System.out.println(s1);
		String s2 = driver.findElement(By.cssSelector("a[title=\"View a top sellers products\"]")).getText();
		System.out.println(s2);
		String s3 = driver.findElement(By.cssSelector("img[class=\"logo img-responsive\"]")).getTagName();
		System.out.println(s3);
		System.out.println(driver.findElement(By.cssSelector("img[class=\"logo img-responsive\"]")).getSize());
		System.out.println(driver.findElement(By.cssSelector("img[class=\"logo img-responsive\"]")).getLocation());
		String s4 = driver.findElement(By.cssSelector("a[title=\"Women\"]")).getCssValue("color");
		System.out.println(s4);
		
		driver.close();

		
		


		
		
		

	
		
	}
}