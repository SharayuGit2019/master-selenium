import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssValues 

{
    public static void main(String[] args)
    {
  	  System.setProperty("webdriver.chrome.driver",  "c:\\selenium\\chromedriver.exe");
  	   WebDriver dr = new ChromeDriver();    
  	   
  		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/admin/viewSystemUsers?sortField=user_name&sortOrder=ASC");
  		
  		List<WebElement> links =dr.findElements(By.xpath("//*[@href]"));   
  		Iterator<WebElement> itr  = links.iterator();
  		
  		while(itr.hasNext())
  			{
  			     System.out.println(itr.next().getAttribute("href"));
  			     System.out.println(itr.next().getCssValue("color"));           //color
  			                              //dr.displyed
  			}
    }
}
