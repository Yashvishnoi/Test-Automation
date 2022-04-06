import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAndSoftAssertion {
	static WebDriver driver;

	@BeforeTest
	public void beforeCheck() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		System.out.println();
	}

	@Test
	public void hardAssertion() {
		WebElement search = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input"));
		search.sendKeys("I phone");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
		driver.findElement(By.partialLinkText("PUMA x Royal Challengers Bangalore Replica Men's 2022 Jersey")).click();
		WebElement aT = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/h1"));
		String At = aT.getText();
		String Et = "Search -I Phone";
		Assert.assertEquals(At, Et);
		WebElement p = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[1]/div[3]/div/div/div[1]/div/span/span"));
		boolean pc = p.isDisplayed();
		Assert.assertEquals(pc, true);
		WebElement img = driver.findElement(By.xpath(
				"/html/body/div[4]/div[3]/div[3]/div[1]/div[1]/div/div[2]/div[1]/div/div/div[1]/div/div[3]/a/picture/img"));
		boolean imgc = img.isDisplayed();
		Assert.assertEquals(imgc, true);
		WebElement s = driver
				.findElement(By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[7]/div[2]/div/h6"));
		boolean sc = s.isDisplayed();
		Assert.assertEquals(sc, true);
		WebElement b = driver
				.findElement(By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[10]/div/div[2]/button"));
		boolean bc = b.isEnabled();
		Assert.assertEquals(bc, true);
		WebElement f = driver.findElement(
				By.xpath("/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[10]/div/div[3]/div/button"));
		boolean fc = f.isEnabled();
		Assert.assertEquals(fc, true);
		WebElement q = driver.findElement(By.xpath(
				"/html/body/div[4]/div[3]/div[3]/div[1]/div[2]/div/div[10]/div/div[1]/div/div[1]/div[1]/select"));
		boolean qc = q.isEnabled();
		Assert.assertEquals(qc, true);
	}
}