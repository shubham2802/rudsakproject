package com.rudsakproject.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageobject {

	WebDriver ldriver;
	
	public Pageobject(WebDriver rdriver)
	{
		ldriver=rdriver; 
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(linkText="Login")
	WebElement log;
	
	@FindBy(xpath="//input[@id='CustomerLogin-header-CustomerEmail']")
	WebElement user;
	
	@FindBy(xpath="//input[@id='CustomerLogin-header-CustomerPassword']")
	WebElement pass;
	
	@FindBy(xpath="//header/div[1]/div[4]/div[3]/form[1]/div[2]/button[1]")
	WebElement loginbutton;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutbutton;
	
	public void ClickLogin() {
		log.click();
	}
	
	
	public void SetUser(String uname)
	{
	user.sendKeys(uname);
	}
	
	public void SetPass(String password)
	{
	pass.sendKeys(password);
	}
	
	public void Logon() 
	{
		loginbutton.click();
	}
	 
	public void Logout()
	{
		logoutbutton.click();
	}
}
