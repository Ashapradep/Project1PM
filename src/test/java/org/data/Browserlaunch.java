package org.data;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Browserlaunch extends Baseclass2{
public static void main(String[]args) throws IOException {
	chromeBrowser();
	maxWindow();
	launchUrl("http://www.greenstechnologys.com/");
	QtLoginpojo l=new QtLoginpojo();
	scrollUp(l.gettxtuser());
	scrollDn(l.gettxtpass());
	clkLnk(l.getbntlogin());
	clkLnk(l.getBn());
	 
}
}
