package org.PackageReuseable;





import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicFunction1 {
	
	
	WebDriverWait wait;

	public static WebDriver driver;
	/*
	public static WebDriver chromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}
	*/
	
	public static WebDriver browserLaunch(String bname) {
		if (bname.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			
		}
		return driver;
	}
	
	
	//--------------------------------
	
	
	public static void urlLaunch(String url) {
		driver.get(url);
		
	}
	
	//--------------------------------
	
	
	public static void maximizeScreen() {
		driver.manage().window().maximize();
		
	}
	
	
	//----------------------------------
	
	public static void ImplicitlyWait(int a) {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	//----------------------------------
	
	public void SendValues(WebElement element,String text) {
		element.sendKeys(text);
		
	}
	
	
	

	
	//----------------------------------
	
	public void clickbtn( WebElement e) {
		e.click();
	}
	
	//----------------------------------
	
	public static void refresh() {
		driver.navigate().refresh();
	}

	//----------------------------------
	
	
	public static void quitbtn() {
		driver.quit();
	}
	
	//---------------------------------- cna't able to call this method 

	
	public static void  closebtn() {
		driver.close();
	}
	
	//----------------------------------
	
	public static void clear(WebElement e) {
		e.clear();
	}
	
	
	//----------------------------------
	
	
	public static void MoveToElement (WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}
	
	
	
	//----------------------------------
	
	
	public static void dragananddrop (WebElement src , WebElement trg) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, trg).perform();
	}
	
	//----------------------------------
	
	public static void selectByIndex(WebElement e , int a ) {
		Select s = new Select(e);
		s.selectByIndex(a);
	}
	
	public static  String gettext(WebElement e) {
		String text = e.getText();
		return text;
		
	}
	
	public static void screenshot() throws IOException {
		
		TakesScreenshot  name = (TakesScreenshot)driver;
		File firstScr =   name.getScreenshotAs(OutputType.FILE); // al files comes under the java only 
		File dest = new File("./snap/img.png");
		FileHandler.copy(firstScr, dest);
	}
	
	
	
	//----------------------------------
	public static void Alert() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

	}
	
	
	//----------------------------------
	public static void Frams() {
		driver.switchTo().frame(0);
	}
	
	//----------------------------------
		
	public boolean ElementFound(WebElement element) {
		boolean b = false;

		try {
			b = element.isDisplayed();
		} catch (NoSuchElementException e) {

		}
		return b;

	}
	
	
	//----------------------------------------
	
	public void waitForPageLoad() {
		wait = new WebDriverWait(driver, 100);
		wait.until(new Function<WebDriver, Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
		return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")).equals("complete");
		}});
		}
	


}
