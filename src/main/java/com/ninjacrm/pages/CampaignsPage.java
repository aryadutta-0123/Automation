package com.ninjacrm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CampaignsPage 
{

	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath = "//span[text()='Create Campaign']")
	private WebElement createcampaignbutton;
	
	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement searchbycampaignIddropdown;

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement searchbycampaignIdtextbox;
	
	
	public CampaignsPage(WebDriver driver)
	{
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createCampaignButton()
	{
		wait.until(ExpectedConditions.visibilityOf( createcampaignbutton));
		createcampaignbutton.click();
	}
	
	
	public void searchByCampaignIdDropdown()
	{
		wait.until(ExpectedConditions.visibilityOf(searchbycampaignIddropdown));
		searchbycampaignIddropdown.click();
	}
	
	
	public void searchByCampaignIdTextbox()
	{
		wait.until(ExpectedConditions.visibilityOf(searchbycampaignIdtextbox));
		searchbycampaignIdtextbox.sendKeys();
	}
	
}

