package All_Actions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_to_Tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement newtab = driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", newtab);
		Thread.sleep(4000);
		newtab.click();
		Thread.sleep(4000);
		System.out.println(driver.getCurrentUrl());
		Set <String> alltabs =driver.getWindowHandles();
		for(String s:alltabs)
		{
			if(!s.equals(driver.getWindowHandle()))
			{
				driver.switchTo().window(s);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.quit();
	}

}
