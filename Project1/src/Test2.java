import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// 
// Decompiled by Procyon v0.5.36
// 

public class Test2
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Selenium\\chromedriver.exe");
        final WebDriver driver = (WebDriver)new ChromeDriver();
        driver.get("http://spicejet.com");
        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
        driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    }
}