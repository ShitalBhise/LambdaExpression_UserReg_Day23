package com.lambda;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public String regex;
/*
 * to enter a valid First Name
 */
	public boolean FirstName(String firstName) {
		regex = "[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(firstName);
		return m.matches();
	}
/*
 * to enter a valid Last Name
 */
	public boolean LastName(String lastName) {
		regex = "[a-z]{2,}[A-Z]{1}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lastName);
		return m.matches();
	}
/*
 * to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts and 
 * 2 optional (xyz & in) with precise @ and . positions
 */
	public boolean Email(String email) {
		regex = "^[a-z]+([.][a-z]+)*@bl+[.]co([.]in)*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}
/*
 * to follow pre -defined 
 * Mobile Format - E.g. 91 9919819801 - 
 * Country code follow by space and 10 digit number
 */
	public boolean MobileNum(String mobile) {
		regex = "^[1-9]{2} [1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobile);
		return m.matches();
	}
/*
 * to follow pre -defined 
 * Password rules.
 * Rule1
 * – minimum 8 Characters - NOTE – All rules must be
 */
	public boolean PasswordAtleastOneSpecialChar(String pass) {
		regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*]).{8}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pass);
		return m.matches();
	}
}
