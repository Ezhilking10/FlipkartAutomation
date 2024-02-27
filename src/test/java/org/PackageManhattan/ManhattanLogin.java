package org.PackageManhattan;

import org.PackageReuseable.BasicFunction1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ManhattanLogin extends BasicFunction1 {
		
	public WebElement username()
	{
		WebElement e = driver.findElement(By.id("login-username"));
		return e;
	}
	
	public WebElement password()
	{
		WebElement e = driver.findElement(By.id("login-password"));
		return e;
	}
	
	public WebElement submitbtn()
	{
		WebElement e = driver.findElement(By.xpath("//*[@class ='button']"));
		return e;
	}
	
	public WebElement menubtn()
	{
		WebElement e = driver.findElement(By.xpath("//*[@aria-label='menu']"));
		return e;
	}
	
	
	public WebElement InventorySupplylink()
	{
		WebElement e = driver.findElement(By.xpath("//span[text()='Inventory Supply']"));
		return e;
	}
	
	
			
	public WebElement Itemsecrachbtn()
	{
		WebElement e = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		return e;
	}
	
	
	public WebElement Applybtn()
	{
		WebElement e = driver.findElement(By.xpath("//a[text()='APPLY']"));
		return e;
	}
	
	public WebElement Clearbtn()
	{
		WebElement e = driver.findElement(By.xpath("//a[text()='CLEAR']"));
		return e;
	}
	
	public WebElement CustomerService()
	{
		WebElement e = driver.findElement(By.xpath("//*[text()='Customer Service']"));
		return e;
	}
	
	
	
}
