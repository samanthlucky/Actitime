package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CoustmerModule1 {
@BeforeMethod
public void Login() {
	Reporter.log("Login",true);
}
	@AfterMethod
	public void Logout() {
	Reporter.log("logout",true);
}
	@Test
	public void createcoustmer() {
		Reporter.log("creatercoustmer",true);
	}
		@Test
		public void modifycoustmer() {
			Reporter.log("modifycoustmer",true);
			
		}
	}

