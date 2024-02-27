package org.TestCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.PackageReuseable.BasicFunction1;
import org.TestScript.LoginaAndScreachPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.node.BooleanNode;

public class UserCase001 extends BasicFunction1 {
	
	
	LoginaAndScreachPage t = new LoginaAndScreachPage();

	@BeforeMethod
	public void lunchingURL() throws AWTException, InterruptedException
	{
		browserLaunch("chrome");
		maximizeScreen();
		urlLaunch("http://wjhjump13wqa1.corp.torrid.com:30000/core/Default.html");
		ImplicitlyWait(50);
		
	}	
	
	
	@Test
	public void AfterLoginEleCheck() throws InterruptedException, AWTException
	{
		
		login();
		
		Thread.sleep(3000);
		
		login();
		
		Thread.sleep(3000);
		
		login();
		
		
	}
	

	
	
	// loginbtn - //*[text()='Login']
	//lefthandhadertbn = //*[@class = 'fa fa-bars fa-fw']
	//(//*[@type = 'text'])[1]  -- text filed 
	// appointment - WA Appointment (is display) - search appointment log 
	// run the query - //*[text()='Query']


	//@AfterMethod
	public void Closingbrow()
	{
		driver.close();
	}

	public void login() throws InterruptedException, AWTException {
		Robot robot = new Robot();		
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyRelease(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_2);
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_DECIMAL);
		robot.keyRelease(KeyEvent.VK_DECIMAL);
		
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		Thread.sleep(10000);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_4);
		
		robot.keyPress(KeyEvent.VK_CAPS_LOCK);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
		robot.keyRelease(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_I);		
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_V);		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_I);		
		robot.keyRelease(KeyEvent.VK_I);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_2);
		
		robot.keyPress(KeyEvent.VK_2);		
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_0);		
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_2);		
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_4);		
		robot.keyRelease(KeyEvent.VK_4);
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}
