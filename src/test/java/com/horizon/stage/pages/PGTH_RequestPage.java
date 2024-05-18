package com.horizon.stage.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class PGTH_RequestPage extends BaseTest {

	public JavascriptExecutor js;

	@FindBy(xpath = "//input[@id='request_name']")
	private WebElement request_name;

	@FindBy(xpath = "//input[@id='q_date_of_activity']") 
	private WebElement q_date_of_activity1;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]"
			+ "/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr/td/div[contains(text(), \"25\")]")
	private WebElement current_Date1;

	//@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-gateway']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")
	//private WebElement q_date_of_activity2;

	//@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'])[25]")
//	private WebElement current_Date2;

	@FindBy(xpath = "//body/div[@id='root']/div[@id='app']/div[@id='app-content']/div[@id='app-content-gateway']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
	private WebElement select_Country;

	@FindBy(xpath = "//textarea[@id='q_activity_details_purpose']")
	private WebElement q_activity_details_purpose;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--secondary lex-button--rounded lex-file-upload__btn'])[1]")
	private WebElement addFile;

	@FindBy(xpath = "//input[@id='q_activity_provide_recipients_substantive_education-yes']")
	private WebElement q_activity_provide_recipients_substantive_education;

	@FindBy(xpath = "//input[@id='q_support_connection_with_comp_insp-no']")
	private WebElement q_support_connection_with_comp_insp;

	@FindBy(xpath = "//input[@id='q_benefits_for_company_from_activity-no']")
	private WebElement q_benefits_for_company_from_activity;

	@FindBy(xpath = "//input[@id='q_gth_comply_with_applicable_provisions-yes']")
	private WebElement q_gth_comply_with_applicable_provisions;

	@FindBy(xpath = "//input[@id='q_recipient_selection_of_meeting_location-no']")
	private WebElement q_recipient_selection_of_meeting_location;

	@FindBy(xpath = "//input[@id='q_offered_to_provide_or_support-no']")
	private WebElement q_offered_to_provide_or_support;

	@FindBy(xpath = "//input[@id='q_refrain_from_activityl_for_any_reason-no']")
	private WebElement q_refrain_from_activityl_for_any_reason;

	@FindBy(xpath = "//input[@id='q_activ_violate_applicable_laws_regulations_etc-no']")
	private WebElement q_activ_violate_applicable_laws_regulations_etc;

	@FindBy(xpath = "//input[@id='q_benefits_for_family_relative-no']")
	private WebElement q_benefits_for_family_relative;

	@FindBy(xpath = "//input[@id='q_secretive_unusual_not_transparent-no']")
	private WebElement q_secretive_unusual_not_transparent;

	@FindBy(xpath = "//textarea[@id='q_additional_information_upload']")
	private WebElement q_additional_information_upload;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement button_Next;

	@FindBy(xpath = "(//span[@class='lex-button-menu__dropdown-button-span'])[1]")
	private WebElement add_Category;

	@FindBy(xpath = "//li[@id='t_provide_gift_travel_hospitality:qu_entertainment']")
	private WebElement category_Entertainment;

	@FindBy(xpath = "//textarea[@id='q_short_description']")
	private WebElement q_short_description;

	@FindBy(xpath = "//input[@data-testid='currencybox-input']")
	private WebElement amount_Per_Recipient;

	@FindBy(xpath = "(//input[@class='ant-select-selection-search-input'])[2]")
	private WebElement support_Method;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement save_and_close;

	@FindBy(xpath = "//span[contains(text(),'Add Recipient')]")
	private WebElement add_Recipient;

	@FindBy(xpath = "//body[1]/div[9]/div[1]/div[1]/ul[1]/li[1]/span[1]/span[1]")
	private WebElement government_Official;

	@FindBy(xpath = "//input[@id='q_full_name_ind_autocomplete']")
	private WebElement full_Name;

	@FindBy(xpath = "//input[@id='q_employer']")
	private WebElement go_Employer;

	@FindBy(xpath = "//input[@id='q_title_official_position']")
	private WebElement go_Title;

	@FindBy(xpath = "//input[@id='q_country']")
	private WebElement go_Home_Country;

	@FindBy(xpath = "(//input[@class='lex-textbox__input lex-textbox__input--secondary'])[2]")
	private WebElement go_Email_Address;

	@FindBy(xpath = "//input[@id='q_recipient_have_influence-no']")
	private WebElement q_recipient_have_influence;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[3]")
	private WebElement go_Next;

	@FindBy(xpath = "//div[@class='requests-DlK2dbCMxgmZ5SwMUoNG']")
	private WebElement plus_Support_Category;

	@FindBy(xpath = "//div[@class='requests-TMYYkpc8QiMZ8hKKrwNp']")
	private WebElement edit_Support_Category;

	@FindBy(xpath = "//input[@id='q_location']")
	private WebElement q_location;

	@FindBy(xpath = "//div[@class='requests-j6zo9FiNpeph7nmt_B0W']")
	private WebElement update_Support_Category;

	@FindBy(xpath = "//button[@id='confirm']")
	private WebElement save_And_Close_Support_Category;

	@FindBy(xpath = "(//button[@class='lex-button lex-button--primary lex-button--rounded'])[2]")
	private WebElement submit_Request;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[1]")
	private WebElement approver_Manager;
//	@FindBy(css = "div.lex-modal__container:nth-child(19) div.ant-modal-root div.ant-modal-wrap.lex-modal__wrap div.ant-modal.lex-modal.requests-csqdTo3z9XUBb3KYjIq8 div.ant-modal-content:nth-child(2) div.ant-modal-body div.requests-XbXrGZLf5krxKeJM0KX4:nth-child(1) div.request-modal__submit-steps div.requests-cZA3GT8CjveQmS3nApo2:nth-child(1) div.requests-PZwcY9MgQWHjlZ9TalyB div.lex-multiselect div.lex-spinner.lex-spinner--size-medium.lex-spinner--placement-center.lex-spinner--cover.lex-spinner--primary.lex-multiselect__spinner div.ant-select.lex-multiselect__select.ant-select-multiple.ant-select-allow-clear.ant-select-show-arrow.ant-select-show-search div.ant-select-selector > div.ant-select-selection-overflow")
//	private WebElement approver_Manager;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[2]")
	private WebElement approver_Local_Legal_Recipient;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[3]")
	private WebElement approver_Compliance_Ops;

	@FindBy(xpath = "(//div[@class='ant-select-selection-overflow'])[4]")
	private WebElement approver_Compliance;

	@FindBy(xpath = "//button[@id='confirm']")
	private WebElement final_Request_Sumit;

	// Initializing the page objects.

	public PGTH_RequestPage() {
		PageFactory.initElements(driver, this);
		this.js = (JavascriptExecutor) driver;
	}

	// Actions

	public static void uploadFile(String fileLocation) {
		try {

			setClipboardData(fileLocation);
			driver.switchTo().window(driver.getWindowHandle());
			Robot robot = new Robot();
			/*
			 * robot.delay(500);
			 * 
			 * // Cmd + Tab is needed since it launches a Java app and the browser looses
			 * focus robot.keyPress(KeyEvent.VK_META); robot.keyPress(KeyEvent.VK_TAB);
			 * robot.keyRelease(KeyEvent.VK_META); robot.keyRelease(KeyEvent.VK_TAB);
			 * robot.delay(500);
			 */

			// Open Goto window CMD+SHIFT+G
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			robot.keyRelease(KeyEvent.VK_G);
			robot.delay(1000);

			// Paste the clip board value CMD+V
			robot.keyPress(KeyEvent.VK_META);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_META);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000);

			// Press Enter key to select file
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(1000);

		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void setClipboardData(String string) {

		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public WebElement GTH_Request() {
		return request_name;
	}

	public void approximateDate1() throws InterruptedException {
		Thread.sleep(2000);
		q_date_of_activity1.click();
	}

	public void currentDate1() {
		current_Date1.click();
		current_Date1.click();
	}

	/*public void approximateDate2() throws InterruptedException {
		Thread.sleep(2000);
		q_date_of_activity2.click();
	}

	public void currentDate2() throws InterruptedException {
		current_Date2.click();

	} */

	public void selectCountry(int index) throws InterruptedException {

		js.executeScript("arguments[0].scrollIntoView(true);", select_Country);
		Thread.sleep(2000);
		select_Country.click();
		List<WebElement> drop_country = select_Country
				.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		Thread.sleep(1000);
		drop_country.get(index).click();

	}

	public WebElement qActivityDetailsPurpose() {
		return q_activity_details_purpose;
	}

	public void fileUploaded() throws InterruptedException {

		addFile.click();
		Thread.sleep(3000);
		uploadFile("/Users/shivaliguleria/Downloads/images.jpeg");
		Thread.sleep(6000);
	}

	public void qActivityProvideRecipientsSubstantiveEducationYes() {
		boolean selectRadio = q_activity_provide_recipients_substantive_education.isSelected();
		if (selectRadio == false) {
			q_activity_provide_recipients_substantive_education.click();
		}
	}

	public void qSupportConnectionWithCompInspNo() {
		boolean selectRadio = q_support_connection_with_comp_insp.isSelected();
		if (selectRadio == false) {
			q_support_connection_with_comp_insp.click();
		}
	}

	public void qBenefitsForCompanyFromActivityNo() {
		boolean selectRadio = q_benefits_for_company_from_activity.isSelected();
		if (selectRadio == false) {
			q_benefits_for_company_from_activity.click();
		}
	}

	public void qGthComplyWithApplicableProvisionsYes() {
		boolean selectRadio = q_gth_comply_with_applicable_provisions.isSelected();
		if (selectRadio == false) {
			q_gth_comply_with_applicable_provisions.click();
		}
	}

	public void qRecipientSelectionOfMeetingLocationNo() {
		boolean selectRadio = q_recipient_selection_of_meeting_location.isSelected();
		if (selectRadio == false) {
			q_recipient_selection_of_meeting_location.click();
		}
	}

	public void qOfferedToProvideOrSupportNo() {
		boolean selectRadio = q_offered_to_provide_or_support.isSelected();
		if (selectRadio == false) {
			q_offered_to_provide_or_support.click();
		}
	}

	public void qRefrainFromActivitylForAnyReasonNo() {
		boolean selectRadio = q_refrain_from_activityl_for_any_reason.isSelected();
		if (selectRadio == false) {
			q_refrain_from_activityl_for_any_reason.click();
		}
	}

	public void qActivViolateApplicableLawsRegulationsEtcNo() {
		boolean selectRadio = q_activ_violate_applicable_laws_regulations_etc.isSelected();
		if (selectRadio == false) {
			q_activ_violate_applicable_laws_regulations_etc.click();
		}
	}

	public void qBenefitsForFamilyRelativeNo() {
		boolean selectRadio = q_benefits_for_family_relative.isSelected();
		if (selectRadio == false) {
			q_benefits_for_family_relative.click();
		}
	}

	public void qSecretiveUnusualNotTransparentNo() {
		boolean selectRadio = q_secretive_unusual_not_transparent.isSelected();
		if (selectRadio == false) {
			q_secretive_unusual_not_transparent.click();
		}
	}

	public WebElement qAdditionalInformationUpload() {
		return q_additional_information_upload;
	}

	public void clickNextButton() {
		button_Next.click();
	}

	public void addCategory() {
		add_Category.click();
	}

	public void categoryEntertainment() {
		category_Entertainment.click();
	}

	public WebElement qShortDescription() {
		return q_short_description;
	}

	public WebElement amountPerRecipient() {
		return amount_Per_Recipient;
	}

	public void supportMethod(int index) throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView(true);", support_Method);
		support_Method.click();
		support_Method.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		List<WebElement> support = support_Method
				.findElements(By.xpath("(//div[@class='rc-virtual-list-holder-inner']/div)"));
		support.get(index).click();
		Thread.sleep(1000);
	}

	public void saveAndClose() throws InterruptedException {
		save_and_close.click();
		Thread.sleep(2000);
	}

	public void clickAddRecipient() throws InterruptedException {
		add_Recipient.click();
		Thread.sleep(2000);
	}

	public void clickGovernmentOfficial() throws InterruptedException {
		WebElement element = driver
				.findElement(By.xpath("//body[1]/div[10]/div[1]/div[1]/ul[1]/li[1]/span[1]/span[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();

	}

	public WebElement goFullName() {
		return full_Name;
	}

	public WebElement goEmployer() {
		return go_Employer;
	}

	public WebElement goTitle() {
		return go_Title;
	}

	public void goHomeCountry(String home_country) throws InterruptedException {

		js.executeScript("arguments[0].scrollIntoView(true);", go_Home_Country);
		go_Home_Country.click();
		go_Home_Country.sendKeys(home_country);
		go_Home_Country.sendKeys(Keys.DOWN);
		go_Home_Country.sendKeys(Keys.ENTER);

	}

	public WebElement goEmailAddress() {
		return go_Email_Address;

	}

	public void qRecipientHaveInfluence() {

		WebElement button = driver.findElement(By.cssSelector("input[id='q_recipient_have_influence-no']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);

	}

	public void goNext() {
		go_Next.click();
	}

	public void plusSupportCategory() throws InterruptedException {
		plus_Support_Category.click();
		Thread.sleep(3000);
	}

	public void editSupportCategory() {
		edit_Support_Category.click();
	}

	public void qLocation(int index) throws InterruptedException {
		q_location.click();
		/*
		 * Thread.sleep(2000); List<WebElement> loc = q_location.findElements(By.xpath(
		 * "//div[@class='rc-virtual-list-holder-inner']/div")); loc.get(index).click();
		 * Thread.sleep(1000);
		 */

		Thread.sleep(2000);
		q_location.sendKeys("Brazil");
		Thread.sleep(1000);
		q_location.sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		q_location.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

	}

	public void updateSupportCategory() throws InterruptedException {
		update_Support_Category.click();
		Thread.sleep(5000);
	}

	public void saveAndCloseSupportCategory() throws InterruptedException {
		save_And_Close_Support_Category.click();
		Thread.sleep(7000);
	}

	public void submitRequest() throws InterruptedException {
		submit_Request.click();
		Thread.sleep(7000);
	}

	public void approverManager(String manager) throws InterruptedException {	
		Actions actions = new Actions(driver);
		actions.sendKeys( approver_Manager, manager).build().perform(); 
		Thread.sleep(1000);
		actions.sendKeys(Keys.DOWN ).perform(); 
		actions.sendKeys(Keys.ENTER ).perform(); 
		Thread.sleep(1000);
	}

	public void approverLocalLegalRecipient(String localLegalRecipient) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.sendKeys( approver_Local_Legal_Recipient, localLegalRecipient).build().perform(); 
		Thread.sleep(1000);
		actions.sendKeys(Keys.DOWN ).perform(); 
		actions.sendKeys(Keys.ENTER ).perform(); 
		Thread.sleep(1000);
		
	}

	public void approverComplianceOps(String compalianceOps) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		actions.sendKeys( approver_Compliance_Ops, compalianceOps).build().perform(); 
		Thread.sleep(1000);
		actions.sendKeys(Keys.DOWN ).perform(); 
		actions.sendKeys(Keys.ENTER ).perform(); 
		Thread.sleep(1000);
		
	}

	public void approverCompliance(String compaliance) throws InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys( approver_Compliance, compaliance).build().perform(); 
		Thread.sleep(1000);
		actions.sendKeys(Keys.DOWN ).perform(); 
		actions.sendKeys(Keys.ENTER ).perform(); 
		
		Thread.sleep(1000);
		
		
	}

	public void finalRequestSumit() throws InterruptedException {
		js.executeScript("arguments[0].click();", final_Request_Sumit);
		Thread.sleep(5000);
	}

}
