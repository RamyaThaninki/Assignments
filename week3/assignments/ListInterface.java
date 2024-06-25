package week3.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[contains(@class,'react-autosug')]")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men')])[1]")).click();
		//driver.findElement(By.xpath("(//label[@for ='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men - Fashion Bags')])[1]")).click();
		Thread.sleep(3000);
		WebElement Items=driver.findElement(By.xpath("//div[@aria-label='1,138 Items Found']"));
		System.out.println("Items Found : " + Items.getText());
		//driver.close();
		List<WebElement> Brands=driver.findElements(By.xpath("//div[@class='brand']"));
		int DisplayBrands=Brands.size();
		System.out.println(DisplayBrands);
		for(WebElement BrandsList : Brands) {
			System.out.println(BrandsList.getText());
		}
			List<WebElement> BagNames=driver.findElements(By.xpath("//div[@class='nameCls']"));
			for(WebElement BagsclearNames : BagNames) {
				System.out.println("Bags Names is : " + BagsclearNames.getText());
			}
	}

}
