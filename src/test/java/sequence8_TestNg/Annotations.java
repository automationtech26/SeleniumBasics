package sequence8_TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	
	  @BeforeSuite
	  public void testSuite() {
		System.out.println("Set global env variables to framework \n"
				+ "	  Like have different URLs for test, set up Google Keys, JIRA Keys, then set here"
				+ "It will get executed after all test folders in test suite");
	  }
	
	
	  @BeforeTest
	  public void beforeTest() {
		System.out.println("Intializing, creating server connections, creating DB Connections");
		System.out.println("Scope is before all tests which defined in <test> folder in testNG XML");
	  
	  }
	
	  
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Will execute before any test in this class");
	  }
	  
	  
	  
	  
	  
	  
	  //In case of inheritance, parent class can have @BeforeMethod data and test class can focus on @Test
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This will get executed before every test case"
		  		+ "Its specific class file"
		  		+ "We can JIRA Token in case its validatity is for less time so that its created before every run");
	  }
	  
		  
	  
	  
	  //In case of inheritance, parent class can have @AfterMethod data and test class can focus on @Test
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This test case will get executed after every test case");
	  }
	  
	  
	  
	  
	  //TestNG picks test case alphabetically order, if starting letters are same then it will check middle letters
	  @Test
	  public void myXTest1() {
		  System.out.println("MyTest1");
		  
	  }
  
	  
	  //TestNG picks test case alphabetically order, if starting letters are same then it will check middle letters
	  @Test
	  public void myYTest2() {
		  System.out.println("MyTest2");
		  
	  }
	  
	  
	  
	  //TestNG picks test case alphabetically order, if starting letters are same then it will check middle letters
	  @Test
	  public void myZTest3() {
		  System.out.println("MyTest3");
		  
	  }
  
	  
	  
	  
	  @Test(groups = {"smoke"})
	  public void myZTest4() {
		  System.out.println("MyTest4");
		  
	  }
	  
	  
	  
	  
	  @Test(groups = {"smoke"})
	  public void myZTest5() {
		  System.out.println("MyTest5");
		  
	  }
	  
	  
	  
	  
	  
	  @Test(dependsOnMethods = "myZTest7")
	  public void myZTest6() {
		  System.out.println("MyTest6");
		  
	  }
	  
	  
	  
	  @Test(groups = {"smoke"})
	  public void myZTest7() {
		  System.out.println("MyTest7");
		  
	  }
	  
	  
	  
	  
	  //this annotation will skip a test case
	  @Test(enabled = false)
	  public void myZTest8() {
		  System.out.println("MyTest8");
		  
	  }
	  
	  
	  
	  
	  
	  //Will wait for 40 seconds before throwing an error
	  @Test(timeOut = 4000)
	  public void myZTest9() {
		  System.out.println("MyTest9");
		  
	  }
	  
	  
	  
	  //like we can send some GIVEN, WHEN, THEN
	  //This value will be fetched from testNG.xml
	  @Parameters({"URL", "APIKeyUserName"})
	  @Test
	  public void myZTest10(String urlName, String apiKeyUserName) {
		  System.out.println(urlName);
		  
	  }
	  
	  
	
	  
	  
	  
	  
	  @DataProvider
	  public Object[][] createDataProvider() {
		  
		//3 iterations with 2 datas
		  Object[][] dataObject = new Object[3][2];
		  dataObject[0][0] = "userName1";
		  dataObject[0][1] = "password1";
		  
		  dataObject[1][0] = "userName2";
		  dataObject[1][1] = "password2";
		  
		  dataObject[2][0] = "username3";
		  dataObject[2][1] = "password3";
		  
		  return dataObject;
		  
	  }
	  
	  
	  
	  @Test(dataProvider = "createDataProvider")
	  public void myZTest11(String userName1, String password) {
		  System.out.println(userName1);
		  System.out.println(password);
		  
	  }
  
  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("Closing server connection, closing DB Connection, stop the process, creating reports");
		  System.out.println("Scope is after all tests which are mentioned in <test> folder in testNG XML");
	  }
	  
	  
	  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("Will get executed after entire XML file");
	  }
	  
	  
	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("Will execute after any test in this class");
	  }
}
