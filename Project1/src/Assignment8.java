import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set property of Chrome Driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\Selenium\\chromedriver.exe");
		
		//Create object of chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Get URL
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
		//Select table
		WebElement table1=driver.findElement(By.id("product"));
		
		//Find count of total rows
		System.out.println(table1.findElements(By.tagName("tr")).size());
		
		System.out.println(table1.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow=table1.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());
		
	}

}
