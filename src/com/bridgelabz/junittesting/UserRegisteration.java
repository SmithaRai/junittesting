package com.bridgelabz.junittesting;

import java.util.regex.*;


public class UserRegisteration {
	
  private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
  private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
  
  public boolean validateFirstName (String fname){
         
            Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
            return pattern.matcher(fname).matches();
	  
                }
      
  public boolean validateLastName (String lname){
      
      Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
      return pattern.matcher(lname).matches();

          }
        }
