import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CRMTest {
	
	WebDriver driver;

	Logger log = Logger.getLogger(CRMTest.class);
	@BeforeMethod
	public void setUp() {
		
		log.info("****************************** Starting test cases execution  *****************************************");
		System.setProperty("webdriver.chrome.driver",
				"C://Users//manis//OneDrive//Desktop//Java-Selenium//Selenuim_new//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://classic.crmpro.com/");

	}

	@Test
	public void CRMLoginPageTitle() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** freeCrmTitleTest *****************************************");
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
