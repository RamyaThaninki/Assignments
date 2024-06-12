package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// Launch Browser
		ChromeDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//pass url
		driver.get("http://leaftaps.com/opentaps");
		//enter the username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Lead tab
		driver.findElement(By.linkText("Leads")).click();
		//create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("XYZABS");
		//Enter First Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Roman");
		//Enter Last Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("King");
		//Enter FirstName Local Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Rom");
		//Department Field using locator
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		//Description Field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working on Edit Lead");
		//Enter Email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("roman@gmail.com");
		//Select state using visible text
		WebElement State= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select S1=new Select(State);
		S1.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[text()='Working on Edit Lead']")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Editing Data as per requirement");
		//update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		System.out.println("Page Title :" + title);
		if(title.contains(" opentaps CRM")) {
			System.out.println("Page Verified");
		}
		else {
			System.out.println("Page not verified");
		}
		Thread.sleep(3000);
	}

}
