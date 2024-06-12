package week2.day1assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {
	public static void main(String[] args){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		driver.findElement(By.name("lastname")).sendKeys("Pari");
		driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("6793409876");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Ram@1998");
		WebElement db=driver.findElement(By.name("birthday_day"));
		Select options=new Select(db);
		options.selectByValue("5");
		WebElement ab=driver.findElement(By.name("birthday_month"));
		Select options1=new Select(ab);
		options1.selectByVisibleText("Mar");
		WebElement cd=driver.findElement(By.name("birthday_year"));
		Select options2=new Select(cd);
		options2.selectByValue("1998");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		//driver.close();
	}

}
