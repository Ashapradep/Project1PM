package org.data;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DdQ10 extends Baseclass {
	public static void main(String[]args) throws IOException {
		chromeBrowser();
		maxWindow();
		urlTitle();
		launchUrl("http://adactinhotelapp.com/"); 
		WebElement name = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		
		fillText(name,getData(3,0));
		fillText(pass,getData(4,0));
		
		
	}
	}
