package com.keytorc.test.n11_web_Bussiness;

import org.openqa.selenium.WebDriver;

import com.keytroc.test.n11.LoginPage.LoginPage;

public class LoginPageExt extends LoginPage{

	public LoginPageExt(WebDriver driver) {
		super(driver);
	}
	
	public void formFillUp(String email,String pw) {
		getLB().click();
		getEmail().clear();
		getEmail().sendKeys(email);
		getPassWord().clear();
		getPassWord().sendKeys(pw);
		getLoginClick().click();
		
	}

}
