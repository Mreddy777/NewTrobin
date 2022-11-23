package com.Trobin.Trobin;

import org.testng.annotations.Test;

import com.Trobin.utilities.LoginPage;

public class Login_to_App extends BaseTest{
@Test
	public void verify_Login() {
	
		LoginPage lp=new LoginPage(driver);
	   lp.setUntb("Mahesh_Reddy");
	   lp.setPwtb("Reddy@777");
	   lp.setLgbutton();
		
		
	}
	
	
	
	
	
}
