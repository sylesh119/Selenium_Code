package All_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Input_area {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sylesh_911");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sylesh@gmail.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234522267");
		System.out.println("Test is Passed successfully...");
		Thread.sleep(3000);
		driver.quit();

	}

}
