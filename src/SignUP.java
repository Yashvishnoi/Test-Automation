import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUP {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().window().maximize(); // to maximize the window
		

		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click(); // Click on my account
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click(); // Click on register
		
		
		WebElement Firstname = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input"));
		Firstname.sendKeys("Yash");
		
		WebElement Lastname = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input"));
		Lastname.sendKeys("Rawat");
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input"));
		email.sendKeys("500076616@stu.upes.ac.in");
		
		WebElement phone = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input"));
		phone.sendKeys("9997703429");
		
		WebElement Pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input"));
		Pass.sendKeys("Yash@123");
		
		WebElement ConPass = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input"));
		ConPass.sendKeys("Yash@123");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
	}

}
