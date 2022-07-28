package BasePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public BgPages.HomePage HomePage; 

	@BeforeMethod
	public void StartSession() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://babbangona.com/");
		HomePage = new BgPages.HomePage();
	}

	@AfterMethod
	public void EndSession() {
		driver.close();
	}

}
