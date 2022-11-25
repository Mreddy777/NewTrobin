package com.Trobin.Trobin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest {
	
public static	WebDriver driver;

	@BeforeMethod
	public void open() throws Throwable {
		
		
		
	
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8080/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  //  Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@title='Ponni Nadhi - Lyric Video | PS1 Tamil | Mani Ratnam | AR Rahman | Karthi | Ponniyin Selvan Part-1']")).click();
		
		
		
		
	}
	
	

}
