package All_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Hover = driver.findElement(By.xpath("//div//button[text()='Point Me']"));
		WebElement text = driver.findElement(By.xpath("//h2[text()='Mouse Hover']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", text);
		Actions ac = new Actions(driver);
		ac.moveToElement(Hover);
		Thread.sleep(4000);
		driver.quit();
	}

}
