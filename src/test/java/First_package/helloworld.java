package First_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace\\SDET131_Se\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.numpyninja.com/contact");
		 WebElement fn = driver.findElement(By.id("input_comp-l1c0ktzj1"));
		 fn.sendKeys("Sangeetha");
		 WebElement ln = driver.findElement(By.name("last-name"));
		 ln.sendKeys("Shroff");
		 WebElement email = driver.findElement(By.name("email"));
		 email.sendKeys("Sangeetha@gmail.com");
		 WebElement ph = driver.findElement(By.id("input_comp-l1c0ku05"));
		 ph.sendKeys("8043983241");
		 WebElement txt = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		 txt.sendKeys("When next QA batch starts?");
		 WebElement btn = driver.findElement(By.id("comp-l1c0ku0e3"));
		 btn.click();
	
	}

}
