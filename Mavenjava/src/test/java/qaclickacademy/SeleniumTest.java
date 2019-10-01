package qaclickacademy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest 
{
	public WebDriver driver;
	@Test
  public void openMyBlog()
  {
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String baseUrl = "http://192.168.1.12/Aras11_SP8_PCCS/Client/X-salt=std_11.0.0.6493-X/scripts/Innovator.aspx";
		driver.get(baseUrl);
		System.out.println("Aras URL is hit");
		Date d =new Date();
		
		driver.switchTo().frame("main");
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Flx_QDM_Admin1");
		System.out.println("Username is entered");
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("123");
		System.out.println("Password is entered");
		
		//Select the database
		Select selectdb = new Select(driver.findElement(By.id("database_select")));
		selectdb.selectByIndex(0);
		
		//Click on login button
		driver.findElement(By.id("login.login_btn_label")).click();
		System.out.println("Login done");
  }
	
	@BeforeClass
	public void beforeClass()
	{
		ChromeOptions chromeOptions= new ChromeOptions();
		//Set the path of chromt.exe 
		chromeOptions.setBinary("C:\\Users\\user1\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		chromeOptions.addArguments("--disable-features=VizDisplayCompositor");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver(chromeOptions);
		System.out.println("Chrome Brawser window is opened");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class method Do u want to quit the brawser");
	}
	

}
