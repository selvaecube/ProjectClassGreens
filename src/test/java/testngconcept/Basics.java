package testngconcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basics {

	@BeforeClass
	private void start()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	private void tc4()
	{
		System.out.println("Before method");
	}
	
	@Test(priority =-1,invocationCount =3)
	private void tc1()
	{
		System.out.println("Test Case 1");
	}
	@Test(priority=1)
	private void tc2()
	{
		System.out.println("Test Case 2");
	}
	@AfterMethod
	private void tc5()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	private void end()
	{
		System.out.println("After Class");
	}
}
