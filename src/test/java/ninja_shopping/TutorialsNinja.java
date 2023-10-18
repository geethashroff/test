package ninja_shopping;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja {

	
	static void clearGiftcode() throws InterruptedException{
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=product/product&product_id=47");
		
		driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]")).click();
				
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=checkout/cart");
	
		driver.findElement(By.xpath("//a[contains(text(),'Use Coupon Code')]")).click();
		
		driver.findElement(By.id("input-coupon")).sendKeys("vijayavh");
		
		driver.findElement(By.id("button-coupon")).click();
			
		driver.findElement(By.xpath("//a[contains(text(),'Use Coupon Code')]")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Use Gift Certificate')]")).click();

		driver.findElement(By.id("input-voucher")).sendKeys("fdbshj");
		driver.findElement(By.id("button-voucher")).click();
		
		driver.findElement(By.id("input-voucher")).clear();
		
		driver.findElement(By.xpath("//a[contains(text(),'Use Coupon Code')]")).click();

		driver.findElement(By.id("input-coupon")).clear();

		
		
		 
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		clearGiftcode();
	}
	
	
}
