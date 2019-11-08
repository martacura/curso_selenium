package introduccion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {
	public static void main(String[] args) {

	System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.cssSelector("#email")).sendKeys("correo");
	//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mail");
	//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
	//driver.findElement(By.id("u_0_m")).sendKeys("Nombre");
	System.out.println(driver.findElement(By.xpath("//*[@id='reg_pages_msg']")).getText()) ;
	//driver.findElement(By.id("u_0_15")).click();
	}
}