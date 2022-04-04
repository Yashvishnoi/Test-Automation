import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReader{

	public static void main(String[] args) throws IOException {
		// Excel file 2 column email & password
		String email= "";
		String password="";
		// how to read Excel file
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\TAProject.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("login");
			int rowCount = sheet.getLastRowNum();
			for(int i=1;i<=rowCount;i++) {
				XSSFRow row = sheet.getRow(i); 
				if(row.getCell(0).getCellType()==CellType.NUMERIC) {
					email = row.getCell(0).getRawValue();}
				else {
					email = row.getCell(0).toString();
				}
				if(row.getCell(1).getCellType()==CellType.NUMERIC) {
					password = row.getCell(1).getRawValue();}
				else {
					password = row.getCell(1).toString();
				}

				login (email,password);
				}
		fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		login(email, password);

	}
	public static void login(String email1, String password1) {
		System.out.println("Running TC with email" + email1+"password" + password1);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yash Vishnoi\\Desktop\\Test Automation\\lab\\Udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // to maximize the window
		driver.get("http://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
		
		WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input"));
		email.sendKeys(email1);
		
		WebElement Pass = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input"));
		Pass.sendKeys(password1);
		
		WebElement loginbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
		loginbutton.click();
	}
}
