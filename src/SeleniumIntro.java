import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods
		//Firefox - FirefoxDriver ->Methods
		//Safari -SafariDriver ->Methods
		//WebDriver methods + class methods
		//chromedriver.exe -> Chrome browser
		//webdriver.chrome.driver -> Value of the path
		
		//System.setProperty("webdriver.chrome.driver", "C:/Users/AL10937/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/AL10937/geckodriver-v0.32.0-win-aarch64/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Edge Launch
		//edgedriver
				
		System.setProperty("webdriver.edge.driver", "C:/Users/AL10937/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();
	}

}
