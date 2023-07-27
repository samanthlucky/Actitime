package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;
import com.actitime.pom.Homepage;
import com.actitime.pom.TaskListPage;

public class CoustmerModule extends Baseclass{
@Test
public void testCreateCoustmer() {
	Homepage h = new Homepage(driver);
	h.setTasksTab();
	TaskListPage t = new TaskListPage(driver);
	t.getAddnewbutton().click();
	t.getNewCoustmerbtn().click();
	t.getEnterCoustmernametbx().sendKeys("HDFC-001");
	t.getEnterCoustmerDespTbx().sendKeys("Bankingproject");
	t.getSelectCoustDD().click();
	t.getBingBangcompany().click();
	t.getCreatecoustmer().click();
	
	
}
}
