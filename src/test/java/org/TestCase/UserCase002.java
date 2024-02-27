package org.TestCase;

import java.awt.AWTException;


import org.PackageReuseable.BasicFunction1;
import org.PackageWebTermal.LoginPageDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserCase002 extends BasicFunction1 {
	
	
	LoginPageDriver login = new LoginPageDriver();
	
	
	
	
	
	@BeforeMethod
	public void lunchingURL() throws AWTException, InterruptedException
	{
		browserLaunch("chrome");
		maximizeScreen();
		urlLaunch("http://10.192.132.160/webtrmgw/webtrmgw."
				+ "dll?MfcISAPICommand=ProcessTerminalForm&terminal_name=WWJ016&"
				+ "server_name=WJHJUMP13AQA1&echo_type=Y&inputdata=F1");
		ImplicitlyWait(5000);
		
	}	
	
	@Test (priority = 1)
	public void LoginWebtremal()
	{
		try {
			
			 SendValues(login.ServerName(), "WJHJUMP13AQA1");
			 SendValues(login.PortNumber(), "4600");
			 SendValues(login.DeviceName(), "WWJ016");
			 clickbtn(login.Submitbtn());
    		 waitForPageLoad();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("failed to connect");
		}
		
	}
	
	@Test (priority = 2)
	public void LoginuserId()
	{
		try {
			
			 SendValues(login.ServerName(), "WJHJUMP13AQA1");
			 SendValues(login.PortNumber(), "4600");
			 SendValues(login.DeviceName(), "WWJ016");
			 clickbtn(login.Submitbtn());
    		 waitForPageLoad();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("failed to connect");
		}
		
	}

}
