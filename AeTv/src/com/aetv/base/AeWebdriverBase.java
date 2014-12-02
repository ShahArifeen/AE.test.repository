package com.aetv.base;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.apache.http.NoHttpResponseException;
import org.openqa.selenium.ie.*;




public class AeWebdriverBase extends AbstractAeWebdriverBase{
	

	@Before
	public void setUp() {
		
		driver = new FirefoxDriver();
				
	}
	
		

	@After
	
	public void tearDown() throws Exception{
		
		
	}
}
