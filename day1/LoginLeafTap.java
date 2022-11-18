package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeafTap {

	public static void main(String[] args) {
		
		//setup browser
		WebDriverManager.chromedriver().setup();
		
		//Launch browser
	 ChromeDriver driver = new ChromeDriver();
	 
	  //Launch url
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 
	 //Maximise
	 driver.manage().window().maximize();
	 
	 //Leaftap login
	 WebElement eleUsername = driver.findElement(By.id("username"));
	 eleUsername.sendKeys("DemoSalesManager");
	 
	 //Leaftap pwd
	 WebElement elePwd = driver.findElement(By.id("password"));
	 elePwd.sendKeys("crmsfa");
	 
	 //click Login
	 driver.findElement(By.className("decorativeSubmit")).click();
	 	
	 
	 //Click CRMSFA
	 driver.findElement(By.linkText("CRM/SFA")).click();
	 
	 //click Leads
	 driver.findElement(By.linkText("Leads")).click();
	 
	 //Click create Leads
	 driver.findElement(By.linkText("Create Lead")).click();
	 
	 //Enter company name, First and last name
	 WebElement eleCompName = driver.findElement(By.id("createLeadForm_companyName"));
	 eleCompName.sendKeys("TCS");

	 WebElement eleFName = driver.findElement(By.id("createLeadForm_firstName"));
	 eleFName.sendKeys("Karthik");
	 
	 WebElement eleLName = driver.findElement(By.id("createLeadForm_lastName"));
	 eleLName.sendKeys("Karthik");
	 
	 // Select source from dropdown
	 WebElement eleSourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select dd = new Select (eleSourceDD);
	 dd.selectByValue("LEAD_CONFERENCE");
	 //dd.selectByIndex(2);
	 	 
	 
	 driver.findElement(By.name("submitButton")).click();
	 
	// driver.close();

	}

}
