package com.ninjacrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class BaseTest 
{
public static WebDriver driver;
public static Properties p;
public static void loadpropertiesFile() throws IOException
{
	FileInputStream fis=new FileInputStream("./src/main/resources/config.properties");
	p=new Properties();
	p.load(fis);
}

@BeforeSuite
public void testEnvironment() throws IOException
{
	BaseTest.loadpropertiesFile();
	Reporter.log("test execution happening in : " +p.getProperty("environment"),true);
}
	
@BeforeClass
public void setup() throws IOException
{
	ChromeOptions setting=new ChromeOptions();
	Map<String, Object> prefs= new HashMap<>();
	prefs.put("profile.password_manager_leak_detection", false);
	setting.setExperimentalOption("prefs", prefs);
	driver=new ChromeDriver(setting);
	driver.manage().window().maximize();
	driver.get("http://49.249.28.218:8098/");
}

@AfterClass
public void teardown()
{
	if(driver!=null)
    {
        driver.quit();
    }
}
}
		

	
	