package com.keytroc.test.n11.TestPAge;

import java.awt.image.SampleModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.keytorc.test.n11_web.Base;
import com.keytorc.test.n11_web_Bussiness.LoginPageExt;
import com.keytorc.test.n11_web_Bussiness.searchPageExt;

public class TestPage {
	Base b = new Base();
	WebDriver driver = b.getDriver();

	@Test
	public void homePage() {
		String url = "https://www.n11.com";
		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Anasayfa görünütüleniyor...");
		Assert.assertNotNull(driver,"Chrome derleyici calıştırılamadı...!");
	}

	@Test
	public void loginPage() throws InterruptedException {
		LoginPageExt sample = PageFactory.initElements(driver, LoginPageExt.class);
		try {

			sample.formFillUp("cedellalahmet@gmail.com", "WLeynm7M");
			Assert.assertTrue(sample.getEmail().isEnabled(), "email girişi gerçekleşmedi..");
			Assert.assertTrue(sample.getPassWord().isEnabled(), "şifre girişi gerçekleşmedi..");
			System.out.println("Üye girişi gercekleştirildi..");
			Assert.assertFalse(sample.getLoginClick().isDisplayed());
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void searchB() throws InterruptedException {
		searchPageExt sample1 = PageFactory.initElements(driver, searchPageExt.class);

		try {
			sample1.searchTake("samsung");

			boolean b = sample1.getSearchButton().isDisplayed();
			Assert.assertTrue(b, "Arama Gerçekleştrilmedi");

			sample1.getSearchTwoPage().click();
			Assert.assertTrue(sample1.getSearchTwoPage().isSelected(), "ikinci sayfa secilemdi..");
			System.out.println("ikinci sayfa gösterimde.");
			sample1.getFallow().click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test
	public void favorite() throws InterruptedException {
		searchPageExt sample1 = PageFactory.initElements(driver, searchPageExt.class);
		try {

			Actions act = new Actions(driver);
			act.moveToElement(sample1.rt()).click(sample1.rt()).perform();
			sample1.il().click();
			sample1.getFcC().click();
			System.out.println("Favori secilen item görüntüleniyor..");
			Thread.sleep(2000);
			sample1.getDfc().click();
			System.out.println("Favori secilen item siliniyor..");
			Thread.sleep(2000);
			System.out.println("İtem silindi...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
