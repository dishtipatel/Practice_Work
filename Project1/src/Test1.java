import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		//Add values into input text fields
		driver.findElement(By.xpath("//*[@id='post-body-3077692503353518311']/div/div[1]/div[4]/input")).sendKeys("Dishti");
		driver.findElement(By.xpath("//*[@id='post-body-3077692503353518311']/div/div[1]/div[7]/input")).sendKeys("Patel");
		
		//Selection for Radio buttons or checkbox
		driver.findElement(By.xpath("//*[@id='sex-1']")).click();
		driver.findElement(By.xpath("//*[@id='exp-2']")).click();
		
		//Add values in field
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("16/04/1996");
		
		//Selection in radio button and checkbox
		driver.findElement(By.xpath("//*[@id='profession-0']")).click();
		driver.findElement(By.xpath("//*[@id='tool-2']")).click();
		
		//For Selecting values from dropdown. Need to import selenium.support.ui.*>> then need to define an object >> the execute method using this object.
		Select continent = new Select(driver.findElement(By.xpath("//*[@id='continents']")));
		continent.selectByVisibleText("Africa");
		
		//For selecting multiple values in an dropdown or list using ctrl plus selection. 
		
		WebElement selectList = driver.findElement(By.xpath("//*[@id='selenium_commands']"));
		Select select1 = new Select(selectList);
		select1.selectByVisibleText("Navigation Commands");
		select1.selectByVisibleText("Wait Commands");
		
		//upload image
	/*	WebElement chooseFile = driver.findElement(By.xpath("//*[@id='photo']"));
		chooseFile.sendKeys("C:\\Users\\intel\\Downloads\\37629554-watercolor-illustration-bouquet-in-simple-white-background (1)");
		*/
		driver.findElement(By.xpath("//*[@id='post-body-3077692503353518311']/div/div[1]/div[30]/div[2]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id='submit']")).click();
	}

}
