package com.bridgelabz.junittesting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserEntriesTest {

	//HAPPY TEST CASES
     @Test
	  public void valid_firstname_returntrue() {
			
		UserEntries obj = new UserEntries ();
			boolean result = obj.validateFirstName("Smitha");
			Assert.assertEquals(true , result);
			
		}
		
		@Test
		public void valid_lastname_returntrue() {
			
			UserEntries	obj = new UserEntries();
			boolean result = obj.validateLastName("Smitha");
			Assert.assertEquals(true , result);
		}

		@Test
		public void valid_emailid_returntrue() {
			
			UserEntries obj = new UserEntries();
			boolean result = obj.validateEmailId("smitha@gmail.com");
			Assert.assertEquals(true , result);
		
		}
		
		@Test
		public void valid_phonenumber_returntrue() {
			
			UserEntries obj = new UserEntries();
			boolean result = obj.validatePhoneNumber("91 2341736897");
			Assert.assertEquals(true , result);
		}
		
		public void valid_password_returntrue() {
			
			UserEntries obj = new UserEntries();
			boolean result = obj.validatepassword("Smitha@1");
			Assert.assertEquals(true , result);
		}
	
		//SAD TEST CASES
		
		@Test
		  public void valid_firstname_returnfalse() {
				
			UserEntries obj = new UserEntries ();
				boolean result = obj.validateFirstName("Smitha ");
				Assert.assertEquals(true , result);
				
			}
			
			@Test
			public void valid_lastname_returnfalse() {
				
				UserEntries	obj = new UserEntries();
				boolean result = obj.validateLastName("rai");
				Assert.assertEquals(true , result);
			}

			@Test
			public void valid_emailid_returnfalse() {
				
				UserEntries obj = new UserEntries();
				boolean result = obj.validateEmailId("smitha.@gmail.com");
				Assert.assertEquals(true , result);
			
			}
			
			@Test
			public void valid_phonenumber_returnfalse() {
				
				UserEntries obj = new UserEntries();
				boolean result = obj.validatePhoneNumber("91 42341736897");
				Assert.assertEquals(true , result);
			}

			@Test
              public void valid_password_returnfalse() {
				
				UserEntries obj = new UserEntries();
				boolean result = obj.validatepassword("sA!@7");
				Assert.assertEquals(true , result);
			}
}

