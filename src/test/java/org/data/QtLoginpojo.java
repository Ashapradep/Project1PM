package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QtLoginpojo extends Baseclass2{
	public  QtLoginpojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='blue_text'])[1]")
	private WebElement srDn;
	@FindBy(xpath="(//a[@href='index.html'])[2]")
	private WebElement srUp;
	@FindBy(xpath="//a[@href='Certifications.html']")
	private WebElement btnLogin;
	@FindBy(xpath="(//a[@href='http://www.greenstechnologys.com/oracle-training-in-chennai.html'])[2]")
	private WebElement bnt;
	public WebElement gettxtuser() {
		return srDn;
		}
		public WebElement gettxtpass() {
			return srUp;
		}
		public WebElement getbntlogin() {
			return btnLogin;
		}
			public WebElement getBn() {
				return bnt;
			}
	}

