package All_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement click = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		WebElement scroll = driver.findElement(By.xpath("//h2[text()='Double Click']"));
		WebElement ctext = driver.findElement(By.id("field2"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		Actions dbclick = new Actions(driver);
		dbclick.doubleClick(click).build().perform();
		Thread.sleep(5000);
//		js.executeScript("arguments[0].dbClick();",click);
		System.out.println(ctext.getDomProperty("value"));
		Thread.sleep(5000);
		driver.quit();
	}

}
