package com.ninjacrm.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath = "//a[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath = "//a[text()='Campaigns']")
	private WebElement campaigns;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contacts;
	
	@FindBy(xpath = "//a[text()='Leads']")
	private WebElement leads;
	
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunities;
	
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath = "//a[text()='Quotes']")
	private WebElement quotes;
	
	@FindBy(xpath = "//a[text()='Purchase Order']")
	private WebElement purchaseorder;

	@FindBy(xpath = "//a[text()='Sales Order']")
	private WebElement salesorder;

	@FindBy(xpath = "//a[text()='Invoice']")
	private WebElement invoice;
	
	@FindBy(xpath = "(//li[@class='nav-item'])[11]")
	private WebElement adminconsole;
	
	@FindBy(xpath = "(//div[@class='user-icon-container'])[2]")
	private WebElement logoutbotton;
	
	
	public HomePage(WebDriver driver)
	{
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void homepageValidation()
	{
		wait.until(ExpectedConditions.titleIs("Ninza CRM"));
		if(driver.getTitle().equals("Ninza CRM"))
			System.out.println("user has navigated to home page");
		else
			System.out.println("user has not navigated to home page");
	}
	
	public void dashBoard()
	{
		wait.until(ExpectedConditions.visibilityOf(dashboard));
		dashboard.click();
	}
	
	public void campaigns()
	{
		wait.until(ExpectedConditions.visibilityOf(campaigns));
		campaigns.click();
	}
	
	public void contacts()
	{
		wait.until(ExpectedConditions.visibilityOf(contacts));
		contacts.click();
	}
	
	public void leads()
	{
		wait.until(ExpectedConditions.visibilityOf(leads));
		leads.click();
	}
	
	public void opportunities()
	{
		wait.until(ExpectedConditions.visibilityOf(opportunities));
		opportunities.click();
	}
	
	public void products()
	{
		wait.until(ExpectedConditions.visibilityOf(products));
		products.click();
	}
	
	public void quotes()
	{
		wait.until(ExpectedConditions.visibilityOf(quotes));
		quotes.click();
	}
	
	public void  purchaseOrder()
	{
		wait.until(ExpectedConditions.visibilityOf( purchaseorder));
		 purchaseorder.click();
	}
	
	public void  salesOrder()
	{
		wait.until(ExpectedConditions.visibilityOf( salesorder));
		salesorder.click();
	}
	
	public void  invoice()
	{
		wait.until(ExpectedConditions.visibilityOf(invoice));
		invoice.click();
	}
	
	public void  adminconsole()
	{
		wait.until(ExpectedConditions.visibilityOf(adminconsole));
		adminconsole.click();
	}
	
	public void  logoutButton()
	{
		wait.until(ExpectedConditions.visibilityOf(logoutbotton));
		logoutbotton.click();
	}
}

