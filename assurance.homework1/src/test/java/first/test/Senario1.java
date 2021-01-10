package first.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Senario1 {
	
	
	
	public WebDriver driver;
	
	
	
	
	@BeforeTest
	public void setup() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.get("https://www.assurancewireless.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	}
	@Test
	public void title() {
	String title=driver.getTitle();
	System.out.println(title);
	}
	@Test
	public void url() {
	String url=driver.getCurrentUrl();
	System.out.println(url);
	}
	
	
	
	
	
    @AfterTest
    public void teardown() {
    driver.quit();
    }
}
