import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//SetProperty
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\intel\\\\Selenium\\\\chromedriver.exe");
		
		//create object
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		//get URL
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	//	Thread.sleep(6000L);
		
		//open dropdown
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"autocomplete\").value;";
		
		String text = (String) js.executeScript(script);
		
		int i=0;
		while(!text.contains("Kingdom"))
		{
			i++;
			Thread.sleep(1000L);
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			
			text = (String) js.executeScript(script);
			if(i>12)
			{
				break;
			}
		}
		if(i>10) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element Found");
		}
		System.out.println(text);
	}

}
