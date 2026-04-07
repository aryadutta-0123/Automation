package com.ninjacrm.tests;

import java.io.IOException;
import org.testng.annotations.Test;
import com.ninjacrm.pages.Login;
import com.ninjacrm.utilities.BaseTest;

public class TC_001 extends BaseTest
{
	@Test
	public void login() throws IOException
	{
		Login login=new Login(driver);
		login.login();
	}
}