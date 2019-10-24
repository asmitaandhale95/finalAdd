package qaclickacademy;

import org.testng.annotations.Test;

public class AppiumTest
{
	
	@Test(priority=1)
	public void NativeAppAndroid()
	{
		System.out.println("First Test from First class is executed successfully");
	}
	@Test(priority=2)
	public void IOSApps()
	{
		System.out.println("Second Test from First class is executed successfully");
	}

}
