package org.data;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass2 {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void urlTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
	
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void scrollUp(WebElement ref) {
		 js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView(true)",ref);
	}
	public static void scrollDn(WebElement ref) {
		 js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView(false)", ref);

	}
	public static void  clkLnk(WebElement ref) {
		ref.click();
	}
}
