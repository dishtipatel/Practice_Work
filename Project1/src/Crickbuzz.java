import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crickbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Selenium\\chromedriver.exe");
		int sum=0;
		//Create object of WebDriver class
		WebDriver driver = new ChromeDriver();
		
		//get url
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20258/ind-vs-pak-match-22-icc-cricket-world-cup-2019");
		
		//Select Table and store in an object
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		//Get row Count of the table
		int rowcount=	table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		
		//get count of all the elements in third column of table 
		//Wrong :: int count = table.findElements(By.cssSelector("cb-col cb-col-8 text-right text-bold")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		for(int i=0;i<count-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;//103
		}
		System.out.println(sum);
		
		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);
		
		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		if(ActualTotalVAlue==TotalSumValue)
		{
			System.out.println("Count Matches");
		}
		else
		{
			System.out.println("count fails");
		}
	}

}
