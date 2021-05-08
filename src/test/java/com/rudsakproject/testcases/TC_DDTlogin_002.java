package com.rudsakproject.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rudsakproject.PageObjects.Pageobject;
import com.rudsakproject.utilities.XLUtils;

public class TC_DDTlogin_002 extends BaseClass {
	
	
	@Test(dataProvider="Login Data")
	public void LoginDDT(String user,String pwd) 
	{
			
	  Pageobject pg=new Pageobject(driver);
	  pg.ClickLogin();
	  pg.SetUser(user);
	  pg.SetPass(pwd);
	  pg.Logon();
	
	}  
	  
	
	  
	

@DataProvider(name="Login Data")
String [][] getData() throws IOException

{
 String path=System.getProperty("user.dir")+"/src/test/java/com/rudsakproject/testdata/excelfile.xlsx";
 int rowcount=XLUtils.getRowCount(path, "Sheet1");
 int colcount=XLUtils.getCellCount(path, "Sheet1", 1);

 String logindata[][]=new String [rowcount][colcount];
 
 for(int i=1;i<=rowcount;i++)
	 
	 {
		for (int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
		}
		
	 }
  return logindata;


}


}


