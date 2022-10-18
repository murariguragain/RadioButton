package newProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		List<WebElement>button=driver.findElements(By.cssSelector("input[name=\"color\"]"));
		for(int i=0;i<button.size();i++) {
			System.out.println(i);
			Thread.sleep(3000);
			button.get(i).click();
			
			System.out.println();
			System.out.println("select radio button");
		}
		
		WebElement color=driver.findElement(By.xpath("input[@value=\"purple\"]"));
		
		color.click();
		
		if(color.isSelected()) {
			System.out.println("Purple Radio button selected");
			
		}
		else {
			System.out.println("Purple Radio button not selected");
			
		}
		driver.quit();
		
	
	}

}
