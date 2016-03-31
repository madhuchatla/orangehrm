package com.orangehrm.baseclass;

import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.loginpage;

public class login extends constants 
{
@Test
public void logintest() throws IOException
{
	driver=new FirefoxDriver();
driver.get("http://opensource.demo.orangehrm.com/");
loginpage lp=PageFactory.initElements(driver,loginpage.class);
String runMode=eo.getCellData(dataEngine,0,1 ,2);
if(runMode.equals("N"))
{
	throw new SkipException("Login test case skipped");
}
lp.loginpanel("Admin","admin");
}
	}


