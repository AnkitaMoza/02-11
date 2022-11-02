package com.qa.TestLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.PageLayer.Workspace;
import com.qa.TestBase.TestBase;

public class VerifyBuyOption extends TestBase {

	@Test
   public void verifyBuy() throws InterruptedException
   {
		Thread.sleep(2000);
		
		Workspace space = new Workspace();
	    space.clickOnShares();
	    space.clickParticlarShare();
    	space.clickOnBuyOption();
	    space.enterSizeOfShares(2);
	   
	   
	   
   }
	
	
	
	
	
}
