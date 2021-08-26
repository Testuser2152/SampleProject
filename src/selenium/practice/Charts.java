package selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Charts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spsoft\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();

		// Bar Chart values --- working
// Bar Chart values --- working sandeep
		String list= "//*[name()='svg']//*[local-name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		List<WebElement> l= driver.findElements(By.xpath(list));
		System.out.println("********Size"+ l.size());
		
		Actions a = new Actions(driver);
		
		for(WebElement e: l)
		{
			a.moveToElement(e).perform();
			String tooltip= "//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
			String x= driver.findElement(By.xpath(tooltip)).getText();
			System.out.println(x);
		}
		
		/*// points in line  --- working here
		WebElement scroll=driver.findElement(By.xpath("//label[@for='startmonthyear']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		String list= "//*[name()='g']//*[name()='path' and @fill='#B8204C' and contains(@class,'highcharts-point')]";
		List<WebElement> l= driver.findElements(By.xpath(list));
		System.out.println("********Size      "+ l.size());
		
		Actions a = new Actions(driver);
		
		for(WebElement e: l)
		{
			a.moveToElement(e).perform();
			
			String tooltip= "//*[name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
			String x= driver.findElement(By.xpath(tooltip)).getText();
			System.out.println(x);
		}*/
		
		/*// Pie chart  --- working
		WebElement scroll=driver.findElement(By.xpath("//h4[text()='Loan EMI']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		String list= "//*[name()='svg']//*[local-name()='g' and contains(@class,'highcharts-series highcharts-series-0 highcharts-pie-series  highcharts-tracker')]//*[name()='path' and @stroke-linejoin='round']";
		List<WebElement> l= driver.findElements(By.xpath(list));
		System.out.println("********Size^^^^^^^     "+ l.size());
		
		Actions a = new Actions(driver);
		
		for(WebElement e: l)
		{
			a.moveToElement(e).perform();
			
			String tooltip= "//*[name()='svg']//*[name()='g' and contains(@class,'highcharts-label highcharts-tooltip') and @visibility='visible']//*[name()='tspan']";
			String x= driver.findElement(By.xpath(tooltip)).getText();
			System.out.println(x);
		}*/
		
		// Get Table data
		WebElement scroll=driver.findElement(By.xpath("//th[@id='yearheader']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		List<WebElement> year= driver.findElements(By.xpath("//tr[@class='row no-margin yearlypaymentdetails']"));
		System.out.println("******** Total no of years displayed:     "+ year.size());
		
		for(WebElement e: year)
		{
			e.findElement(By.xpath("//td[@class='col-2 col-lg-1 paymentyear toggle']")).click();
			
			List<WebElement> month= e.findElements(By.xpath("//div[@class='monthlypaymentcontainer']//tr"));
			System.out.println("******** Total no of month displayed:     "+ month.size());

			for(WebElement e1: month)
			{
				
				List<WebElement> monthlist= e1.findElements(By.xpath("//tr[@class='row no-margin']//td"));
				System.out.println("******** Total no of month list displayed:     "+ monthlist.size());
				System.out.println("--------start-----------");
				for (WebElement eachValue : monthlist) {
					JavascriptExecutor js1 = (JavascriptExecutor)driver;
					String x=js1.executeScript("return(arguments[0].textContent);",eachValue).toString();
//					String x= eachValue.getText();
					System.out.println(x);
				}
				
				System.out.println("--------end-----------");
				break;
			}
//			e.findElement(By.xpath("//td[@class='col-2 col-lg-1 paymentyear toggle']")).click();
		}
		
		System.out.println("********************* Next year *************************");
		
//		driver.quit();
	}

}


/*// year vise details
Thread.sleep(3000);
List<WebElement> monthlist= driver.findElements(By.xpath("//tr[@class='row no-margin yearlypaymentdetails']"));
for (WebElement eachValue : monthlist) {
	List<WebElement> xxx= eachValue.findElements(By.tagName("td"));
	for (WebElement eachValue1 : xxx) {
	String x= eachValue1.getText();
	System.out.println(x);
	}
	System.out.println("-------------------------");
}
break;*/
