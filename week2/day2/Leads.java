package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

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
	 
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();	 
	 System.out.println(leadID);
	 
	}

}
