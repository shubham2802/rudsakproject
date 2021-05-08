package com.rudsakproject.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rudsakproject.PageObjects.Pageobject;

public class TC_loginTest_001 extends BaseClass {

	
	@Test
	
	public void logintest() throws InterruptedException
	{
		
		Pageobject obj=new Pageobject(driver);
		obj.ClickLogin();
		obj.SetUser(username);
		obj.SetPass(password);
		obj.Logon();
		Thread.sleep(3000);
		
		//String url=driver.getCurrentUrl();
		//Assert.assertEquals(url, "https://rudsak.com/account#https://rudsak.com/");
	
		if (driver.getTitle().equals("Account – Page Order History – Rudsak"))
	    {
			Assert.assertTrue(true);
		}
		else
		{
		Assert.assertTrue(false);
		
		}
		
	}
	
	
	}	
	
	
	

