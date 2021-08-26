package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptExecutorClassMethods {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spsoft\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement e= driver.findElement(By.name("q"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// fill an text
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='javatpoint';", e);
		
	/*	// highlight on element
		js.executeScript("arguments[0].style.border='5px dotted Red';",e);
		
		//alert creation
		Thread.sleep(3000);
		js.executeScript("alert('Welcome to Google');");
		
		//enable and disable an element
		js.executeScript("arguments[0].setAttribute('disabled','');", e);
			
		js.executeScript("arguments[0].removeAttribute('disabled');", e);
		
		
		//Scroll an Element URL: https://www.javatpoint.com/inheritance-in-java
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//*[@class=\"h2\"][text()='Types of inheritance in java']"));
		js.executeScript("arguments[0].scrollIntoView();", text);
		Thread.sleep(2000);
		*/
		
		driver.quit();
		
		
	}

}
