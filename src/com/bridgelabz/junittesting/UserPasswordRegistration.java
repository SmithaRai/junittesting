package com.bridgelabz.junittesting;

import java.util.regex.*;

public class UserPasswordRegistration {

	 private static final String PASSWORD_RULE1 = "^[a-zA-Z0-9_-]{8,}$";
	 private static final String PASSWORD_RULE2 = "^[a-zA-Z0-9_-]{8,}[A-Z]+$";
	 
	 public boolean validatepassword_rule1 (String pwd_rule1){
         
         Pattern pattern = Pattern.compile(PASSWORD_RULE1);
         return pattern.matcher(pwd_rule1).matches();
	  
             }
	 
public boolean validatepassword_rule2 (String pwd_rule2){
         
         Pattern pattern = Pattern.compile(PASSWORD_RULE2);
         return pattern.matcher(pwd_rule2).matches();
	  
             }
}
