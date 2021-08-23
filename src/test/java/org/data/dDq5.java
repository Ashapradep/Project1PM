package org.data;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dDq5 extends Baseclass{
public static void main(String[]args) throws IOException {
	chromeBrowser();
	maxWindow();
	urlTitle();
	launchUrl("https://en-gb.facebook.com/"); 
	
	WebElement name = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement bntLong = driver.findElement(By.xpath("//button[@name='login']"));
	

	fillText(name,getData(4,0));
	fillText(pass,getData(2,0));
	clickPr(bntLong);	
	
	
}
}
