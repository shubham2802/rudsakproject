package com.rudsakproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() 
	{
		
		File src=new File("./Configuration/config.properties");
		try{ 
			FileInputStream fis=new FileInputStream(src) ;
		    pro=new Properties();
	        pro.load(fis);
		   } catch(Exception e)
		 {
		System.out.println("Error message is"+ e.getMessage());
	     }
		
	}
	
	
	    public String geturl() {
		String url=pro.getProperty("baseURL");
		return url;
		
	    }
	
        public String getuserid() {
        	String userid=pro.getProperty("username");
			return userid;
        }

        public String getpassword() {
        	String password=pro.getProperty("password");
			return password;
			
        }

        public String getchromepath() {
        	String chromepath=pro.getProperty("chromedriver");
			return chromepath;
			
			}


        public String getfirefoxpath() {
        	String firepath=pro.getProperty("firefoxdriver");
			return firepath;
			
			}

        public String getedgepath() {
        	String edgepath=pro.getProperty("edgedriver");
			return edgepath;
			
			}


}
	
	

