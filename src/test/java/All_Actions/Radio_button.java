package All_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='male']"));
		WebElement radiobutton2 = driver.findElement(By.xpath("//input[@id='female']"));
		
		String gender = "Female";
		if(gender.equals("Male")) {
			radiobutton.click();
		} else {
			radiobutton2.click();
		}
		System.out.println("Test is Passed successfully...");
		Thread.sleep(4000);
		driver.quit();

	}

}
