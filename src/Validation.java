import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Validation {
	WebDriver driver;

	@BeforeTest
	public void BeforeTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/");
			System.out.println("Web Site Opened\n");
		}
	
	@Test (priority=0)
	public void TopNavBarCheck() {
		System.out.println("Navigation Bar Check");
		WebElement CheckoutButton = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[5]/a/i"));
		boolean C = CheckoutButton.isDisplayed();
		WebElement ShoppingCart = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[4]/a/i"));
		boolean S = ShoppingCart.isDisplayed(); 
		WebElement WishList  = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/a/i"));
		boolean W = WishList.isDisplayed();
		WebElement MyAccount = driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a"));
		boolean M = MyAccount.isDisplayed();
		WebElement CurrencyButton = driver.findElement(By.xpath("/html/body/nav/div/div[1]/form/div/button/span"));
		boolean CB = CurrencyButton.isDisplayed();
		
		if (C == true && S == true && W == true && M == true && CB == true )
			System.out.println("All things are displayed properly");
		else
			System.out.println("Some mismatch in our test cases");
		System.out.println("Checkout Button is  Displayed: " + C);
		System.out.println("Shopping Cart button is Displayed: " + S);
		System.out.println("Wishlist is  Displayed: " + W);
		System.out.println("MyAccount Button is Displayed: " + M);
		System.out.println("Currency Button is Displayed" + CB);
		System.out.println("\n");
	}
	
	@Test (priority=1)
	public void HomePageCheck() {
		System.out.println("Home Page Check");
		WebElement YourStoreButton = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a"));
		boolean YS = YourStoreButton.isDisplayed();
		WebElement Cartbutton = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/button"));
		boolean Cb = Cartbutton.isEnabled();
		System.out.println("Your Store Button is displayed: " + YS);
		System.out.println("Cart Button Displayed and Enabled: " + Cb);
		System.out.println("\n");
	}
	
	@Test (priority=2)
	public void FooterCheck() {
		System.out.println("Footer Check");
		WebElement Information = driver.findElement(By.xpath("/html/body/footer/div/div/div[1]/h5"));
		boolean I= Information.isDisplayed();
		WebElement CustomerService = driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/h5"));
		boolean CS= CustomerService.isDisplayed();
		WebElement Extras = driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/h5"));
		boolean E= Extras.isDisplayed();
		WebElement MyAccount = driver.findElement(By.xpath("/html/body/footer/div/div/div[4]/h5"));
		boolean MAA= MyAccount.isDisplayed();
		System.out.println("\n");
		System.out.println("Information: " + I);
		System.out.println("CustomerService: " + CS);
		System.out.println("Extras: " + E);
		System.out.println("MyAccount "+MAA);
		System.out.println("\n");
	}
	@AfterTest
	public void afterCheck() {
		System.out.println("Done the page testing");
		driver.close();
	}
}
