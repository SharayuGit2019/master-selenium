import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleURL 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://google.com");
		System.out.println(dr.getTitle());
		
		System.out.println(dr.getCurrentUrl());
		dr.getPageSource();
		dr.quit(); 
	
	}

}
