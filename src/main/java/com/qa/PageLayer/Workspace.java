package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class Workspace extends TestBase {

	public Workspace()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//body/div[@id='ember3']/div[@id='ember6']/nav[@id='ember24']/div[2]/ul[1]/li[5]")
	private WebElement Shares;
	public void clickOnShares()
	{
		Shares.click();
	}
	
	
	@FindBy(xpath="(//div[@class='cell-market-name_wrapper'])[1]")	
	private WebElement Nameof_shares;
	public void clickParticlarShare()
	{
		Nameof_shares.click();
	}
	
	@FindBy(xpath="(//div[@class='ig-ticket-price-button_wrapper'])[2]")	
	private WebElement Buy_Button;
	public void clickOnBuyOption()
	{
		Buy_Button.click();
	}
	
	@FindBy(xpath="(//div[@class='ig-ticket-price-button_wrapper'])[1]")	
	private WebElement Sell_Button;
	public void clickOnSellOption()
	{
		Sell_Button.click();
	}
	
	
	
	@FindBy(xpath="//input[@name='numInput-1665569369760']")	
	private WebElement Size_shares;
	
	public void enterSizeOfShares(int a)
	{
		Size_shares.sendKeys(String.valueOf(a));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
