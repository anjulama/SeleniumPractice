package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Tables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
		driver.manage().window().maximize();

		// Get the number of rows
		// Get the total numbers of columns
		// Iterate rows and columns and print the text of column

		List<WebElement> totalTable = driver.findElements(By.xpath("//*[table]"));
		System.out.println(totalTable.size());
		int ctables = totalTable.size();

		List<WebElement> rowElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(rowElements.size());
		int rowsize = rowElements.size();

		List<WebElement> ColumnElements = driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(ColumnElements.size());
		int colsize = ColumnElements.size();

		for (int i = 2; i <= rowsize; i++) {
			for (int j = 1; j <= colsize; j++) {
				String text = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(text);
			}
		}

		// sum of all age
		int sum = 0;
		for (int i = 2; i <= rowsize; i++) {
			String text = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr[" + i + "]/td[3]")).getText();
			System.out.println(text);
			sum = sum + Integer.parseInt(text);
		}
		System.out.println(sum);
		System.out.println(sum / (rowsize - 1));

	}

//  loop
//	table 
//	row of table
//	column
	
	//https://www.espncricinfo.com/series/swaminarayan-pro-twenty-2022-23-1342104/mafuko-mavericks-vs-play-master-warriors-14th-match-1342125/full-scorecard

	}
	


