package Winequalitygit;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class git {

	public static WebDriver driver;
	
	@Test
	
	public void testNewUrl() throws Exception {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("enable-automation");
	option.addArguments("--window-size=1920,1080");
	option.addArguments("--no-sandbox");
	option.addArguments("--disable-extensions");
	option.addArguments("--dns-prefetch-disable");
	option.addArguments("--disable-gpu");
	//Set the setHeadless is equal to true which will run test in Headless mode
	//option.setHeadless(true);
	option.addArguments("-headless");
	driver = new ChromeDriver(option);
	String url = "http://10.10.200.88/QPlatform/";
	String ProjectName="WineQuality ";
	driver.get(url);
	driver.manage().window().maximize();		
	driver.manage().deleteAllCookies();
    WebDriverWait wait = new WebDriverWait(driver, 30);
    
    WebElement weUser = driver.findElement(By.id("userName"));
	if(weUser.isDisplayed() && weUser.isEnabled()){
		weUser.sendKeys("anilk");
		Assert.assertTrue(true, "User name entered");
	}
	else{
		System.out.println("User name is not displayed");
		Assert.assertTrue(false, "User name not found");
		
	}
	WebElement wePassword= driver.findElement(By.id("password"));
	if(wePassword.isDisplayed() && wePassword.isEnabled()){
		wePassword.sendKeys("Quad1admin");
		Assert.assertTrue(true, "Password entered");
	}
	else{
		System.out.println("Password is not displayed");
		Assert.assertTrue(false, "Password not found");
	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement weLogin = driver.findElement(By.xpath("//button[text()='Login']"));
	weLogin.click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement weProject =driver.findElement((By.xpath("//*[@id='home']/div[2]/div/div/div/div[1]")));
	weProject.click();
   
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
   WebElement wedelete =driver.findElement(By.xpath("//*[@id='projectDeleteBtn']"));
   wedelete.click();
   
   Thread.sleep(5000);
   
   driver.findElement(By.xpath("//*[@id='deleteProjectModal']//*[@id='deleteConfirmBtn']")).click();
	
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   WebElement weArchivedProjects =driver.findElement(By.xpath("//*[@id='page-wrapper']/div[3]/div/div/div[2]/div/div/div/ul/li[3]/a"));
   weArchivedProjects.click();
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   WebElement weArchieve =driver.findElement((By.xpath("//*[@id='archive']/div[1]/div/div/div/div[1]")));
   weArchieve.click();
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   WebElement webutton =driver.findElement(By.xpath("//*[@id='projectUnarchiveBtn']"));
   webutton.click();
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   driver.findElement(By.xpath("//*[@id='deleteProjectModal']//*[@id='deleteConfirmBtn']")).click();
	
   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
