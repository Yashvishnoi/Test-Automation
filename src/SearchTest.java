import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
		WebElement search = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input"));
		search.sendKeys("I phone");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
	}
	
	@AfterTest
	public void AfterTest() {
		driver.close();
	}
}
