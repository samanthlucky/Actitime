package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
@FindBy(id="logoutLink")
private WebElement LogOut;

@FindBy(xpath="//div[text()='Tasks']")
private WebElement tasksTab;


public Homepage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void setLogOut() {
	LogOut.click();
}
public void setTasksTab() {
	tasksTab.click();
	
}

}
