import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsingSameClass {
	
	 @DataProvider(name="loginData")
	  public static Object[][] loginData1() { // static data because your login data called by any script 
	    
		  Object [][] data = new Object[3][4]; // Object is super class of all int,float, string etc.
		  
		  data[0][0] = "500076616@stu.upes.ac.in";
	      data[0][1] = "Yash@123";
	      data[0][2] = "chrome";
	      data[0][3] = "100.0.4896.60";
	      
	      data[1][0] = "yashvishnoi1001@gmail.com";
	      data[1][1] = "xyz009";
	      data[1][2] = "chromium brave";
	      data[1][3] = "1.35.103";
	      
	      data[2][0] = "xyz@outlook.com";
	      data[2][1] = "xyz698";
	      data[2][2] = "IE";
	      data[2][3] = "69.78.04";
		  return data;
	  }
	 
	 
	 @Test(dataProvider="loginData")
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

