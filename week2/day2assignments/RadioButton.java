package week2.day2assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
		boolean uncheck= driver.findElement(By.xpath("//label[text()='Hyderabad']")).isSelected();
		System.out.println("Option is enabled :" + uncheck);
		boolean checked= driver.findElement(By.xpath("(//label[text()='Safari'])[2]")).isSelected();
		//boolean checked= driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]")).isSelected();
		System.out.println("Safari already selected :" + checked);
		//WebElement checked1= driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		//System.out.println("Safari already selected :" + checked1.getText());
		boolean age=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println("Age :" + age);
		}
	}


