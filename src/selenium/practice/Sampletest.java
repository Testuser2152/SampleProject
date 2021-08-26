package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spsoft\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://192.168.10.50:1441/signin");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loginId")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Drisbms$$5");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='p-2 mr-auto float-right toggle']")).click();
		try {
		List<WebElement> l=driver.findElements(By.xpath("//ul[@class='menu-items py-3']//li//a[@routerlinkactive='active']//span"));
		System.out.println("**********"  + l.size());
		
		for (WebElement webElement : l) {
			
			webElement.click();
			Thread.sleep(2000);
		}
		
		}catch(StaleElementReferenceException e)
		{
//			System.out.println(e.getMessage());
			driver.findElement(By.xpath("//a//*[@title='UPS']")).click();
		}
	}
		

}
