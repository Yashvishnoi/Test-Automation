import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class SearchTest{
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize(); 
	}

	@Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		WebElement search = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input"));
		search.sendKeys("I phone");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
	}
	
	@Test
	public void testArticle() {
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement iphone;
		iphone = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[1]/a/img")));
		iphone.click();
	}
	
	@AfterTest
	public void AfterTest() {
		driver.close();
	}
}
