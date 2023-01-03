package datadriventesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	WebDriver driver;

	@BeforeClass
	
	public void SetUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AL10937/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

	}
   @Test(dataProvider="LoginData")
   public void loginTest(String user, String pwd, String exp )
   {
	 driver.get("https://admin-demo.nopcommerce.com/login");;
	 WebElement txtEmail = driver.findElement(By.id("email"));
	 txtEmail.clear();
	 txtEmail.sendKeys(user);
	 
	 WebElement txtPassword = driver.findElement(By.id("Password"));
	 txtPassword.clear();
	 txtPassword.sendKeys(pwd);
	 
	 driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	 
	 String exp_title = "Dashboard / nopCommerce administration";
	 String act_title = driver.getTitle();
	 
	 if(exp.equals("Valid"))
	 {
		 if(exp_title.equals(act_title))
		 {
			 driver.findElement(By.linkText("Logout")).click();
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Assert.assertTrue(false);
		 }
		 
	 }
	 else if(exp.equals("Invalid"))
	 {
		 if(exp_title.equals(act_title))
		 {
			 driver.findElement(By.linkText("Logout")).click();
			 Assert.assertTrue(false);
		 }
		 else
		 {
			 Assert.assertTrue(true);
		 }
	 }
	 
   }
   
   @DataProvider(name="LoginData")
   
   public String [][] getdata()
   {
	   String loginData[][] = {
			   {"admin@yourstore.com", "admin", "Valid"},
			   {"admin@yourstore.com", "adm", "Invalid"},
			   {"adm@yourstore.com", "admin", "Invalid"},
			   {"admyourstore.com", "adm", "Invalid"}
			   
	   };
	   return loginData;
	   
   }
   
   @AfterClass
   void tearDown()
   {
	   driver.close();
   }
}
