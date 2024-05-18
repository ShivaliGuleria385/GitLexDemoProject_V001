package com.horizon.stage.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class ApprovalDisclosuresPage extends BaseTest {

	// Page factory - OR:

	@FindBy(xpath = "//h1[@class='approvals-JJMhtPIrZqpQCyUUkbJ9']")
	private WebElement approval_request_text;

	@FindBy(xpath = "(//span[@class='lex-tile__label'])[1]")
	private WebElement annual_needs_assessment;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-approvals']/div[1]/div[1]/main[1]/div[1]/div[1]/a[6]/div[1]")
	private WebElement provide_a_gift_travel_or_hospitality;

	@FindBy(xpath = "(//span[@class='lex-tile__label'])[3]")
	private WebElement disclose_the_receipt_of_a_gift_travel_or_hospitality;

	@FindBy(xpath = "(//span[@class='lex-tile__label'])[7]")
	private WebElement disclose_a_potential_conflict;

	@FindBy(xpath = "(//span[@class='lex-tile__label'])[4]")
	private WebElement engage_a_go_hcp_or_patient;

	@FindBy(xpath = "(//span[@class='lex-tile__label'])[5]")
	private WebElement market_research;

	@FindBy(xpath = "(//span[@class='lex-tile__label'])[6]")
	private WebElement provide_external_funding;

	@FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[1]")
	private WebElement submissions;

	@FindBy(xpath = "(//div[@class='ant-tabs-tab-btn'])[2]")
	private WebElement approvals;

	// Initializing the page objects.

	public ApprovalDisclosuresPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public String Start_an_Approval_Request() {
		return approval_request_text.getText();

	}

	public WebElement annual_need_assessment() {
		return annual_needs_assessment;
	}

	public String verifyProvide_a_gift_travel_or_hospitality() {
		return provide_a_gift_travel_or_hospitality.getText();
	}

	public PGTH_RequestPage click_ProvideGTH() throws InterruptedException {
		provide_a_gift_travel_or_hospitality.click();
		Thread.sleep(5000);
		return new PGTH_RequestPage();
	}

	public WebElement disclose_the_receipt_of_a_gift_travel_or_hospitality() {
		return disclose_the_receipt_of_a_gift_travel_or_hospitality;
	}

	public WebElement disclose_potential_conflict() {
		return disclose_a_potential_conflict;
	}

	public WebElement engage_go_hcp_or_patient() {
		return engage_a_go_hcp_or_patient;
	}

	public WebElement provide_external_fundings() {
		return provide_external_funding;
	}

	public WebElement submission() {
		return submissions;
	}

	public WebElement approval() {
		return approvals;
	}

}
