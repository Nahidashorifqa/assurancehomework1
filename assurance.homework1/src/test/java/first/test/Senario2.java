package first.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;
	
	
	public class Senario2 {

		public WebDriver driver;
		
		@BeforeTest
		public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.assurancewireless.com/");
		driver.manage().window().fullscreen();
		}
		@Test 
		public void containText() {
			WebElement text=driver.findElement(By.xpath("//a[contains(text(),'Coverage Map')]"));
		}
		
		
		@Test
		public void name() {
			WebElement name=driver.findElement(By.name("min"));
			System.out.println(name.getText());
		}
		@Test
		public void xpath() {
			WebElement xpath=driver.findElement(By.xpath("//*[@target='_blank']"));
			System.out.println(xpath.getText());
		}
		
		@Test 
		public void css() {
		WebElement css=driver.findElement(By.cssSelector("#main-nav-section"));	
			
			
		}
		@AfterTest
		public void teardown() {
			driver.quit();
		}
		
		}
	

