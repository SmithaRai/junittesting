package com.bridgelabz.junittesting;

import org.junit.After;
import  org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class UserValidatorTest {

	@Test
	public void test() {
		
		UserRegisteration obj = new UserRegisteration();
		boolean result = obj.validateFirstName("Smitha");
		Assert.assertEquals(true , result);
		
		
		
	}
	
	@Test
	public void valid_lastname() {
		
		UserRegisteration obj = new UserRegisteration();
		boolean result = obj.validateLastName("Smitha");
		Assert.assertEquals(true , result);
	}

	@Test
	public void valid_emailid() {
		
		UserRegisteration obj = new UserRegisteration();
		boolean result = obj.validateEmailId("smitha@gmail.com");
		Assert.assertEquals(true , result);
	
	}
	
	@Test
	public void valid_phonenumber() {
		
		UserRegisteration obj = new UserRegisteration();
		boolean result = obj.validatePhoneNumber("91 2341736897");
		Assert.assertEquals(true , result);
	}
	
}
