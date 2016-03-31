package com.orangehrm.baseclass;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.menu;

public class logout extends constants
{
	@Test
	public void logoutTest() throws IOException
	{
		String runMode=eo.getCellData(dataEngine,0,4 ,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Logout test case skipped");
		}
		menu menu1=PageFactory.initElements(driver,menu.class);
		menu1.logout();
	}


}
