import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		/* 
		 Prity is the BEST 
		 added new comment to check ...
		 * */

	}

	@Test
	public void doLogin() {
		driver.get("http://tgmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("pritysinha03059101@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("x177524@Telus");
		//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div[2]")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
