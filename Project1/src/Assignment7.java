import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//*[@id='checkBoxOption1']")).click();
		
		String text=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]")).getText();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
		
		Select s=new Select(dropdown);
		
		s.selectByVisibleText(text);
		
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys(text);
		
		driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
		
		String alerttext = driver.switchTo().alert().getText();
		
		if(alerttext.contains(text))
		{
			System.out.println("Assignment Succeed. "+text+" Found in the Alert message");
		}
		else
		{
			System.out.println("Something went wrong");
		}
	}
	
}
