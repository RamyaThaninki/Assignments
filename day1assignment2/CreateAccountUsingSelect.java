package week2.day1assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingSelect {
	private static final String LEAD_EMPLOYEE = null;
	private static final String TX = null;

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
				//Enter AccountName
				driver.findElement(By.id("accountName")).sendKeys("Thaninki");
				//Enter description
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
				//Select Industry
				WebElement db=driver.findElement(By.name("industryEnumId"));
				//create object for select class
				Select options=new Select(db);
				//call the method
				options.selectByVisibleText("Computer Software");
				//options.selectByValue(IND_SOFTWARE);
				//options.selectByIndex(2);
				WebElement ab=driver.findElement(By.name("ownershipEnumId"));
				Select options1=new Select(ab);
				options1.selectByVisibleText("S-Corporation");
				WebElement cd=driver.findElement(By.id("dataSourceId"));
				Select options2=new Select(cd);
				options2.selectByValue("LEAD_EMPLOYEE");
				WebElement ef=driver.findElement(By.id("marketingCampaignId"));
				Select options3=new Select(ef);
				options3.selectByIndex(5);
				WebElement gh=driver.findElement(By.id("generalStateProvinceGeoId"));
				Select options4=new Select(gh);
				options4.selectByValue("TX");
				//click create account
				driver.findElement(By.className("smallSubmit")).click();
				String title=driver.getTitle();
				System.out.println(title);
				if(title.contains("Create Account | opentaps CRM")) {
					System.out.println("Verified");
				}else {
					System.out.println("Not verified");
					Thread.sleep(3000);
					driver.close();
				}
				}
				}