package All_Actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//1) simple alert with ok button
//		driver.findElement(By.id("alertBtn")).click();
//		Thread.sleep(5000);
//		Alert myalert = driver.switchTo().alert();
//		System.out.println(myalert.getText());
//		myalert.accept();
//		driver.quit();
		
		// 2) confirmation alert with ok and cancel button 
//		driver.findElement(By.id("confirmBtn")).click();
//		Thread.sleep(5000);
//		Alert myalert = driver.switchTo().alert();
//		System.out.println("alert text: "+myalert.getText());
//		myalert.accept();
//		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
//		System.out.println(text.getText());
//		Thread.sleep(2000);
//		driver.quit();
		
		//3) prompt alert with message !!
		
		driver.findElement(By.id("promptBtn")).click();
		Thread.sleep(3000);
		Alert myalert = driver.switchTo().alert();
		myalert.sendKeys("sylesh");
		myalert.accept();
		WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		driver.quit();
		

	}

}
