package junitbasic;

import org.junit.Test;

import junit.framework.Assert;

public class AssertLogut {
	@Test
	public void tc1() {
		//Login
		String Webtxt ="Invalid password";
		String doctxt="invalid creditials";
		Assert.assertTrue("Validating the Error msg",Webtxt.equals(doctxt));
		System.out.println(".....Test case 1....");
		
	}

	@Test
	public void tc2() {
		//Payment
		Assert.assertEquals("Validating the expiry date", "Invalid Expiry", "Invalid exp");
		System.out.println(".....Test case 2....");
		
	}
	
	@Test
	public void tc3() {
		//Logout
		System.out.println(".....Test case 3....");
		
	}
}
