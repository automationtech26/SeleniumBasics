package sequence9_ItestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

	/*
	 * 
	 * Add mapping in TestNG xml also
	 * ITestListener interface implements TestNG Listener
	 * 
	 * 
	 * 	<listeners>
			<listener class-name="sequence9_ItestListener.Listeners"></listener>
		</listeners>
	
	
	 *  ITestResult class has track of test class, methods, etc
	 *
	 *
	 *
	
	 * */


public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("I successfully executed Listeners Pass code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		System.out.println("TestNG Failure - Test Method" + result.getTestName());
		System.out.println("TestNG Failure - Test class" + result.getName());
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	
	
	/*
	 * ItestListener interface which implements all TestNG listeners
	 * 
	 * 
	 * */
	

}
