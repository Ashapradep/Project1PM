package org.data;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbusjt extends Baseclass{
	@BeforeClass
	public static void browserLanuch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		launchUrl("https://www.redbus.in/");
		maxWindow();
	}
	@Before
	public void startTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() {
		WebElement txt = driver.findElement(By.id("signin-block"));
		txt.click();
		WebElement bnt = driver.findElement(By.id("hc"));
		bnt.click();
	}

}
