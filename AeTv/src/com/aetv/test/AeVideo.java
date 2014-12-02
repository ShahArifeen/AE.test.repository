package com.aetv.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.aetv.base.AeWebdriverBase;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class AeVideo extends AeWebdriverBase{
	
	
	@Test
	
	public void MvpdsTest() throws Exception{ 
		
		driver.get("http://www.aetv.com");
		driver.manage().window().maximize(); //maximizing windows

		
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("aetn.video.adobePass.logout();"); //Adobe logout
		}
		
//		driver.manage().deleteAllCookies();
			
		
		//Optimum
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 	//WaitTimer
		clickByXpath("//.//*[@id='google-search']/span[1]"); 				//Search Storage war episode- "The-emperor-of-el-monte"
		typeByIdInput("gsc-i-id1", "the emperor of el monte"); 				//typing the name of the episode
		driver.findElement(By.id("gsc-i-id1")).sendKeys(Keys.ENTER);		//Hit Enter
		clickByXpath("//.//*[@id='google-cse']/div/div/div[1]/div[5]/div[2]/div/div/div[1]/div[1]/table/tbody/tr/td[2]/div[1]/a"); //click on the top result
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); 	//WaitTimer

	    clickByXpath("//div[@id='mvpd-picker-tier1-list']/div[5]"); 		//Select Provider- Optimum
	    TimeUnit.SECONDS.sleep(5);
	    driver.findElement(By.id("IDToken1")).clear(); 						//clear id box
	    typeByIdInput("IDToken1","research46");	//login Id					//Putting id
	    driver.findElement(By.id("IDToken2")).clear();					
	    driver.findElement(By.id("IDToken2")).sendKeys("support46");		//Putting Password
	    driver.findElement(By.id("signin_button")).click();					//Submit
	    
	    TimeUnit.SECONDS.sleep(40);											//wait for video stream
	    
	    clickByXpath(".//*[@id='logout']");
	    
	    	//Direct tv

		clickByXpath("//.//*[@id='mvpd-picker-head-exit']"); 				//close the login lightbox
	    TimeUnit.SECONDS.sleep(5);											//wait for video stream

		clickByXpath("//.//*[@id='full-episode-ul']/li[2]/a/div[1]"); 		//Click on Episode "Lock to Berfest"
		clickByXpath("//.//*[@id='mvpd-picker-tier1-list']/div[3]"); 		//Select Provider- Direct tv
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS); 	//WaitTimer
		
		driver.switchTo().frame("mvpdframe");
		
		typeByXpathInput("//.//*[@id='usernameInputId']","premierhdtesting2@yahoo.com");
	    driver.findElement(By.id("rememberCheckboxId")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("password");
	    driver.findElement(By.id("loginSubmitId")).click();
	 
	    TimeUnit.SECONDS.sleep(30);											//wait for video stream

	    clickByXpath(".//*[@id='logout']"); //sign out
		clickByXpath("//.//*[@id='mvpd-picker-head-exit']"); 				//close the login lightbox


		//Bright House
		
		clickByXpath("//.//*[@id='full-episode-ul']/li[2]/a/div[1]"); 		//Click Episode- Auction Boogalu
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 	//Wait Timer
		TimeUnit.SECONDS.sleep(10);

		
		driver.findElement(By.xpath("//.//*[@id='mvpd-picker-tier1-list']/div[1]")).click();//Bright House Login
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 	//Wait Timer
		
		TimeUnit.SECONDS.sleep(5);
		
	    driver.findElement(By.id("loginFormUsername")).clear();
	    driver.findElement(By.id("loginFormUsername")).sendKeys("AgentAccess");
	    driver.findElement(By.id("loginFormPassword")).clear();
	    driver.findElement(By.id("loginFormPassword")).sendKeys("AgentAccess100");
	    driver.findElement(By.cssSelector("button.ctaButton")).click();
		
		
		TimeUnit.SECONDS.sleep(40);
	    clickByXpath(".//*[@id='logout']"); //sign out
		clickByXpath("//.//*[@id='mvpd-picker-head-exit']"); 				//close the login lightbox
		
		
		//Dish Tv
		
		clickByXpath("//.//*[@id='full-episode-ul']/li[2]/a/div[1]"); 		//Click Episode- My Little Brony
		
		driver.findElement(By.cssSelector("div.overlay")).click();
	    driver.findElement(By.xpath("//div[@id='mvpd-picker-tier1-list']/div[4]")).click();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS); 	//Wait Timer

		driver.switchTo().frame("mvpdframe");
		
	    driver.findElement(By.id("username")).clear();
	    driver.findElement(By.id("username")).sendKeys("dish prog 4");
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("dish1234");
	    driver.findElement(By.name("remember_me")).click();
	    driver.findElement(By.id("login")).click();
		TimeUnit.SECONDS.sleep(30);

		
	    clickByXpath(".//*[@id='logout']"); //sign out
		clickByXpath("//.//*[@id='mvpd-picker-head-exit']"); 
		
		//Time Warner cable

		clickByXpath("//.//*[@id='full-episode-ul']/li[2]/a/div[1]"); //hestered-in-the-highlands
		clickByXpath("//.//*[@id='mvpd-picker-tier1-list']/div[8]"); //Click on Time Warner
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 	//Wait Timer
		
		driver.switchTo().frame("mvpdframe");

	    driver.findElement(By.id("loginFormUsername")).clear();
	    driver.findElement(By.id("loginFormUsername")).sendKeys("tve177");
	    driver.findElement(By.id("loginFormPassword")).clear();
	    driver.findElement(By.id("loginFormPassword")).sendKeys("N22dJLQw");
	    driver.findElement(By.xpath("//.//*[@id='loginForm']/button")).click();
		TimeUnit.SECONDS.sleep(30);
		
		
	    clickByXpath(".//*[@id='logout']"); //sign out
		clickByXpath("//.//*[@id='mvpd-picker-head-exit']"); 
		
		//Verizon Fios
		
		
		clickByXpath("//.//*[@id='full-episode-ul']/li[2]/a/div[1]"); 		//Click Episode- Hestered in Highlands
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); 	//Wait Timer
		clickByXpath("//.//*[@id='mvpd-picker-tier1-list']/div[9]");
		driver.findElement(By.xpath("//.//*[@id='IDToken1']")).clear();
		driver.findElement(By.xpath("//.//*[@id='IDToken1']")).sendKeys("resxxqx0");	//putting id
		driver.findElement(By.xpath("//.//*[@id='IDToken2']")).clear();
		driver.findElement(By.xpath("//.//*[@id='IDToken2']")).sendKeys("12345qwert");	//putting password
		clickByXpath("//.//*[@id='sign-page']/div[6]/div[3]/button");					//submit
		
		
	
		
	}
	

}
