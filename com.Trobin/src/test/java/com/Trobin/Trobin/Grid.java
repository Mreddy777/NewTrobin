package com.Trobin.Trobin;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid {
	
	 @Parameters("browser")
	@Test
	public void launch_browser(String browser) throws MalformedURLException, InterruptedException {
		//String browser="chrome";
	WebDriver driver;
		
		  if (browser.equalsIgnoreCase("firefox")) {
		         System.out.println(" Executing on FireFox");
		       //  String Node = "http://192.168.1.8:5555/wd/hub";
		         DesiredCapabilities cap = new DesiredCapabilities();
		         cap.setBrowserName("firefox");
		         
		         driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         
		         // Launch website
		         driver.get("https://www.youtube.com/results?search_query=ponni+nadhi+song");
		         driver.manage().window().maximize();
		         Thread.sleep(3000);
//		         driver.findElement(By.id("search")).sendKeys("ponni nadhi song",Keys.ENTER);
//		         Thread.sleep(3000);
		       driver.findElement(By.xpath("//a[@title='Ponni Nadhi - Lyric Video | PS1 Tamil | Mani Ratnam | AR Rahman | Karthi | Ponniyin Selvan Part-1']")).click();
		        
		      } else if (browser.equalsIgnoreCase("chrome")) {
		         System.out.println(" Executing on CHROME");
		         DesiredCapabilities cap = new DesiredCapabilities();
		         cap.setBrowserName("chrome");
		         //String Node = "http://192.168.1.8:5555/wd/hub";
		         driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		         
		         // Launch website
		         driver.get("https://www.youtube.com/results?search_query=ponni+nadhi+song");
		         driver.manage().window().maximize();
		         Thread.sleep(3000);
//		         driver.findElement(By.id("search")).sendKeys("ponni nadhi song",Keys.ENTER);
//		         Thread.sleep(3000);
		         driver.findElement(By.xpath("//a[@title='Ponni Nadhi - Lyric Video | PS1 Tamil | Mani Ratnam | AR Rahman | Karthi | Ponniyin Selvan Part-1']")).click();
		        
	}

}
}