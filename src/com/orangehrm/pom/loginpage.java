package com.orangehrm.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(id="txtUsername")
	WebElement txtUsername;
    @FindBy(id="txtPassword")
    WebElement txtPassword;
    @FindBy(id="btnLogin")
    WebElement btnLogin;
    public void loginpanel(String u,String p)
    {
    	txtUsername.sendKeys(u);
    	txtPassword.sendKeys(p);
    	btnLogin.click();
    	}
}