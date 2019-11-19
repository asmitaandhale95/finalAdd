package com.vogella.maven1.Add;

import org.testng.annotations.Test;
import testlink.api.java.client.TestLinkAPIResults;
public class AddMethodTest
{
	static String finalResult = "";
	/*
	public static void main(String[] args)
	{
		//TestCase1();
		System.out.println(" Hello World ");
	}
	*/

	@Test
	public static void TestCase1()
	{	
		
		int result = MyAdd.add(1,4);
		if(result == 5)
		{
			finalResult = TestLinkAPIResults.TEST_PASSED;
			System.out.println("Test case pass");
			//throw new ArithmeticException("MyAdd.add incorrect result");
			
		}
		
		System.out.println("Test MyAdd.add(1,4)is ok");
	}
}







