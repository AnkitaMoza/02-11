package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.Workspace;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver ;
	
	
	@BeforeMethod
	public void startup()
	{
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.ig.com/en/login");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='account_id']")).sendKeys("ankita.mozar@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='nonEncryptedPassword']")).sendKeys("Ankita@24.");
		
		driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
		
	    
		
	}
	
	
	
	
	
	
	
	
}
