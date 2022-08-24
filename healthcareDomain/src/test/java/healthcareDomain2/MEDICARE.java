package healthcareDomain2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MEDICARE {

	WebDriver driver = new ChromeDriver();
	@BeforeMethod
	public void openBrowser() throws InterruptedException

	{ 
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("http://localhost:8085/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}
	//SIGNUP==================================================================================================================
	/*	@Test
	public void Medicine() throws InterruptedException {

	WebElement ViewBtn = driver.findElement(By.xpath("//*[@id=\"listProducts\"]")); 
	ViewBtn.click();

	WebElement AddToCart = driver.findElement(By.xpath("//*[@href='/medicare/cart/add/1/product']"));
	AddToCart.click();

    WebElement RegisterHere = driver.findElement(By.xpath("//*[@href='/medicare/membership']"));
    RegisterHere.click();

    WebElement FirstName = driver.findElement(By.xpath("//*[@id='firstName']"));
    FirstName.sendKeys("xyz");


    WebElement LastName = driver.findElement(By.xpath("//*[@id='lastName']"));
    LastName.sendKeys("pqr");

    WebElement EmailID = driver.findElement(By.xpath("//*[@id='email']"));
    EmailID.sendKeys("pqr@xyz.com");

    WebElement ContactNum = driver.findElement(By.xpath("//*[@id='contactNumber']"));
    ContactNum.sendKeys("0123456789");

    WebElement Password = driver.findElement(By.xpath("//*[@id='password']"));
    Password.sendKeys("xyzabc");

    WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id='confirmPassword']"));
    ConfirmPassword.sendKeys("xyzabc");

    WebElement UserBtn = driver.findElement(By.xpath("//*[@class='radio-inline']"));
    UserBtn.click();

    WebElement BillingBtn = driver.findElement(By.xpath("//button[@type='submit']"));
    BillingBtn.click();

    Thread.sleep(5000);

    WebElement Address1  = driver.findElement(By.xpath("//input[@id='addressLineOne']"));
    Address1.sendKeys("SHARMILLA RESIDENCY,THANE");

    WebElement Address2 = driver.findElement(By.xpath("//input[@id='addressLineTwo']"));
    Address2.sendKeys("SHARMILLA RESIDENCY,THANE");

    WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
    City.sendKeys("THANE");

    WebElement PostalCode = driver.findElement(By.xpath("//input[@id='postalCode']"));
    PostalCode.sendKeys("416315");

    WebElement State = driver.findElement(By.xpath("//input[@id='state']"));
    State.sendKeys("MAHARASHTRA");

    WebElement Country = driver.findElement(By.xpath("//input[@id='country']"));
    Country.sendKeys("INDIA");

    Thread.sleep(5000);

    WebElement NextBtn = driver.findElement(By.xpath("//button[@name='_eventId_confirm']"));
    NextBtn.click();

    Thread.sleep(5000);

    WebElement ConfirmBtn = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']"));
    ConfirmBtn.click();

    System.out.println("succeessfully Registerd");
    Thread.sleep(5000);

   WebElement LoginHere = driver.findElement(By.xpath("//a[@class='btn btn-lg btn-success']"));
    LoginHere.click();
    Thread.sleep(5000);
	}*/

	//====================================================================================================================

	//LOGIN	-	
	@Test(priority=1)
	public void Login() throws InterruptedException { 
       WebElement Login = driver.findElement(By.xpath("//*[@id='login']"));
		Login.click();

		WebElement USERNAME = driver.findElement(By.xpath("//input[@class='form-control']"));
		USERNAME.sendKeys("pqr@xyz.com");

		WebElement PASSWORD = driver.findElement(By.xpath("//input[@type='password']"));
		PASSWORD.sendKeys("xyzabc");

		Thread.sleep(5000);

		WebElement LoginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
		LoginBtn.click();
		Thread.sleep(5000);

		WebElement ViewBtn = driver.findElement(By.xpath("//*[@id=\"listProducts\"]")); 
		ViewBtn.click();
	}


	@Test(dependsOnMethods="Login")

	public void PARACETAMOL() throws Exception {

		//PARACETAMOL TABLET-

		WebElement Paracetamol = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		Paracetamol.click();

		Thread.sleep(5000);
		WebElement AddToCart = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		AddToCart.click();

		WebElement Qantity = driver.findElement(By.xpath("//input[@type='number']"));
		Qantity.sendKeys("1");

		Thread.sleep(5000);

		WebElement Checkout = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
		Checkout.click();

		Thread.sleep(2000);

		WebElement Select = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		Select.click();

		WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
		CardNumber.sendKeys("4263982640269299");

		WebElement Expirymonth  = driver.findElement(By.xpath("//input[@id='expityMonth'] "));
		Expirymonth.sendKeys("2");

		WebElement ExpiryYear  = driver.findElement(By.xpath("//input[@id='expityYear'] "));
		ExpiryYear.sendKeys("2023");

		WebElement CVCode  = driver.findElement(By.xpath("//input[@id='cvCode']"));
		CVCode.sendKeys("4321");

		WebElement Pay  = driver.findElement(By.xpath("//a[@role='button']"));
		Pay.click();

		System.out.println("Your order is successfully confirmed");	

	}

	/*@Test(dependsOnMethods="Login")
public void COMBIFLAME() throws InterruptedException {

	//COMBIFLAME TAB -
	//WebElement Combiflame = driver.findElement(By.xpath("//*[@id=\"productListTable\"]/tbody/tr[2]/td[2]"));
	//Combiflame.click();

	Thread.sleep(5000);
	WebElement Combiflame1= driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
	Combiflame1.click();

	WebElement AddToCart2 = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
	AddToCart2.click();

	WebElement Qantity2= driver.findElement(By.xpath("//input[@id='count_2']"));
	Qantity2.sendKeys("2");

	WebElement Checkout2 = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
	Checkout2.click();

	/*WebElement ContinueShopping2 = driver.findElement(By.xpath("//a[@class='btn btn-warning']"));
	ContinueShopping2.click();*/
	
	
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}
}





 










