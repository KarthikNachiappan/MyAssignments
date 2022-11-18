package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup browser
				WebDriverManager.chromedriver().setup();
				
				//Launch browser
			 ChromeDriver driver = new ChromeDriver();
			 
			  //Launch url
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 
			 //Maximise
			 driver.manage().window().maximize();
			 
			 //Leaftap login
			 //WebElement eleUsername = driver.findElement(By.id("username"));
			 WebElement eleUsername = driver.findElement(By.xpath("//input[@id='username']"));
			 eleUsername.sendKeys("DemoSalesManager");
			 
			 //Leaftap pwd
			 //WebElement elePwd = driver.findElement(By.id("password"));
			 WebElement elePwd = driver.findElement(By.xpath("//input[@id='password']"));
			 elePwd.sendKeys("crmsfa");
			 
			 //click Login
			 //driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			 	
			 
			 //Click CRMSFA
			 //driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.xpath("//div[@class='crmsfa'][@id='button']")).click();
			 
			 //click Leads
			 //driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			 
			 //Click create Leads
			 driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
			 //driver.findElement(By.linkText("Create Lead")).click();
			 
			 //Enter company name, First and last name
			 //WebElement eleCompName = driver.findElement(By.id("createLeadForm_companyName"));
			 WebElement eleCompName = driver.findElement(By.xpath("//input[@id= 'createLeadForm_companyName']"));
			 eleCompName.sendKeys("TCS");

			 WebElement eleFName = driver.findElement(By.xpath("//input[@id= 'createLeadForm_firstName']"));
			 eleFName.sendKeys("Karthik");
			 
			 WebElement eleLName = driver.findElement(By.xpath("//input[@id= 'createLeadForm_lastName']"));
			 eleLName.sendKeys("Karthik");
			 
			 // Select source from dropdown
			 //WebElement eleSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
			 //Select dd = new Select (eleSourceDD);
			 //dd.selectByValue("LEAD_CONFERENCE");
			 //dd.selectByIndex(2);
			 	 
			 
			 driver.findElement(By.name("submitButton")).click();
			 
			// driver.close();

	}

}
