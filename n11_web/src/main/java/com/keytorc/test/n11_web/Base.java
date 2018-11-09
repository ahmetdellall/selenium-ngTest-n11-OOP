package com.keytorc.test.n11_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver=null;

	public WebDriver getDriver() {
		driver = new ChromeDriver();
		return driver;
	}
	public Base() {
		// TODO Auto-generated constructor stub
	}

}
