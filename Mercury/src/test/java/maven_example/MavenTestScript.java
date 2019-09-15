package maven_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTestScript {
	
	@Test
	public void registration() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2sms.com/");
		Thread.sleep(2000);
		driver.quit();
	}
}
