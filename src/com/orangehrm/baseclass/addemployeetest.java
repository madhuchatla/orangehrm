package com.orangehrm.baseclass;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.orangehrm.pom.addemployee1;
import com.orangehrm.pom.menu;

public class addemployeetest extends constants
{
	@Test
	public void addEmpTest() throws IOException
	{
		addemployee1 aep=PageFactory.initElements(driver,addemployee1.class);
		String runMode=eo.getCellData(dataEngine,0,2 ,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("AddEmp test case skipped");
		}
		else
		{
		
		menu m1=PageFactory.initElements(driver,menu.class);
		
		int rowCount=eo.getRowCount(empList,0);
		for(int i=1;i<=rowCount;i++)
		{
			m1.pim();
			Sleeper.sleepTightInSeconds(10);
			Row r=eo.getRow(empList,0,i);
			aep.addEmployeetest(r);
		}
		}
	}

}



