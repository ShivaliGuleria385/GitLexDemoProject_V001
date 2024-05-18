package com.horizon.stage.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class GatewayPage extends BaseTest {

	// Page factory - OR:

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	WebElement usernamelabel;

	@FindBy(xpath = ("//span[contains(text(),'Settings')]"))
	WebElement settingsBtn;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-sidebar']/div[1]/div[1]/div[2]/*[1]")
	WebElement leftnavbarBtn;

	@FindBy(xpath = "//span[contains(text(),'Approvals & Disclosures')]")
	WebElement approvalsDisclosuresBtn;

	@FindBy(xpath = "//span[contains(text(),'Third Party Management')]")
	WebElement thirdPartyManagementBtn;

	@FindBy(xpath = "//span[contains(text(),'Campaigns')]")
	WebElement campaignsBtn;

	@FindBy(xpath = "//span[contains(text(),'FMV Profiling')]")
	WebElement fMVProfilingBtn;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksBtn;

	@FindBy(xpath = "//span[contains(text(),'Screening')]")
	WebElement screeningBtn;

	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	WebElement adminBtn;

	@FindBy(xpath = "//span[contains(text(),'Insights')]")
	WebElement insightsBtn;

	@FindBy(xpath = "//span[contains(text(),'FAQs & Guidance')]")
	WebElement fAQsGuidanceBtn;

	@FindBy(xpath = "//span[contains(text(),'Gateway Guide')]")
	WebElement gatewayGuideBtn;

	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement logoutBtn;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/*[1]")
	WebElement logoIcon;

	@FindBy(xpath = "//span[contains(text(),'INTEGRITY GATEWAY')]")
	WebElement integrityGatewayTxt;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-gateway']/div[1]/div[1]/main[1]/div[1]/div[1]/a[1]/div[1]")
	WebElement approvalDTile;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-gateway']/div[1]/div[1]/main[1]/div[1]/div[1]/a[2]/div[1]")
	WebElement TPMTile;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-gateway']/div[1]/div[1]/main[1]/div[1]/div[1]/a[3]/div[1]")
	WebElement campaignsTile;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-gateway']/div[1]/div[1]/main[1]/div[1]/div[1]/a[4]/div[1]")
	WebElement complianceMonitoTile;

	@FindBy(xpath = "//h3[contains(text(),'Action Items')]")
	WebElement actionItems;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/h6[1]")
	WebElement actionItemText;

	@FindBy(xpath = "//span[contains(text(),'Submissions')]")
	WebElement submissionsTab;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	WebElement approvalsTab;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[1]")
	WebElement tasksTab;

	@FindBy(xpath = "//span[contains(text(),'Id')]")
	WebElement id;

	@FindBy(xpath = "//span[contains(text(),'Request Name')]")
	WebElement requestName;

	@FindBy(xpath = "//thead/tr[1]/th[3]")
	WebElement requestType;

	@FindBy(xpath = "//span[contains(text(),'Submitter')]")
	WebElement submitter;

	@FindBy(xpath = "//span[contains(text(),'Created')]")
	WebElement created;

	@FindBy(xpath = "//span[contains(text(),'Activity Date')]")
	WebElement activityDate;

	@FindBy(xpath = "//span[contains(text(),'Request Status')]")
	WebElement requestStatus;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/main[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	WebElement lexPagination;

//Initializing the page objects.
	public GatewayPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions

	public String verifyGatewayPageTitle() {
		return driver.getTitle();

	}

	public String verifyUserName() {
		return usernamelabel.getText();

	}

	public Boolean verifySettingsBtn() {
		return settingsBtn.isDisplayed();

	}

	public Boolean verifyLeftNavBarBtn() {
		return leftnavbarBtn.isDisplayed();

	}

	public Boolean verifyADTile() {
		return approvalDTile.isDisplayed();

	}
	
	public ApprovalDisclosuresPage clickADTile() throws InterruptedException {
		 approvalDTile.click();
		 Thread.sleep(2000);
		 return new ApprovalDisclosuresPage(); 

	}

	public Boolean verifyTPMTile() {
		return TPMTile.isDisplayed();

	}

	public Boolean verifyCampaignTile() {
		return campaignsTile.isDisplayed();

	}

	public Boolean verifyCompalianceTile() {
		return complianceMonitoTile.isDisplayed();

	}

}
