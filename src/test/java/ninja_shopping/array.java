package ninja_shopping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class array {
	private WebDriver driver;
	
	String url="https://dsportalapp.herokuapp.com/";
	
	By button=By.xpath("//button[@class='btn']");
    By button1=By.xpath("//button[@class='btn']");
    By dropdown=By.xpath("//a[@class='nav-link dropdown-toggle']");
    By signin=By.xpath("//a[normalize-space()='Arrays']");
    By alert=By.xpath("//div[@role='alert']");
    
        
	
    public void the_user_opens_ds_algo_portal_link()  {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace\\SDET131_Se\\src\\test\\resources\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get(url);
    }
}