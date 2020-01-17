package DeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Trivago.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#js_navigation > div > div.pos-relative.has-popover > button > span")).click();
		driver.findElement(By.xpath("//*[@id=\"check_email\"]")).sendKeys("swethanayak007@gmail.com");
		driver.findElement(By.cssSelector("#login_email_submit")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("Sweth@0421");
		driver.findElement(By.cssSelector("#login_submit")).click();
		
		
		
	}
	
}
