package introduccion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webDriver.chrome.driver", "C:\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.es");
		System.out.println(driver.getTitle());
	}

}
