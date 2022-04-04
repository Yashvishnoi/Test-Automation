import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.logging.Level;
public class Logger {
	WebDriver driver;
	String driverpath;
	String baseurl;
	@Test
	public void logSample() {
		WebDriver driver;
		driverpath= "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe";
		baseurl = "http://tutorialsninja.com/demo/";
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		Reporter.log("Browser is opened now",true);
		driver.manage().window().maximize();
		Reporter.log("Window is maximized",true);
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		Reporter.log("My Account Button Clicked",true);
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		Reporter.log("Login Button Clicked",true);
	}
}
