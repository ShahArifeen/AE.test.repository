package com.aetv.base;

import com.thoughtworks.selenium.DefaultSelenium;


public class AbstractAeSeleniumBase {
	
	public DefaultSelenium selenium;
	   
	 public void browserOpen(String URL){
		 selenium.open(URL);
	 }
	 public void browserClose(){
		 selenium.close();
	 }
	 public void typeByIdInput(String locator,String value){
		
	 }
	 public void typeByCssInput(String locator,String value){
		
	 }
	 public void typeByXpathInput(String locator,String value){
		
	 }
	 public void typeByNameInput(String locator,String value){
		 
	 }
	 public void clickById(String locator){
		
	 }
	 public void clickByCss(String locator){
		
	 }
	 public void clickByXpath(String locator){
		
	 }
	 public void clickByName(String locator){
		
	 }
	public void clearById(String locator){
		
	}
	public void clearByCss(String locator){
		
	}
	public void clearByXpath(String locator){
		
	}
	public void clearByName(String locator){
		
	}

}
