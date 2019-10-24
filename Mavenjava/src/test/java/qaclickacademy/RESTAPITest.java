package qaclickacademy;

import org.testng.annotations.Test;

public class RESTAPITest 
{
	
	@Test(priority=3)
	public void postJira()
	{
		System.out.println("First Test from Second Class is executed successfully");
	}
	@Test(priority=4)
	public void deleteTwitter()
	{
		System.out.println("Second Test from Second Class is executed successfully");
	}
	
}
