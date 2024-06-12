package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		//Here in below xpath to verify that we get notification as checked is displayed or not.
		//XPATH - //span[@class='ui-growl-title'] we used because if we use "Checked" text we may get result as expected but once we uncheck the checkbox again there code will change in DOM. So best option to use standard data.
		WebElement msg=driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		//System.out.println("Message Dispalyed :" + msg.getText());(We can try this way or also below condition using if)
		if(msg.isDisplayed()) {
			System.out.println("Message is Dispalyed");
		}
		else {
			System.out.println("Message is not Displayed");
		}
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//in below xpath can give python as attribute value also we can give what I entered in below xpath.
		driver.findElement(By.xpath("//label[@for='j_idt87:basic:1']")).click();
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		WebElement S=driver.findElement(By.xpath("//span[text()='State has been changed.']/following::p"));
		System.out.println(S.getText());
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement msg1=driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		System.out.println(msg1.getText());
		boolean dis=driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']")).isSelected();
		System.out.println(dis);
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		//driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked']")).click(); //Notworking
		Thread.sleep(2000);
		driver.close();
	
	}

}
