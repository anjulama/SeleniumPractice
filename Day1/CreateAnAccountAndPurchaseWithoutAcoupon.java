package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAnAccountAndPurchaseWithoutAcoupon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Anju Lama\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.findElement(By.id("customer-first-name")).sendKeys("Anju");
		driver.findElement(By.xpath("//*[@id=\"customer-last-name\"]")).sendKeys("Lama");
		driver.findElement(By.id("customer-email")).sendKeys("anjulama1418@gmail.com");
		driver.findElement(By.id("customer-password")).sendKeys("123Project");
		driver.findElement(By.xpath("//*[@id=\"login-section\"]/form/button")).click();
		driver.findElement(By.id("pink-button")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Shop')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@aria-label, 'close')]")));
		driver.findElement(By.xpath("//button[contains(@aria-label, 'close')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'New Arrivals')]")).click();

		driver.findElement(By.xpath("//*[contains(text(),'Rainbow Bright Skit Suit')]")).click();
		driver.findElement(By.cssSelector("[for=\"8-Size-XS\"]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Add to Cart')]")).click();
		driver.findElement(By.linkText("Checkout")).click();

		driver.findElement(By.className("tw-cursor-pointer")).click();
		driver.findElement(By.cssSelector("[autocomplete=\"address-line1\"]")).sendKeys("123 foreman rd.");
		driver.findElement(By.id("locality")).sendKeys("mobile");
		WebElement dropDown = driver.findElement(By.name("state"));
		Select select = new Select(dropDown);
		select.selectByValue("TX");
		driver.findElement(By.name("state")).sendKeys("Texas");
		driver.findElement(By.cssSelector("[autocomplete=\"postal-code\"]")).sendKeys("12345");
		driver.findElement(By.id("save-button")).click();

		driver.findElement(By.xpath("//label[contains(@for, 'credit-card')]")).click();
		WebElement ifrm = driver.findElement(By.cssSelector("[title=\"Secure card payment input frame\"]"));
		driver.switchTo().frame(ifrm);
		driver.findElement(By.name("cardnumber")).sendKeys("4242 4242 4242 4242");
		driver.findElement(By.name("exp-date")).sendKeys("05/24");
		driver.findElement(By.name("cvc")).sendKeys("111");
		driver.findElement(By.name("postal")).sendKeys("12345");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("stripe-button")).click();

		driver.findElement(By.className("_cta-button")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait2.until(ExpectedConditions.elementToBeClickable(By.className("webstore-checkout-btn")));

		driver.findElement(By.className("webstore-checkout-btn")).click();
		driver.findElement(By.xpath("//a[contains(@aria-label, 'Account')]")).click();
		driver.findElement(By.cssSelector("[class=\"main-sub red\"]")).click();

		driver.quit();

	}

}
