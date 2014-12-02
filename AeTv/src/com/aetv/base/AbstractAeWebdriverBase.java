package com.aetv.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class AbstractAeWebdriverBase {
	
	public WebDriver driver;
	   
	 public void typeByIdInput(String locator,String value){
		 driver.findElement(By.id(locator)).sendKeys(value);
	 }
	 public void typeByCssInput(String locator,String value){
		 driver.findElement(By.cssSelector(locator)).sendKeys(value);
	 }
	 public void typeByXpathInput(String locator,String value){
		 driver.findElement(By.xpath(locator)).sendKeys(value);
	 }
	 public void typeByNameInput(String locator,String value){
		 driver.findElement(By.name(locator)).sendKeys(value); 
	 }
	 public void clickById(String locator){
		 driver.findElement(By.id(locator)).click();
	 }
	 public void clickByCss(String locator){
		 driver.findElement(By.cssSelector(locator)).click();
	 }
	 public void clickByXpath(String locator){
		 driver.findElement(By.xpath(locator)).click();
	 }
	 public void clickByName(String locator){
		 driver.findElement(By.name(locator)).click();
	 }
	public void clearById(String locator){
		driver.findElement(By.id(locator)).clear();
	}
	public void clearByCss(String locator){
		driver.findElement(By.cssSelector(locator)).clear();
	}
	public void clearByXpath(String locator){
		driver.findElement(By.xpath(locator)).clear();
	}
	public void clearByName(String locator){
		driver.findElement(By.name(locator)).clear();
	}

}
