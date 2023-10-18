package ninja_shopping;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_andxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//http://tutorialsninja.com/demo/index.php
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sange\\eclipse-workspace\\SDET131_Se\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://tutorialsninja.com/demo/index.php");
		driver.findElement(By.className("pull-left")).click();
		driver.findElement(By.xpath("//button[@name='EUR']")).click();
		driver.findElement(By.linkText("Canon EOS 5D")).click();
		//driver.findElement(By.xpath("//select[@name='option[226]']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.text-danger")).getText());
		driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
		driver.findElement(By.xpath("//a[text()='iPhone']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'quantity')]")).clear();
		driver.findElement(By.xpath("//input[contains(@name,'quantity')]")).sendKeys("2");
		driver.findElement(By.xpath("//button[contains(@class, 'btn btn-primary btn-lg btn-block')]")).click();
		WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(msg.getText());
		Thread.sleep(3000);
		//6. Click on the cart icon (black color) in the right side top then click view cart
		driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")).click();
		
		//7. Change the quantity of iphone to 3 and click update button
		WebElement qty1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
		qty1.sendKeys(Keys.CONTROL + "a");
		qty1.sendKeys(Keys.DELETE);
		qty1.sendKeys("3");
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div//span/button[1]")).click();
		
		//8. Print the Eco tax and VAT Amount in console and click Checkout button
		String ecotax = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
		String vat = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
		System.out.println(ecotax);
		System.out.println(vat);
		
		
		//9. Print the error message and remove the product from the cart
		
		 Thread.sleep(5000);
	        String msg2 = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[2]")).getText();
	        System.out.println(msg2);
	        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i")).click();
	        
	     /*   10. Move to the home screen and click on Mac book, check the default quantity is 1 and 
	   click add to cart then verify success message */
	        driver.get("https://tutorialsninja.com/demo/index.php");
	        driver.navigate().to("https://tutorialsninja.com/demo/index.php");
	        /*driver.findElement(By.xpath("//div[@id=\"checkout-cart\"]/ul[1]/li[1]/a/i")).click();
	        Thread.sleep(5000);*/
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")).click();
	        driver.findElement(By.xpath("//*[@id='button-cart']")).click();
	        Thread.sleep(5000);
	       
	        
	       String msg3 = driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
	        System.out.println(msg3);
	       /* 11. Click on the shopping cart link in the top and apply ABCD123 as coupon code to check, 
	        print error message*/
	        
	        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
	        driver.findElement(By.xpath("//*[@id='accordion']/div[1]/div[1]/h4/a")).click();
	        Thread.sleep(5000);
	        WebElement coup = driver.findElement(By.xpath("//input[@id='input-coupon']"));
	        coup.sendKeys("ABCD123");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//input[@value='Apply Coupon']")).click();
	        Thread.sleep(5000);
	        String msg_cpn = driver.findElement(By.xpath("//*[@id='checkout-cart']/div[1]")).getText();
	        System.out.println(msg_cpn);
	        //12. Enter AXDFGH123 as gift certificate and perform apply to check, print error message
	        
	        //why not working ?driver.findElement(By.xpath("//div[@id='accordion']/div[3]/div[1]/h4/a")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Use Gift Certificate')]")).click();
	        Thread.sleep(5000);
	        WebElement gift = driver.findElement(By.xpath("//*[@id=\"input-voucher\"]"));
	        gift.sendKeys("AXDFGH123");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//input[@id='button-voucher']")).click();
	        Thread.sleep(3000);
	        
	        String msg_gift = driver.findElement(By.xpath("//div[@id='checkout-cart']/div[1]")).getText();
	        System.out.println(msg_gift);
	        Thread.sleep(1000);
	        //13. Clear both textbox values and proceed to checkout
	        
	        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/i")).click();
	        Thread.sleep(5000);    
	       // WebElement cpn4 = driver.findElement(By.xpath("//*[@id=\"input-coupon\"]"));
	        coup.sendKeys(Keys.CONTROL + "a");
	        coup.sendKeys(Keys.DELETE);
	        driver.findElement(By.xpath("//a[contains(text(),'Use Gift Certificate')]")).click();
	        Thread.sleep(5000); 
	        gift.sendKeys(Keys.CONTROL + "a");
	        gift.sendKeys(Keys.DELETE);
	      driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
	      Thread.sleep(3000);
	      //14. Select register account option and enter all account and billing details, click continue
	      
	      driver.findElement(By.xpath("//*[@id='button-account']")).click();
	      Thread.sleep(2000);
	      //14. Select register account option and enter all account and billing details, click continue
	     WebElement fn = driver.findElement(By.xpath("//input[@id='input-payment-firstname']"));
	     fn.sendKeys("Nitu");
	     WebElement ln = driver.findElement(By.id("input-payment-lastname"));
	     ln.sendKeys("Shroff");
	     WebElement email = driver.findElement(By.id("input-payment-email"));
	        email.sendKeys("sammyshroff@mail.com");
	        WebElement phone = driver.findElement(By.id("input-payment-telephone"));
	        phone.sendKeys("6545675670");
	        WebElement pwd = driver.findElement(By.id("input-payment-password"));
	        pwd.sendKeys("tester@123#");
	        WebElement pwdconfirm = driver.findElement(By.id("input-payment-confirm"));
	        pwdconfirm.sendKeys("tester@123#");
	        WebElement address = driver.findElement(By.id("input-payment-address-1"));
	        address.sendKeys("9700 NW 112th Avenue");
	        WebElement city = driver.findElement(By.id("input-payment-city"));
	        city.sendKeys("Hoboken");
	        WebElement postcode = driver.findElement(By.id("input-payment-postcode"));
	        postcode.sendKeys("33178");
	        
	        WebElement select = driver.findElement(By.id("input-payment-country"));
	        List<WebElement> options = select.findElements(By.xpath("//*[@id='input-payment-country']/option[240]"));
	        for(WebElement option : options)
	        {
	        	if("United States".equals(option.getText()))
	        		option.click();
	        		        	
	        }
	        
	        WebElement select2 = driver.findElement(By.id("input-payment-zone"));
	        List<WebElement> options2 = driver.findElements(By.xpath("//*[@id='input-payment-zone']/option[19]"));
	        for(WebElement option : options2)
	        {
	        
	        
	      
	        
	        
	        
	        
	        
	        
		
		
	}

}
