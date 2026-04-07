package com.ninjacrm.pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(xpath = "//img[@alt='Inventory Management']")
	private WebElement appLogo;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Username']")
	private WebElement usernametextbox;
	
	@FindBy(xpath = "//input[@placeholder='Enter Your Password']")
	private WebElement passwordtextbox;

	@FindBy(xpath = "//button[text()='Sign In']")
	private WebElement signinbutton;
	
	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement forgotpasswordlink;
	
	@FindBy(xpath = "//a[text()='Create Account']")
	private WebElement createaccountbutton;
	
	
	public Login(WebDriver driver)
	{
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginpageValidation()
	{
		wait.until(ExpectedConditions.titleIs("Ninza CRM"));
		if(driver.getTitle().equals("Ninza CRM"))
			System.out.println("user has navigated to login page");
		else
			System.out.println("user has not navigated to login page --- check url");
	}
	
	public void validateLogo()
	{
		wait.until(ExpectedConditions.visibilityOf(appLogo));
		if(appLogo.isDisplayed())
			System.out.println("application logo is displayed in the login page");
		else
			System.out.println("application logo is not displayed in the login page");
	}
	
	public void login()
	{
		wait.until(ExpectedConditions.visibilityOf(usernametextbox));
		usernametextbox.sendKeys("rmgyantra");
		
		wait.until(ExpectedConditions.visibilityOf(passwordtextbox));
		passwordtextbox.sendKeys("rmgy@9999");
		
		wait.until(ExpectedConditions.visibilityOf(signinbutton));
		signinbutton.click();
	}
	
	}



