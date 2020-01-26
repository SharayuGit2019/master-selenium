import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddEmployeeFF 
{
     public static void main(String args[])
     {
    	 System.setProperty("webdriver.gecko.driver", "c:\\selenium\\geckodriver.exe");
    	 WebDriver dr = new FirefoxDriver();
    	 
 		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/admin/viewSystemUsers?sortField=user_name&sortOrder=ASC");
        
 		 WebElement userName = dr.findElement(By.id("txtUsername"));
         userName.sendKeys("admin");
         
     	WebElement passWord = dr.findElement(By.id("txtPassword"));
		passWord.sendKeys("admin");
		
		WebElement userLogin = dr.findElement(By.id("btnLogin"));
		userLogin.click();
		
		WebElement pimTab = dr.findElement(By.id("menu_pim_viewPimModule"));
		pimTab.click();
		
		WebElement addEmp = dr.findElement(By.id("menu_pim_addEmployee"));
		addEmp.click();
		
		WebElement firstName = dr.findElement(By.id("firstName"));
		firstName.sendKeys("xyz");
		
		WebElement lastName = dr.findElement(By.id("lastName"));
		lastName.sendKeys("pqr");
		
		WebElement saveEmp = dr.findElement(By.id("btnSave"));
		saveEmp.click();
    	 
     }
}
