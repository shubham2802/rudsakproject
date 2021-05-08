package com.rudsakproject.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.rudsakproject.utilities.ReadConfig;

public class BaseClass {
	ReadConfig read=new ReadConfig();
	public String baseURL=read.geturl();
	public String username=read.getuserid();
	public String password=read.getpassword();
	
	public static WebDriver driver;
	
	
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String br){
	
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", read.getchromepath());
	    driver=new ChromeDriver();
		}
	    
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", read.getfirefoxpath());
		    driver=new FirefoxDriver();
		}
	     
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", read.getedgepath());
			driver = new EdgeDriver();
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		
	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	
	
	
	

}
