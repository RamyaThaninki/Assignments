package week4.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Sri");
		alert.accept();
		WebElement RS=driver.findElement(By.xpath("//p[contains(text(),'Hello Sri!')]"));
		System.out.println(RS.getText());
		/*if(RS.contains("Hello Sri! How are you today?")) {
			System.out.println("Verified");
		}
		else {                                        //should not use this commented code. What conditional stmt can we ude fot webelement & string
			System.out.println("Not Verified");
		}*/
		driver.close();
	}

}
