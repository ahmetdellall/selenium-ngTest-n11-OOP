package com.keytroc.test.n11.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.keytorc.test.n11_web.Base;

public class searchPage extends Base {
	public WebDriver driver;

	public searchPage(WebDriver driver) {
		this.driver = driver;
	}

	public By search = By.id("searchData");

	public WebElement getSearch() {
		System.out.println("arama cubuğu seciliyor");
		return driver.findElement(search);
	}

	public By SBxPath = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/a");

	public WebElement getSearchButton() {
		System.out.println("arama butunona basılıyor..");
		return driver.findElement(SBxPath);
	}

	public By sbt = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]/a[2]");

	public WebElement getSearchTwoPage() {
		System.out.println("Listelenen sayfalarının 2.'si seciliyor...");
		return driver.findElement(sbt);
	}

	public By fbt = By.xpath("//*[@id=\"p-211090835\"]/div[2]/span");

	public WebElement getFallow() {
		System.out.println("favori seciliyor..");
		return driver.findElement(fbt);
	}

	public WebElement rt() {

		System.out.println(" hesabıma gidiliyor....");

		return driver.findElement(By.xpath("//a[contains(text(),'ahmet dellal')]"));
	}

	public By il = By.xpath(" /html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[6]/a[1]");

	public WebElement il() {
		System.out.println("istek listesine/favorilere giriliyor..");
		return driver.findElement(il);
	}

	public By fc = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[3]/ul[1]/li[1]/div[1]/a[1]/h4[1]");

	public WebElement getFcC() {
		return driver.findElement(fc);
	}

	public By dFc = By.xpath(
			"/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/span[1]");

	public WebElement getDfc() {
		return driver.findElement(dFc);
	}

}
