import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginFF 
{
     public static void main(String args[])
     {
    	 System.setProperty("webdriver.gecko.driver", "c:\\selenium\\geckodriver.exe");
    	 WebDriver dr = new FirefoxDriver();
    	 
    			 dr.get("https://www.gmail.com");
    			 
    			 WebElement emailId = dr.findElement(By.id("identifierId"));
    			 emailId.sendKeys("sharayuraut18@gmail.com");
    			 
    			 WebElement nextButton = dr.findElement(By.xpath("//span[@class='RveJvd snByac']"));
    			 nextButton.click();
    			 
    			 /*WebElement passWord = dr.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
    			 passWord.sendKeys("12345");
    			 
    			 WebElement nextButton2 = dr.findElement(By.xpath("//span[@class='RveJvd snByac']"));
    			 nextButton2.click(); */
     }
}
