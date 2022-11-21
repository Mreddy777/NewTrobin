package com.Trobin.Trobin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OpenBrowser {
	
	@Test
	public void open() {
		
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/results?search_query=ponnenathe+pakanum+song");
		driver.findElement(By.xpath("//a[@title='Ponni Nadhi - Lyric Video | PS1 Tamil | Mani Ratnam | AR Rahman | Karthi | Ponniyin Selvan Part-1']")).click();
		
		
		
		
	}
	
	

}
