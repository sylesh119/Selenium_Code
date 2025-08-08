package All_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < 7; i++) 
		{
			check.get(i).click();
		}
		/*
		 * for(int i=0;i<7;i++) { System.out.println(check.get(i).isSelected()); }
		 */
		for (int i = 0; i < 7; i++) {
			System.out.println(check.get(i).getText());
			if (check.get(i).isSelected()) {

				if (check.get(i).getText().equals("Sunday")) {
					System.out.println("working");
					check.get(i).click();
					Thread.sleep(2000);
				}
			}
		}

		Thread.sleep(2000);
		System.out.println("Test is passed...");
		driver.quit();
	}

}
