package All_Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Germany");
		Thread.sleep(4000);
		driver.quit();
		/*
		 * List<WebElement> drop = sel.getOptions(); for(int i=0;i<drop.size();i++) {
		 * System.out.println(drop.get(i).getText()); }
		 */
	}

}
