package com.keytroc.test.n11.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.keytorc.test.n11_web.Base;

public class LoginPage extends Base {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public By loginClickBt = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[2]/div/div/a[1]");

	public WebElement getLB() {
		return driver.findElement(loginClickBt);
	}

	public By email = By.id("email");

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public By pWord = By.id("password");

	public WebElement getPassWord() {
		return driver.findElement(pWord);
	}

	public By pLoginB = By.id("loginButton");

	public WebElement getLoginClick() {
		System.out.println("Test Case : 2 Calısıyor üye girişi gercekleştriliyor...");
		return driver.findElement(pLoginB);
	}

}
