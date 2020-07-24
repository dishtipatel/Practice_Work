import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[33]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/a")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String mainpage=it.next();
		String secondpage = it.next();
		driver.switchTo().window(secondpage);
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		driver.switchTo().window(mainpage);
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText());
}
}
