package org.data;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DdQ extends Baseclass {
	public static void main(String[]args) throws IOException {
		chromeBrowser();
		maxWindow();
		urlTitle();
		launchUrl("https://my.naukri.com/account/createaccount"); 
		WebElement txt = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		clickPr(txt);
		WebElement name = driver.findElement(By.id("fname"));
		WebElement pass = driver.findElement(By.id("email"));
		WebElement repass = driver.findElement(By.xpath("//input[@name='password']"));
		
		fillText(name,getData(3,0));
		fillText(pass,getData(4,0));
		fillText(repass,getData(2,0));
		
		
	}
}
