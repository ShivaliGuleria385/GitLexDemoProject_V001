package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;

import com.horizon.stage.pages.ApprovalDisclosuresPage;
import com.horizon.stage.pages.GatewayPage;
import com.horizon.stage.pages.LoginPage;

import base.BaseTest;

public class GatewayPageTC extends BaseTest {

	GatewayPage gatewayPage;
	LoginPage loginPage;
	ApprovalDisclosuresPage approvalDisclosuresPage;

	@BeforeMethod
	public void initialize() {
		gatewayPage = new GatewayPage();
		}
	 
	
	@Test(priority = 0)
	public void initializeLogin() throws InterruptedException {

		loginPage = new LoginPage();
		gatewayPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(16000);

	}

	@Test(priority = 1)
	public void gatewayTitleTest() throws InterruptedException {

		String title = gatewayPage.verifyGatewayPageTitle();
		Assert.assertEquals(title, "Integrity Gateway");

	}

	@Test(priority = 2)
	public void userNameTest() {

		String username = gatewayPage.verifyUserName();
		Assert.assertEquals(username, "Shivali Guleria");
	}

	@Test(priority = 3)
	public void settingsBtnTest() {

		Boolean settingbtn = gatewayPage.verifySettingsBtn();
		Assert.assertTrue(settingbtn);
	}

	@Test(priority = 4)
	public void leftNavBarBtnTest() {

		Boolean leftnavbtn = gatewayPage.verifyLeftNavBarBtn();
		Assert.assertTrue(leftnavbtn);
	}

	@Test(priority = 5)
	public void aDTileTest() {

		Boolean approvaltile = gatewayPage.verifyADTile();
		Assert.assertTrue(approvaltile);
	}

	@Test(priority = 6)
	public void approvalDisclosureTile() throws InterruptedException {

		approvalDisclosuresPage = gatewayPage.clickADTile();
		String preApprovalURL = driver.getCurrentUrl();
		Assert.assertEquals(preApprovalURL, "https://demo-stage.horizon.lextegrity.com/pre-approval");
		driver.navigate().back();
		Thread.sleep(2000);

	}

	@Test(priority = 7)
	public void tPMTileTest() {

		Boolean thirdpartytile = gatewayPage.verifyLeftNavBarBtn();
		Assert.assertTrue(thirdpartytile);
	}

	@Test(priority = 8)
	public void campaignTileTest() {

		Boolean campaigntile = gatewayPage.verifyCampaignTile();
		Assert.assertTrue(campaigntile);
	}

	@Test(priority = 9)
	public void compalianceTileTest() {

		Boolean compaliancetile = gatewayPage.verifyCompalianceTile();
		Assert.assertTrue(compaliancetile);
	}

}
