import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Set Property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\Selenium\\chromedriver.exe");
		
		//Create object
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		 Thread.sleep(5000L);
		//Select autocomplete
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
	//	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = " return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		int i=0;
		while(!text.contains("AIRPORT")){
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			 text =  (String) js.executeScript(script);
			 if(i>10)
			 {
				 break;
			 }
				
		}
		
		if(i>10)
		 {
			System.out.println("Element not found");
		 }
		else {
			System.out.println("Element found");
		}
		System.out.println(text);
	
		

	}

}
