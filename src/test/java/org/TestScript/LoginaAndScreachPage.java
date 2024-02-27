package org.TestScript;

import java.security.KeyStore.PrivateKeyEntry;

import org.PackageReuseable.BasicFunction1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginaAndScreachPage extends BasicFunction1 {
	
	public void loginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[text()='Login']")
	private WebElement LoingBtn;
	
	
	@FindBy(xpath = "//*[@class = 'fa fa-bars fa-fw']")
	private WebElement LefthandScreachbtn;
	
	
	@FindBy(xpath = "(//*[@type = 'text'])[1]")
	private WebElement Textfieldbtn;
	
	@FindBy(xpath = "//*[text()='Query']")
	private WebElement RunQuerybtn;
	
	
	
	
	
	
	
	
	
	

	public WebElement getLoingBtn() {
		return LoingBtn;
	}

	public WebElement getLefthandScreachbtn() {
		return LefthandScreachbtn;
	}

	public WebElement getTextfieldbtn() {
		return Textfieldbtn;
	}

	public WebElement getRunQuerybtn() {
		return RunQuerybtn;
	}

	
	
	
	

}
