import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddUserFF 
{
    public static void main(String args[])
    {
    	System.setProperty("webdriver.gecko.driver", "c:\\selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		
		dr.manage().window().maximize();
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/admin/viewSystemUsers?sortField=user_name&sortOrder=ASC");
        
		WebElement userName = dr.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		WebElement passWord = dr.findElement(By.id("txtPassword"));
		passWord.sendKeys("admin");
		
		WebElement userLogin = dr.findElement(By.id("btnLogin"));
		userLogin.click();
		
		
		
		WebElement addUser = dr.findElement(By.id("btnAdd"));
		addUser.click();
		
		WebElement empName = dr.findElement(By.id("systemUser_employeeName_empName"));
		empName.sendKeys("sharr raut");
		
		WebElement empUser = dr.findElement(By.id("systemUser_userName"));
		empUser.sendKeys("sraut1");
		
		WebElement saveUser = dr.findElement(By.id("btnSave"));
		saveUser.click();
    }
}
