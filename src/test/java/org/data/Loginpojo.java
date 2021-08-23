package org.data;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpojo extends Baseclass {
public  Loginpojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement txtUser;
@FindBy(xpath="//input[@type='password']")
private WebElement txtPass;
@FindBy(xpath="//a[@href='Register.php']")
private WebElement btnLogin;
public WebElement gettxtuser() {
	return txtUser;
	}
	public WebElement gettxtpass() {
		return txtPass;
	}
	public WebElement getbntlogin() {
		return btnLogin;
}









}
