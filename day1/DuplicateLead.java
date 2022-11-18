package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Open Browser
		 ChromeDriver driver = new ChromeDriver();
		//Launch url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize
		driver.manage().window().maximize();
		
		//Entering the Username and Password
		//Storing the locator.
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Clicking on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Clicking on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Creating Lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		WebElement dropSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(dropSource);
		dd.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Karthik");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("harshadkarthik@gmail.com");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddState = new Select(state);
		ddState.selectByVisibleText("California");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println("Added Successfully!! Resulting page =	"+title);
		
		//Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("CTS");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.clear();
		firstName.sendKeys("karthik");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Record is Duplicated!! Resulting Page = "+driver.getTitle());

	}

}
