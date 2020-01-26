import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTestFF
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "c:\\selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/admin/viewSystemUsers?sortField=user_name&sortOrder=ASC");
        
		WebElement userName=dr.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		WebElement userPass=dr.findElement(By.id("txtPassword"));
		userPass.sendKeys("admin");
		
		WebElement userLogin=dr.findElement(By.id("btnLogin"));
		userLogin.click();
		
		dr.findElement(By.xpath("//a[@id ='welcome Admin']"))                                                                                              ;
	}

}
