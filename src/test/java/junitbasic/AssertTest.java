package junitbasic;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({AssertLogut.class,AssertLogin.class})  
public class AssertTest {
	
	//we can achieve the above method in the following also
	@Test
	public void tc1()
	{
		Result r = JUnitCore.runClasses(AssertLogin.class, AssertLogut.class);
		System.out.println(r.getRunCount());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunTime());
		System.out.println(r.getFailureCount());
		
		List<Failure> f = r.getFailures();
		for (Failure failure : f) {
			System.out.println(failure);
			
		}
		
	}

}
