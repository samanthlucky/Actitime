package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass1 {
@BeforeTest
public void openbrowser() {
	Reporter.log("openbrowser",true);
}
@AfterTest
public void closebrowser() {
	Reporter.log("closebrowser",true);
}
@BeforeMethod
public void login() {
	Reporter.log("login",true);
}
	@AfterMethod
	public void Logout() {
		Reporter.log("logout",true);
}
}
