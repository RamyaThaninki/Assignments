package week2.day2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class LeafGroundButton {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		driver.findElement(By.xpath("//title[text()='Dashboard']"));
		String D=driver.getTitle();
		if(D.contains("Dashboard")) {
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Not verified");
		}
		driver.navigate().back();
		boolean dis= driver.findElement(By.xpath("//span[text()='Disabled']")).isSelected();
		System.out.println(dis);
		Object position= driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("Element Position :" + position);
		WebElement Colour= driver.findElement(By.xpath("//span[text()='Save']"));
		System.out.println("Background Colour is : "+ Colour.getCssValue("background-color"));
		WebElement HeightWidth=driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println("Height & Width is :" +HeightWidth.getSize());
		driver.close();
	}

}
