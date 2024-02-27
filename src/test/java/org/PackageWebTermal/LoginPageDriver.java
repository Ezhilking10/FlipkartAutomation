package org.PackageWebTermal;

import org.PackageReuseable.BasicFunction1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class LoginPageDriver extends BasicFunction1 {
	
	
	
	
	
	
	
	
	
public WebElement ServerName()
{
	WebElement e = driver.findElement(By.xpath("//input[@name='server_name']"));
	return e;
}

public WebElement PortNumber()
{
	WebElement e = driver.findElement(By.xpath("//input[@name='port_number']"));
	return e;
}

public WebElement DeviceName()
{
	WebElement e = driver.findElement(By.xpath("//input[@name='terminal_name']"));
	return e;
}

public WebElement Submitbtn()
{
	WebElement e = driver.findElement(By.xpath("//input[@type='submit']"));
	return e;
}

public WebElement TerminalBusy()
{
	WebElement e = driver.findElement(By.xpath("//*[contains(text(),'Terminal is already in use.')]"));
	return e;
}

public WebElement UserId()
{
	WebElement e = driver.findElement(By.xpath("//*[contains(text(),'Terminal is already in use.')]"));
	return e;
}


public WebElement Password()
{
	WebElement e = driver.findElement(By.xpath("//input[@type='password']"));
	return e;
}



public WebElement WarehouseID()
{
	WebElement e = driver.findElement(By.xpath("//input[@name='inputdata']"));
	return e;
}


public WebElement ForkIdentifier()
{
	WebElement e = driver.findElement(By.xpath("//input[@name='inputdata']"));
	return e;
}

public WebElement EnterValue()
{
	WebElement e = driver.findElement(By.xpath("//input[@name='inputdata']"));
	return e;
}

public WebElement F1()
{
	WebElement e = driver.findElement(By.xpath("//input[@value='F1']"));
	return e;
}


}
