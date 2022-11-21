package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.netty.util.internal.SystemPropertyUtil;

public class RadioButtonCheckbox {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
//		WebElement checkBoxOne = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
//		checkBoxOne.click();
//		checkBoxOne.click();
//		// Assertion
//		if(checkBoxOne.isSelected()) {
//			System.out.println("Checkbox is selected");
//		}
//		else {
//			System.out.println("Check box is not selected");
//		}
	
		// selecting all the check box
		
//		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
//		
//		for(int i = 0 ; i < checkboxes.size() ; i++ ) {
//			System.out.println(i);
//			if(!checkboxes.get(i).isSelected()) {
//				checkboxes.get(i).click();
//			}
//			
//		}
		// Radio buttons
		
//		WebElement RB = driver.findElement(By.cssSelector("input[value=\"green\"]"));
//		WebElement RB1 = driver.findElement(By.cssSelector("input[value=\"blue\"]"));
//		RB.click();
//		RB1.click();
//		
//		if(driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected()){
//			System.out.println("Radio button selected");
//		}
//		else {
//			System.out.println("Radio button not selected");
//		}
//		
//	
//		List<WebElement> RB3 = driver.findElements(By.cssSelector("input[name=\"color\"]"));
//		for(int i = 0 ; i < RB3.size() ; i++ ) {
//		System.out.println(i);
//		Thread.sleep(2000);
//		RB3.get(i).click();
//		
// OR		
//		if(!RB3.get(i).isSelected()) {
//			RB3.get(i).click();
//		}	
		
		}}

		
