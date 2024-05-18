package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.WebListener;

public class BaseTest {

	public static WebDriver driver;
	public static WebListener listener;
	public static FileReader fr;
	public static FileReader fr1;

	public static Properties prop = new Properties();
	public static Properties loc = new Properties();

//BeforeMethod
	@BeforeClass
	public void setUp() throws IOException {

		if (driver == null) {

			fr = new FileReader(System.getProperty("user.dir") + "/src/test/resources/configfiles/config.properties");
			fr1 = new FileReader(
					System.getProperty("user.dir") + "/src/test/resources/configfiles/locators.properties");
			prop.load(fr);
			loc.load(fr1);

		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		WebListener listeners = new WebListener();
		EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listeners);
		WebDriver decoratedDriver = decorator.decorate(driver);
		driver = decoratedDriver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8000));

		driver.get(prop.getProperty("testurl"));

	}

	// @AfterMethod
	@AfterClass
	public void tearDown() {

		driver.close();
		System.out.println("Teardown Successful");
	}
}
