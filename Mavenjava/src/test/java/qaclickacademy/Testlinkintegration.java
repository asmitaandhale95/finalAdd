package qaclickacademy;

import org.openqa.selenium.WebDriver;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;

public class Testlinkintegration 
{
	
	public static String APIKey = "be10a8bcee1c212d1b072dc094bb9942";
	public static String serverUrl = "http://127.0.0.1:8666/testlink-1.9.19/lib/api/xmlrpc/v1/xmlrpc.php";
	public static  String testlinkprojectName = "POReview";
	public static  String testPlanName = "NewPOReviewPlan";
	public static  String testCaseName1 = "PO---1";
	public static  String testCaseName2 = "PO---2";
	public static  String buildName = "POBuild1";

	public static  void updateResult(String testCaseName, String exception, String results) throws TestLinkAPIException 
	{
			TestLinkAPIClient testlink = new TestLinkAPIClient(APIKey,serverUrl);
			testlink.reportTestCaseResult(testlinkprojectName, testPlanName, testCaseName, buildName, exception, results);
	}
}
