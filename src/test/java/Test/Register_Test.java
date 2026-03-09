package Test;

import BaseClass.Basic_BrowserSetup;
import PageClass.RegisterFrom.Register_Signup;

public class Register_Test extends Basic_BrowserSetup {

	public static void main(String[] args) {
		
		Register_Test test = new Register_Test();
		test.setup();
		
		Register_Signup register = new Register_Signup(test.driver);
		
		
	
		
		
		register.enterFirstName("sai");
		register.enterLastName("prasad");
		register.enterAddress("Your address text here");
		register.enterEmail("saiprasadp555@gmail.com");
		register.enterGender("Male");
		register.enterLanguage("Arabic");

	}

}
