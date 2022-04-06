import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginUsingDiffClass2 {
  @Test(dataProviderClass= LoginUsingDiffClass1.class, dataProvider="loginData")
  public void loginTestDataDisplay(String username, String passwd, String browser, String version) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		email.sendKeys("500076616@stu.upes.ac.in");
		
		WebElement Pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input"));
		Pass.sendKeys("Yash@123");
		
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
		loginbutton.click();
      System.out.println("browser    " + browser);
      System.out.println("vrsn        " + version);  
  }
  
}
