package com.keytorc.test.n11_web_Bussiness;

import org.openqa.selenium.WebDriver;

import com.keytroc.test.n11.LoginPage.searchPage;

public class searchPageExt extends searchPage {

	public searchPageExt(WebDriver driver) {
		super(driver);
	}

	public void searchTake(String search) {
		getSearch().clear();
		getSearch().sendKeys(search);
		getSearchButton().click();
		getSearchTwoPage().click();
		getFallow().click();
		rt().click();
		il().click();
		getFcC().click();
		getDfc().click();

	}

}
