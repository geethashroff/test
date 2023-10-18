package ninja_shopping;
import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialsPage {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sange\\eclipse-workspace\\SDET131_Se\\src\\test\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php");
		
		driver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button/span")).click();
		driver.findElement(By.name("EUR")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
		driver.findElement(By.id("input-option226")).click();
		WebElement Error =  driver.findElement(By.xpath("//*[@id=\"input-option226\"]/option"));
        if(Error.isDisplayed()){
            String Errormessage = Error.getText();
            System.out.println("The error message is:" +Errormessage);
        }
        
        driver.get("https://tutorialsninja.com/demo/index.php");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/h4/a")).click();
        WebElement qty = driver.findElement(By.name("quantity"));
        qty.sendKeys(Keys.CONTROL + "a");
        qty.sendKeys(Keys.DELETE);
        qty.sendKeys("2");
        
       
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        Thread.sleep(5000);
        String msg = driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
        System.out.println(msg);
        
        driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")).click();
        WebElement qty1 = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
        qty1.sendKeys(Keys.CONTROL + "a");
        qty1.sendKeys(Keys.DELETE);
        qty1.sendKeys("3");
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[1]")).click();
        
        String ecotax = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
        String vat = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[3]/td[2]")).getText();
        System.out.println(ecotax);
        System.out.println(vat);
        
        
        Thread.sleep(5000);
        String msg2 = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[2]")).getText();
        System.out.println(msg2);
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]/i")).click();
        driver.get("https://tutorialsninja.com/demo/index.php");
        driver.navigate().to("https://tutorialsninja.com/demo/index.php");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        Thread.sleep(5000);
        
        String msg3 = driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]")).getText();
        System.out.println(msg3);
        driver.findElement(By.xpath("//*[@id=\"cart\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong/i")).click();
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a"));
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/i")).click();
        
          Thread.sleep(5000);    
       WebElement cpn = driver.findElement(By.xpath("//*[@id=\"input-coupon\"]"));
       cpn.sendKeys("ABCD123");
       Thread.sleep(3000);
       
        driver.findElement(By.xpath("//*[@id=\"button-coupon\"]")).click();
        
        Thread.sleep(5000);
        String msg4 = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]")).getText();
        System.out.println(msg4);
        
        
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a/i")).click();
        Thread.sleep(5000);    
        WebElement cpn2 = driver.findElement(By.xpath("//*[@id=\"input-voucher\"]"));
        cpn2.sendKeys("AXDFGH123");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//*[@id=\"button-voucher\"]")).click();
        Thread.sleep(3000);
        
        String msg5 = driver.findElement(By.xpath("//*[@id=\"checkout-cart\"]/div[1]")).getText();
        System.out.println(msg5);
        
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/i")).click();
        Thread.sleep(5000);    
        WebElement cpn4 = driver.findElement(By.xpath("//*[@id=\"input-coupon\"]"));
        cpn4.sendKeys(Keys.CONTROL + "a");
        cpn4.sendKeys(Keys.DELETE);
        
        driver.findElement(By.xpath("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a/i")).click();
        Thread.sleep(5000);    
        WebElement cpn5 = driver.findElement(By.xpath("//*[@id=\"input-voucher\"]"));
        cpn5.sendKeys(Keys.CONTROL + "a");
        cpn5.sendKeys(Keys.DELETE);
       
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
        Thread.sleep(3000);
        WebElement btn = driver.findElement(By.id("button-account"));
        btn.click();
        Thread.sleep(2000);
        WebElement firstname = driver.findElement(By.id("input-payment-firstname"));
        firstname.sendKeys("John");
        WebElement lastname = driver.findElement(By.id("input-payment-lastname"));
        lastname.sendKeys("Smith");
        WebElement email = driver.findElement(By.id("input-payment-email"));
        email.sendKeys("esimtest1137@yopmail.com");
        WebElement phone = driver.findElement(By.id("input-payment-telephone"));
        phone.sendKeys("6545675670");
        WebElement pwd = driver.findElement(By.id("input-payment-password"));
        pwd.sendKeys("tester@123#");
        WebElement pwdconfirm = driver.findElement(By.id("input-payment-confirm"));
        pwdconfirm.sendKeys("tester@123#");
        WebElement address = driver.findElement(By.id("input-payment-address-1"));
        address.sendKeys("9700 NW 112th Avenue");
        WebElement city = driver.findElement(By.id("input-payment-city"));
        city.sendKeys("Miami");
        WebElement postcode = driver.findElement(By.id("input-payment-postcode"));
        postcode.sendKeys("33178");
        
        WebElement select = driver.findElement(By.id("input-payment-country"));
        List<WebElement> options = select.findElements(By.xpath("//*[@id=\"input-payment-country\"]/option[240]"));
        for (WebElement option : options) {
            if("United States".equals(option.getText()))
                option.click();   
        }
        
        WebElement select1 = driver.findElement(By.id("input-payment-zone"));
        Thread.sleep(3000);
        List<WebElement> options1 = select1.findElements(By.xpath("//*[@id=\"input-payment-zone\"]/option[19]"));
        for (WebElement option : options1) {
            if("Florida".equals(option.getText()))
                option.click();
        }
            driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/div[3]/div/input[1]")).click();
            driver.findElement(By.id("button-register")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/p[2]/textarea")).sendKeys("I am unable to place order");
            
            
            String msg6 = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[1]")).getText();
            System.out.println(msg6);
            
           driver.findElement(By.xpath("/html/body/footer/div/div/div[2]/ul/li[1]/a")).click();
           driver.findElement(By.xpath("//*[@id=\"input-enquiry\"]")).sendKeys("I am unable to place my order. Please contact me via above email");
           driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input")).click();
        
             
        
        }
		
	}


