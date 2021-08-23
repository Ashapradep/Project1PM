package org.data;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JuntQ6 extends Loginpojo {
	@BeforeClass
	public static void browserLanuch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		launchUrl(" http://www.adactin.com/HotelApp/");
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
	public void tc1() throws IOException {
		Loginpojo l=new Loginpojo();
		 fillText(l.gettxtuser(),getData(4,0));
		 fillText(l.gettxtpass(),getData(2,0));
		 System.out.println("mukesh@gmail.com");
		 System.out.println("pradeep");
	}

}
