package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Dashboard extends TestBase{

	public Dashboard()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='tooltip-container flex'])[1]")
	private WebElement CFD;
	
	public void clickOnCFD()
	{
		CFD.click();
	}
	
	
}
