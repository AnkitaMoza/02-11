package com.qa.TestLayer;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.qa.PageLayer.Dashboard;
import com.qa.TestBase.TestBase;

public class DashBoard extends TestBase{

	@Test
	public void verifydashboard() throws InterruptedException
	{
		Dashboard dash = new Dashboard();
		//Thread.sleep(5000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
//		wait.until(ExpectedConditions.)
         dash.clickOnCFD();
		
		
		
	}
	
	
}
