  package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.horizon.stage.pages.ApprovalDisclosuresPage;
import com.horizon.stage.pages.GatewayPage;
import com.horizon.stage.pages.LoginPage;
import com.horizon.stage.pages.PGTH_RequestPage;

import base.BaseTest;

public class ApprovalDisclosuresPageTC extends BaseTest {

	GatewayPage gatewayPage;
	LoginPage loginPage;
	PGTH_RequestPage provide_GTHPage;
	ApprovalDisclosuresPage approvalDisclosuresPage;
	

	@BeforeMethod
	public void initialize() {
		approvalDisclosuresPage = new ApprovalDisclosuresPage();
	}

	@Test(priority = 0)
	public void initializeLogin() throws InterruptedException {
		loginPage = new LoginPage();
		provide_GTHPage = new PGTH_RequestPage();
		gatewayPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		approvalDisclosuresPage = gatewayPage.clickADTile();
		

	}

	
	@Test(priority = 1)
	public void provideGTHTest() {
		String act_title = approvalDisclosuresPage.verifyProvide_a_gift_travel_or_hospitality();
		Assert.assertEquals(act_title, "Provide a Gift, Travel or Hospitality");

	}
	
	@Test(priority = 2)
	public void provideGTHClickTest() throws InterruptedException {
		provide_GTHPage = approvalDisclosuresPage.click_ProvideGTH();
		driver.navigate().back();
		Thread.sleep(2000);
		
	}
	

}
