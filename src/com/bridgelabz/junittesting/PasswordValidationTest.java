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

	@Test
      public void atleast_one_uppercase_returntrue() {
		
		UserPasswordRegistration obj = new UserPasswordRegistration();
		boolean result = obj.validatepassword_rule2("Niharika_R");
		Assert.assertEquals(true , result);
	
	            }
	
	 public void atleast_one_numeric_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validatepassword_rule3("Smitha_R8");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void exactly_one_specialcharater_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validatepassword_rule4("Smitha_R8@");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample1_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc@yahoo.com,");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample2_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc-100@yahoo.com,");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample3_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc.100@yahoo.com");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample4_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc111@abc.com,");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample5_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc.100@abc.com.au");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample6_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc@1.com,");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample7_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc@gmail.com.com");
			Assert.assertEquals(true , result);
		
		            }
	 
	 public void emailid_sample8_returntrue() {
			
			UserPasswordRegistration obj = new UserPasswordRegistration();
			boolean result = obj.validate_emailid_samples("abc+100@gmail.com");
			Assert.assertEquals(true , result);
		
		            }
	 
	 
	 
	 
	 
	
}
