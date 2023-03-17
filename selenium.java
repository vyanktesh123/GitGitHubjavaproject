package SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Eclips1\\chromedriver\\chromedriver_win32\\chromedriver.exe");	
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("chrome browser launched successfully");
		driver.get("https://www.linkedin.com/login");
		System.out.println("URL Entered Successfully");
	}

}
