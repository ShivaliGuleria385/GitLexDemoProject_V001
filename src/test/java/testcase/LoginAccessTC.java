package testcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.horizon.stage.pages.LoginPage;

import base.BaseTest;
import utilities.TestUtil;

public class LoginAccessTC extends BaseTest {

	LoginPage loginPage;
	String sheetName = "loginTest";

	@BeforeMethod
	public void initialize() {

		loginPage = new LoginPage();
	}

	@DataProvider
	public Object[][] getHorizonTestdata() throws EncryptedDocumentException, IOException {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}

	@Test(dataProvider = "getHorizonTestdata")
	public void accessLoginTest(String usrname, String passwd) throws InterruptedException {
		loginPage.verifyAccess(usrname, passwd);
		String act_url = driver.getCurrentUrl();
		String exp_url = "https://demo-stage.horizon.lextegrity.com/gateway";
		String thirdParty_url = "https://demo-stage.horizon.lextegrity.com/due-diligence/third-party";

		if (act_url.contains(exp_url)) {
			System.out.println(usrname + " is a horizon user");

		}

		else if (act_url.contains(thirdParty_url)) {

			System.out.println(usrname + " is a third party user");
			String thirdPartyTitle = loginPage.thirdPartyLogin();
			System.out.println(thirdPartyTitle);
		}
	}
	
}
