package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement Addnewbutton;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCoustmerbtn;

@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement enterCoustmernametbx;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCoustmerDespTbx;

@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement selectCoustDD;

@FindBy(xpath="//div[text()='Big Bang Company' and@class='itemRow cpItemRow ']")
private WebElement bingBangcompany;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createcoustmer;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public WebElement getAddnewbutton() {
	return Addnewbutton;
}

public WebElement getNewCoustmerbtn() {
	return newCoustmerbtn;
}

public WebElement getEnterCoustmernametbx() {
	return enterCoustmernametbx;
}

public WebElement getEnterCoustmerDespTbx() {
	return enterCoustmerDespTbx;
}

public WebElement getSelectCoustDD() {
	return selectCoustDD;
}

public WebElement getBingBangcompany() {
	return bingBangcompany;
}

public WebElement getCreatecoustmer() {
	return createcoustmer;
}

public void setAddnewbutton(WebElement addnewbutton) {
	Addnewbutton = addnewbutton;
}

public void setNewCoustmerbtn(WebElement newCoustmerbtn) {
	this.newCoustmerbtn = newCoustmerbtn;
}

public void setEnterCoustmernametbx(WebElement enterCoustmernametbx) {
	this.enterCoustmernametbx = enterCoustmernametbx;
}

public void setEnterCoustmerDespTbx(WebElement enterCoustmerDespTbx) {
	this.enterCoustmerDespTbx = enterCoustmerDespTbx;
}

public void setSelectCoustDD(WebElement selectCoustDD) {
	this.selectCoustDD = selectCoustDD;
}

public void setBingBangcompany(WebElement bingBangcompany) {
	this.bingBangcompany = bingBangcompany;
}

public void setCreatecoustmer(WebElement createcoustmer) {
	this.createcoustmer = createcoustmer;
}

}


	    
