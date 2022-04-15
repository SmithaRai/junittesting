package com.bridgelabz.junittesting;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.Assert;

public class UserEntries {

	  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	  private static final String EMAIL_ID_PATTERN = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+\\.[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_-]+)*$";
	  private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";
	  private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}";
	 
	  
	  public boolean validateFirstName (String fname){
	
          Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
          return pattern.matcher(fname).matches();
	  
              }
    
      public boolean validateLastName (String lname){
    
              Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
              return pattern.matcher(lname).matches();
           }
      
      public boolean validateEmailId (String emailid){
        
               Pattern pattern = Pattern.compile(EMAIL_ID_PATTERN);
               return pattern.matcher(emailid).matches();
        }
    
      public boolean validatePhoneNumber (String pnumber){
          
                Pattern pattern = Pattern.compile(PHONE_NUMBER);
               return pattern.matcher(pnumber).matches();
	  
        }
    
      public boolean validatepassword (String password){
        
             Pattern pattern = Pattern.compile(PASSWORD);
             return pattern.matcher(password).matches();
	  
            }
      
   
       }
    
