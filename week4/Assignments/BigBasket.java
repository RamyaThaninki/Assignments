package week4.Assignments;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bigbasket.com/");
		driver.findElement(By.xpath("(//button[contains(@id,'headlessui-menu-button')])[4]")).click();
		//We can use mentions action event to perform click action as shown in line 20,21. Or we can also directly use .click() in line 18 itself.
		Actions Act=new Actions(driver);
		WebElement mouseover=driver.findElement(By.xpath("(//a[@role='none'])[3]"));
		//WebElement mouseover=driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Act.moveToElement(mouseover).perform();
		WebElement Riceproducts=driver.findElement(By.xpath("//a[text()=\"Rice & Rice Products\"]"));
		Act.moveToElement(Riceproducts).perform();
		WebElement Boiledrice=driver.findElement(By.xpath("//a[text()=\"Boiled & Steam Rice\"]"));
		Act.moveToElement(Boiledrice).perform();
		Boiledrice.click();
		//Normal method to search and check an element
		driver.findElement(By.xpath("(//input[@placeholder=\"Search here\"])[1]")).sendKeys("BB Royal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"i-BBRoyal\"]")).click();
		//using scrollToElement method
		//WebElement Brand=driver.findElement(By.xpath("//label[text()='BB Royal']"));
		//Act.scrollToElement(Brand).perform();
		//Act.click(Brand).perform();
		//Brand.click();
		//driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']/parent::div")).click();
		Thread.sleep(3000);
		//WebElement Rice=driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
		//Act.moveToElement(Rice).perform()
		//Rice.click();
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		//windowHandles
		Set<String> WindowHandles=driver.getWindowHandles();
		System.out.println(WindowHandles);
		//convert set to list
		List<String> windows=new ArrayList<String>(WindowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		WebElement bag=driver.findElement(By.xpath("//span[text()='5 kg']"));
		Act.moveToElement(bag).perform();
		bag.click();
		String Price=driver.findElement(By.xpath("//td[text()='₹350']")).getText();
		System.out.println("5KG Rice Price : " + Price);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		String Added=driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println(Added);
		File scrnsht1= driver.getScreenshotAs(OutputType.FILE);
		File dst1=new File("./Amazonsnip/img1.png");
		FileUtils.copyFile(scrnsht1, dst1);
		Thread.sleep(3000);
		driver.close();
		//switching back to main page
		driver.switchTo().window(windows.get(0));
		driver.close();
	}

}
