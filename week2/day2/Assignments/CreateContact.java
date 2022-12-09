package week2.day2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launch Url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser Window
		 driver.manage().window().maximize();	
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("karthik");
		driver.findElement(By.id("lastNameField")).sendKeys("Nach");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kar");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Nach");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Desc");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("harshadkarthik@gmail.com");
		WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select cc = new Select(element1);
		cc.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement element2 = driver.findElement(By.id("updateContactForm_description"));
		element2.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Imp Note");
		driver.findElement(By.xpath("//input[@value='Update']"));
		
		//getTitle
		 System.out.println("Title of Resulting Page: " +driver.getTitle());
		 
		//driver.close();

		

	}

}

