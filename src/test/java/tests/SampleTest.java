package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class SampleTest {
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");
		System.out.println("title is "+driver.getTitle());
		
		driver.quit();
	}
	
	

}
