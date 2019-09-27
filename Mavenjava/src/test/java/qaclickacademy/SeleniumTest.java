package qaclickacademy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
		Date d =new Date();
		
		driver.switchTo().frame("main");
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Flx_QDM_Admin1");
		
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("123");
		
		//Select the database
		Select selectdb = new Select(driver.findElement(By.id("database_select")));
		selectdb.selectByIndex(0);
		
		//Click on login button
		driver.findElement(By.id("login.login_btn_label")).click();
		
		
  }
	@BeforeClass
	public void beforeClass()
	{
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome Brawser window is opened");
		
	}
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	

}
