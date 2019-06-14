package connectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class gitconnectors {
	
	@Test
	public void StopDeploymentTestRun()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("enable-automation");
		option.addArguments("--window-size=1920,1080");
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-extensions");
		option.addArguments("--dns-prefetch-disable");
		option.addArguments("--disable-gpu");
		option.addArguments("-headless");
		driver = new ChromeDriver(option);
		String url = "http://10.10.200.88/QPlatform/";
		String HadoopCluster;
		HadoopCluster="Hdp-13-05-2019 15:21:47";
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
			wePassword.sendKeys("Quad1admin")  ;
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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weconnectors=driver.findElement(By.xpath("//*[@id='manage']/span[1]"));
		weconnectors.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weClusters=driver.findElement(By.id("hadoopClusters"));
		weClusters.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(HadoopCluster);
		WebElement weEdit=driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td[6]/a[1]"));
		weEdit.click();	
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement weTest=driver.findElement(By.id("hdfsTestBtn"));
		weTest.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement weHIVEConfig=driver.findElement(By.id("headinghive"));
		weHIVEConfig.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement weTest1=driver.findElement(By.id("hiveTestBtn"));
		weTest1.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement weOozieConfig=driver.findElement(By.id("collapseOozie"));
		weOozieConfig.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement weTest11=driver.findElement(By.id("oozieTestBtn"));
		weTest11.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weYarnConfig=driver.findElement(By.id("headingYarn"));
		weYarnConfig.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement weTest111=driver.findElement(By.id("yarnTestBtn"));
		weTest111.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement weSave=driver.findElement(By.id("hadoopClusterDsSaveBtn"));
		weSave.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}