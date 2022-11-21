package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.SystemPropertyUtil;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class RadioButtonCheckbox2 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement dropd = driver.findElement(By.id("dropdowm-menu-2"));
		Select select = new Select(dropd);
//		select.selectByIndex(1);
//		select.selectByValue("junit");
		select.selectByVisibleText("Maven");
		
		
		WebElement checkBox= driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
		checkBox.click();
		checkBox.click();
	
		
		List<WebElement> checkBoxAll = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for (int i = 0; i< checkBoxAll.size(); i ++) {
			System.out.println(i);
		//	checkBoxAll.get(i).click();	
		    if (!checkBoxAll.get(i).isSelected()){
			checkBoxAll.get(i).click();
		}
		}
		
		
		
		List<WebElement> RButton = driver.findElements(By.cssSelector("input[name=\"color\"]"));
		for(int i = 0 ; i < RButton.size() ; i++ ) {
		System.out.println(i);
		RButton.get(i).click();
		}
		
		WebElement RButton1 = driver.findElement(By.cssSelector("input[value=\"purple\"]"));
		if ( RButton1.isSelected()){
			System.out.println("purple radio button is selected");
		}else {
			System.out.println("purple radio button in not selected");
		}
		
	}}	
		
