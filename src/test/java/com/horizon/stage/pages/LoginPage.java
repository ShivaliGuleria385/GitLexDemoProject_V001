package com.horizon.stage.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.BaseTest;

public class LoginPage extends BaseTest {

	// Page Factory

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
	WebElement email;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/input[1]")
	WebElement password;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/a[1]")
	WebElement forgotPassLink;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/form[1]/input[3]")
	WebElement signInSubmitBtn;

	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]")
	WebElement signInDescriptionText;

	@FindBy(tagName = "h1")
	WebElement thirdPartyText;

	// Initializing the page objects.

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	// Actions

	public String verifyLoginPageDescrp() {
		return signInDescriptionText.getText();

	}

	public String verifyForgotPswLink() {
		return forgotPassLink.getText();

	}

	public GatewayPage login(String un, String pwd) throws InterruptedException {

		email.sendKeys(un);
		password.sendKeys(pwd);
		signInSubmitBtn.click();
		Thread.sleep(16000);
		return new GatewayPage();

	}

	public void verifyAccess(String uname, String psword) throws InterruptedException {
		email.sendKeys(uname);
		password.sendKeys(psword);
		signInSubmitBtn.click();
		Thread.sleep(18000);

	}

	public String thirdPartyLogin() {
		return thirdPartyText.getText();

	}

}