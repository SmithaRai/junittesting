package com.bridgelabz.junittesting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidationTest {

	@Test
	public void minimum_eight_character_returntrue() {
		
		UserPasswordRegistration obj = new UserPasswordRegistration();
		boolean result = obj.validatepassword_rule1("Niharika");
		Assert.assertEquals(true , result);

	
	}

}
