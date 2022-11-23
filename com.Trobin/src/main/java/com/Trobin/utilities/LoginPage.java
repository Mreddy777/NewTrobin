package com.Trobin.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='j_username']") public  WebElement untb;
	@FindBy(xpath="//input[@placeholder='Password']") public WebElement pwtb;
	@FindBy(xpath="//button[normalize-space()='Sign in']") public WebElement lgbutton;
	
	public LoginPage(WebDriver lgdriver) {
		PageFactory.initElements(lgdriver,this);
		
	}

	public void setUntb(String un) {
	       untb.sendKeys(un);
	}

	public void setPwtb(String pw) {
		 pwtb.sendKeys(pw);
	}

	public void setLgbutton() {
		 lgbutton .click();;
	}
	
	
}
