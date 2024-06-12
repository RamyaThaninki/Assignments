package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
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
				//Enter First Name
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ramya");
				//Enter Last Name
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("T");
				//Enter Company name
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("LeafTabs");
				//Enter Title
				//driver.findElement(By.xpath("//title[text()='Create Lead | opentaps CRM']")).sendKeys("Create Lead | opentaps CRM");
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("SeleniumBasics");
				//Click on create Lead button
				driver.findElement(By.className("smallSubmit")).click();
				//Verify title name of your current page
				String title=driver.getTitle();
				System.out.println(title);
				//verify  (Here I have doubt in if condition. Where to check it in DOM?)
				if(title.contains("Create Lead | opentaps CRM")) {
					System.out.println("Verified");
				}else {
					System.out.println("Not verified");
				}
				//java wait
				Thread.sleep(3000);
				//close browser
				driver.close();
		}

		}
