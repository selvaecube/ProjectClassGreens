package junitbasic;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginJunit {
	
	@BeforeClass
	public static void start() {
		System.out.println("Before Class");
		//code to launch the browser
	}
	
	@Before
	public void tc4()
	{
		System.out.println("Before");
		//System.out.println(new Date());
	}
	@Test
	public void tc1()
	{
		System.out.println("Test Case 1");
	}
	@Test
	public void tc3()
	{
		System.out.println("Test Case 3");
	}
	@Test
	public void tc2()
	{
		System.out.println("Test Case 2");
	}
	@After 
	public void tc5()
	{
		System.out.println("After");	
	}
	
	@AfterClass
	public static void end() {
		System.out.println("Test case end");
	}
	
	
	
	
	
	
	
	

}
