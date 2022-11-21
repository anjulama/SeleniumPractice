package Day1;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Tables2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/swaminarayan-pro-twenty-2022-23-1342104/mafuko-mavericks-vs-play-master-warriors-14th-match-1342125/full-scorecard");
		driver.manage().window().maximize();

		List<WebElement> totalTable = driver.findElements(By.xpath("//*[table]"));		
		int table = totalTable.size();
		System.out.println("number of tables" +":"+table);
		
		List<WebElement> totalRows = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr"));
		int rows = totalRows.size();
		System.out.println("number of rows" +":"+ rows);
		
		List<WebElement> totalColumn = driver.findElements(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr[1]/td"));		
		int column = totalColumn.size();
		System.out.println("number of columns" +":"+column);
		
		int sum = 0;
		for (int i = 1; i <= rows-2; i ++) {
				String text = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr["+i+"]/td[3]"))
						.getText();
			System.out.println(text);
			sum = sum + Integer.parseInt(text);
			}	
		System.out.println("total run" +":" + sum);
		
//		for (int i = 1; i <= rows; i ++) {
//			for (int j =1; j<= column; j++) {
//				String text = driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[5]/div[1]/div/div[3]/div[1]/div[2]/div[1]/div[2]/div/div[2]/table[1]/tbody/tr["+i+"]/td["+j+"]"))
//						.getText();
//				System.out.println(text);
//			}	
//		}
//		
		}
	}	
	


