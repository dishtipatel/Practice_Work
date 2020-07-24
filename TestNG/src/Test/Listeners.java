package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST PASSED SUCCESSFULLY --------------------------");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TEST FAILED  --------------------------");
		//screenshot if code failed
		//response if API is failed
		System.out.println(result.getName());
	}
	
	
}
