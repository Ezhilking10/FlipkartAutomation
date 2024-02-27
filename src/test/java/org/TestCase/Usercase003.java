package org.TestCase;

import java.awt.AWTException;

import org.PackageManhattan.ManhattanLogin;
import org.PackageReuseable.BasicFunction1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Usercase003 extends BasicFunction1 {
	
	ManhattanLogin login = new ManhattanLogin();
	
	
	@BeforeSuite
	public void lunchingURL() throws AWTException, InterruptedException
	{
		browserLaunch("chrome");
		maximizeScreen();
		urlLaunch("https://trrds.omni.manh.com/omnifacade/#/home");
		ImplicitlyWait(5000);
		Thread.sleep(3000);
	}
	
	@Test (priority = 1)
	public void LoginManhattanSite()
	{
	
		try {
			
			String s = "ezhilarasan.arulpragasam@td-us";	
			SendValues(login.username(),s);
			SendValues(login.password(),"$Nivi@2024");
			clickbtn(login.submitbtn());
			waitForPageLoad();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("failed to connect");
		}
	}
		
		@Test (priority = 2)
		public void InventoryCheck()
		{
		
			try {
				
	
				clickbtn(login.menubtn());
				clickbtn(login.InventorySupplylink());
				waitForPageLoad();
				ImplicitlyWait(5000);
				Thread.sleep(5000);
				SendValues(login.Itemsecrachbtn(), "10489398");
				
				clickbtn(login.Applybtn());
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("InventoryCheck Page");
			}
			
		}
		
		@Test (priority = 3)
		public void CustomerServicepage()
		{
			
			clickbtn(login.menubtn());
			clickbtn(login.CustomerService());
				
			
		}
		
			 
			
		
	

}
