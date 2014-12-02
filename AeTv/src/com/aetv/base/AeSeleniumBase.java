package com.aetv.base;
import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;


public class AeSeleniumBase {
	
	protected Selenium selenium; 

	@Before
	public void setUp() throws Exception{
		
//		RemoteControlConfiguration remoteControl = new RemoteControlConfiguration();
//		remoteControl.setPort(4445);
		
		//Selenium Server
//		SeleniumServer seleniumserver=new SeleniumServer(remoteControl);
//		seleniumserver.boot();
//		seleniumserver.start();
//		seleniumserver.getPort();


		
		//Selenium Client
		selenium = new DefaultSelenium("localhost",4444,"*firefox","http://www.emusic.com");
		selenium.start();
		selenium.open("/");
		selenium.windowMaximize();
		selenium.setSpeed("6000");
		selenium.windowFocus();
				

	
	}
	
	
	
	@After
	public void close() {
		
//		selenium.stop();
		selenium.close();
		
		
	
	}
	
	

}
