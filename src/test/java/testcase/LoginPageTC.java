package testcase;

import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import com.horizon.stage.pages.GatewayPage;
import com.horizon.stage.pages.LoginPage;

import base.BaseTest;

public class LoginPageTC extends BaseTest {

	LoginPage loginPage;
	GatewayPage gatewayPage;

	@BeforeMethod
	public void initialize() {

		loginPage = new LoginPage();
		gatewayPage = new GatewayPage();
	}

	@Test(priority = 1)
	public void LoginPageDescrpTest() throws InterruptedException {

		String description = loginPage.verifyLoginPageDescrp();
		System.out.println(description);
		Assert.assertEquals(description, "Sign in with your email and password");

	}

	@Test(priority = 2)
	public void ForgotPswLinkTest() throws InterruptedException {

		String forgotText = loginPage.verifyForgotPswLink();
		System.out.println(forgotText);
		Assert.assertEquals(forgotText, "Forgot your password?");

	}

	@Test(priority = 3)
	public void loginTest() throws InterruptedException {
		gatewayPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		String act_url = driver.getCurrentUrl();
		String exp_url = "https://demo-stage.horizon.lextegrity.com/gateway";
		Assert.assertEquals(act_url, exp_url);
		System.out.println("Login is successful");
	}

}
