package com.ninjacrm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCampaignPage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(name = "campaignId")
	private WebElement campaignIdtextbox;
	

	@FindBy(name = "campaignName")
	private WebElement campaignnametextbox;
	
	@FindBy(name = "campaignStatus")
	private WebElement campaignstatustextbox;
	

	@FindBy(name = "targetSize")
	private WebElement targetsizetextbox;
	
	@FindBy(xpath = "//button[text()='Create Campaign']")
	private WebElement createcampaignbutton;
	
	
	public CreateCampaignPage(WebDriver driver)
	{
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void campaignIdTextbox()
	{
		wait.until(ExpectedConditions.visibilityOf(campaignIdtextbox));
		campaignIdtextbox.click();
	}
	
	public void campaignNameTextbox()
	{
		wait.until(ExpectedConditions.visibilityOf(campaignnametextbox));
		campaignnametextbox.sendKeys("HpLaptophub");
	}
	
	public void targetSizeTextbox()
	{
		wait.until(ExpectedConditions.visibilityOf(targetsizetextbox));
		targetsizetextbox.clear();
		targetsizetextbox.sendKeys("123");
	}

}

