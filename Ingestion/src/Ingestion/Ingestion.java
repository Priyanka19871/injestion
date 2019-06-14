package Ingestion;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ingestion {

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
	String profile="Ingestion_16 ";
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
	WebElement weingestion=driver.findElement(By.xpath("//*[@id='ingestion']/span"));
	weingestion.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement weoverview=driver.findElement(By.xpath("//*[@id='ingoverview']"));
	weoverview.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement weadd=driver.findElement(By.xpath("//*[@id='addIngestionBtn']"));
	weadd.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	/*WebElement weName=driver.findElement(By.xpath("//*[@id=\"ingestionForm\"]/div[1]/div/div/div/label"));
	weName.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	WebElement weIngestionName=driver.findElement(By.xpath("//*[@id=\'ingestionForm\']/div[1]/div/div/div/div/input"));
	weIngestionName.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement ingestionForm=driver.findElement(By.xpath("//*[@id='ingestionForm']/div[1]/div/div/div/div/input"));
	if(ingestionForm.isDisplayed() && ingestionForm.isEnabled()){
		ingestionForm.sendKeys(profile);
	Assert.assertTrue(true, "profile entered");
	}
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement DataSource_dropdown1=driver.findElement(By.xpath("//*[@id='ingestionForm']/div[2]/div/div[1]/fieldset/div/div[5]/div[1]/div/select"));
	Select ds_dd=new Select(DataSource_dropdown1);
	ds_dd.selectByVisibleText("rdbms-200.82");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement Tables_dropdown1=driver.findElement(By.xpath("//*[@id=\'ingestionForm\']/div[2]/div/div[1]/fieldset/div/div[5]/div[2]/div/select"));
	Select tb_dd=new Select(Tables_dropdown1);
	tb_dd.selectByVisibleText("APP_CONNECTIVITY");
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement wePreview=driver.findElement(By.xpath("//*[@id=\'ingestionForm\']/div[2]/div/div[1]/fieldset/div/div[5]/div[4]/div/input"));
	wePreview.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement Type_dropdown1=driver.findElement(By.name("tgtDSType"));
	Select type_dd=new Select(Type_dropdown1);
	type_dd.selectByVisibleText("Hadoop");
	
    try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		WebElement Hadoop_dropdown1=driver.findElement(By.name("tgtDS"));
		Select hadoop_dd=new Select(Hadoop_dropdown1);
		hadoop_dd.selectByVisibleText("CDH5-165");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement Data_dropdown1=driver.findElement(By.name("tgtHDDS"));
		Select data_dd=new Select(Data_dropdown1);
		data_dd.selectByVisibleText("HDFS");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weoutput=driver.findElement(By.xpath("//*[@id='elipsebtn']"));
		weoutput.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weuser=driver.findElement(By.xpath("//*[@id=\'files\']/li[2]/a/span"));
		weuser.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weadmin=driver.findElement(By.xpath("//*[@id=\'files\']/li[2]/a/span"));
		weadmin.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement wecreate=driver.findElement(By.xpath("//*[@id=\'fileBrowserDialog\']/div[2]/div/div[5]/div[2]/div[2]/button"));
		wecreate.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement wefolder= driver.findElement(By.xpath("//*[@id=\'fileBrowserDialog\']/div[2]/div/div[5]/div[3]/div[1]/div[1]/input"));
		if(wefolder.isDisplayed() && wefolder.isEnabled()){
			wefolder.sendKeys("test_16");
			Assert.assertTrue(true, "foldername entered");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	WebElement wecreate1=driver.findElement(By.xpath("//*[@id='fileBrowserDialog']/div[2]/div/div[5]/div[3]/div[1]/div[2]/button"));
		wecreate1.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weselect=driver.findElement(By.xpath("//*[@id=\'fileBrowserDialog\']/div[2]/div/div[5]/div[2]/div[1]/button"));
		weselect.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement wefields=driver.findElement(By.xpath("//*[@id='ingestionForm']/div[2]/div/div[2]/fieldset/div/div[2]/div[3]/div[3]/div/input"));
		if(wefields.isDisplayed() && wefields.isEnabled()){
			wefields.sendKeys("/t");
		Assert.assertTrue(true, "wefields entered");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement welines=driver.findElement(By.xpath("//*[@id='ingestionForm']/div[2]/div/div[2]/fieldset/div/div[2]/div[3]/div[4]/div/input"));
		if(welines.isDisplayed() && welines.isEnabled()){
			welines.sendKeys("/n");
		Assert.assertTrue(true, "wefields entered");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement wesave=driver.findElement(By.xpath("//*[@id=\'ingestionForm\']/div[3]/div/button[2]"));
		wesave.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}}