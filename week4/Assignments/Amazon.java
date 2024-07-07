package week4.Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

		public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		String price=driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText();
		System.out.println("Price of the product : " + price);
		WebElement R=driver.findElement(By.xpath("(//span[@class=\"a-size-base s-underline-text\"])[1]"));
		System.out.println("No.of Customers Rating : " + R.getText());
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		//windowHandles
		Set<String> WindowHandles=driver.getWindowHandles();
		System.out.println(WindowHandles);
		//convert set to list
		List<String> windows=new ArrayList<String>(WindowHandles);
		driver.switchTo().window(windows.get(1));
		WebElement Image=driver.findElement(By.xpath("//img[@id=\"landingImage\"]"));
		File scrnsht= Image.getScreenshotAs(OutputType.FILE);
		File dst=new File("./Amazonsnip/img.png");
		FileUtils.copyFile(scrnsht, dst);
		Thread.sleep(3000);
		Actions Act=new Actions(driver);
		WebElement AC=driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		Act.moveToElement(AC).perform();
		AC.click();
		//note: if we declare below line 47 as web element that it will throw an error while using if condition. for if it won't accept web element. So make sure to use string type if we need to use contains method.
		//And we should mention gettext() for string type or it may throw an error.
		String Subtotal=driver.findElement(By.xpath("(//span[text()='₹29,899.00'])[8]")).getText();
		System.out.println("SubTotal : " + Subtotal);
		//String[] split=Subtotal.split(" ");
		//String CartSubTotal=split[0];
		//System.out.println("CartSubTotal : " + CartSubTotal);
		if(Subtotal.contains(price)) {
			System.out.println("Product price and cart subtotal is same");
		}
		else {
			System.out.println("Product price is not same as cart price");
		}
		Thread.sleep(3000);
		driver.close();
		//switching back to main page
		driver.switchTo().window(windows.get(0));
		driver.close();
	}

}
