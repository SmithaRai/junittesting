package com.bridgelabz.junittesting;

import  org.junit.Assert;

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

}
