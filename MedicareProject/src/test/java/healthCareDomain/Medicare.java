package healthCareDomain;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.text.View;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Medicare {
	WebDriver driver = new FirefoxDriver();
	
	
	@Test
	public void openBrowser() throws InterruptedException
	
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://localhost:8085/medicare/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
	/*@Test
	public void combiflame() throws InterruptedException {*/
		Thread.sleep(3000);
		WebElement ViewProducts = driver.findElement(By.id("listProducts")); 
	
		ViewProducts.click();

		WebElement Search	= driver.findElement(By.xpath("//input[@type='search']"));
		Search.sendKeys("combiflame");
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement show = driver.findElement(By.xpath("//a[@class='btn btn-primary']")); 
		show.click();
		
		WebElement AddToCart = driver.findElement(By.xpath("//a[@class='btn btn-success']")); 
		AddToCart.click();
		
		
		
		//a[@class="btn btn-success"]
		
		
		
	

	
	
	
	
	
	}
	}
