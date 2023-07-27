package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class coustmerModule2 {
@BeforeMethod
public void OpenBrowser() {
	Reporter.log("OpenBrowser");
}
@AfterMethod
public void CloseBrowser() {
	Reporter.log("CloseBrowser",true);
}
@BeforeMethod
public void login() {
	Reporter.log("login",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logout",true);
}
@Test
public void  registerCoutmer() {
	Reporter.log("registercoustmer",true);
}
@Test
public void deleteCoustmer() {
Reporter.log("deletecoustmer",true);	
	
}
}

