package org.data;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotationoder extends Baseclass{
@BeforeClass
public static void browserLanuch() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	launchUrl("https://en-gb.facebook.com/");
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
	WebElement txt = driver.findElement(By.id("email"));
	txt.sendKeys("mukesh@gmail.com");
	WebElement pas = driver.findElement(By.id("pass"));
	pas.sendKeys("123456");
	
}
}
