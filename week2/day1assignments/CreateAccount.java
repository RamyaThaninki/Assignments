package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
				//click on Account tab
				driver.findElement(By.linkText("Accounts")).click();
				//create account
				driver.findElement(By.linkText("Create Account")).click();
				//Enter Account Name
				driver.findElement(By.id("accountName")).sendKeys("Ramya");
				//driver.findElement(By.className("text")).sendKeys("Ramya");
				//Enter description
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
				//Enter site name
				driver.findElement(By.id("officeSiteName")).sendKeys("LeafTabs");
				//Enter number of employees
				driver.findElement(By.id("numberEmployees")).sendKeys("5");
				//Click on create Account button
				driver.findElement(By.className("smallSubmit")).click();
				//Verify title name of your current page
				String title=driver.getTitle();
				System.out.println(title);
				//verify  (Here I have doubt in if condition. Where to check it in DOM?)
				if(title.contains("Account Details | opentaps CRM")) {
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
