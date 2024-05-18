package testcase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.horizon.stage.pages.ApprovalDisclosuresPage;
import com.horizon.stage.pages.GatewayPage;
import com.horizon.stage.pages.LoginPage;
import com.horizon.stage.pages.PGTH_RequestPage;

import base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.TestUtil;

public class PGTH_RequestTC extends BaseTest {

	GatewayPage gatewayPage;
	LoginPage loginPage;
	PGTH_RequestPage provide_GTHPage;
	ApprovalDisclosuresPage approvalDisclosuresPage;

	@BeforeMethod
	public void initializeLogin() throws InterruptedException {
		loginPage = new LoginPage();
		approvalDisclosuresPage = new ApprovalDisclosuresPage();
		provide_GTHPage = new PGTH_RequestPage();
		gatewayPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		approvalDisclosuresPage = gatewayPage.clickADTile();
		provide_GTHPage = approvalDisclosuresPage.click_ProvideGTH();

	}

	@DataProvider
	public Iterator<Object[]> getTestdata() {
		ArrayList<Object[]> demoTestData = TestUtil.getDataFromExcel();
		return demoTestData.iterator();
	}

	@Test(dataProvider = "getTestdata")
	public void Provide_a_Gift_Travel_or_Hospitality(String requestName, String giftDescription, String additionalInfo,
			String sortDescription, String amount, String fullName, String employer, String title, String homeCountry,
			String email, String manager, String localLegalRecipient, String compalianceOps, String compaliance)
			throws IOException, InterruptedException {
		

		provide_GTHPage.GTH_Request().sendKeys(requestName);

		provide_GTHPage.approximateDate1();

		provide_GTHPage.currentDate1();

		//provide_GTHPage.approximateDate2();

	//	provide_GTHPage.currentDate2();

		provide_GTHPage.selectCountry(1);

		provide_GTHPage.qActivityDetailsPurpose().sendKeys(giftDescription);

		provide_GTHPage.fileUploaded();

		provide_GTHPage.qActivityProvideRecipientsSubstantiveEducationYes();

		provide_GTHPage.qSupportConnectionWithCompInspNo();

		provide_GTHPage.qBenefitsForCompanyFromActivityNo();

		provide_GTHPage.qGthComplyWithApplicableProvisionsYes();

		provide_GTHPage.qRecipientSelectionOfMeetingLocationNo();

		provide_GTHPage.qOfferedToProvideOrSupportNo();

		provide_GTHPage.qRefrainFromActivitylForAnyReasonNo();

		provide_GTHPage.qActivViolateApplicableLawsRegulationsEtcNo();

		provide_GTHPage.qBenefitsForFamilyRelativeNo();

		provide_GTHPage.qSecretiveUnusualNotTransparentNo();

		provide_GTHPage.qAdditionalInformationUpload().sendKeys(additionalInfo);

		provide_GTHPage.clickNextButton();

		provide_GTHPage.addCategory();
		Thread.sleep(2000);

		provide_GTHPage.categoryEntertainment();
		Thread.sleep(3000);
		provide_GTHPage.qShortDescription().sendKeys(sortDescription);
		Thread.sleep(2000);
		provide_GTHPage.amountPerRecipient().sendKeys(amount);

		provide_GTHPage.supportMethod(0);
		Thread.sleep(2000);

		provide_GTHPage.saveAndClose();
		Thread.sleep(2000);

		provide_GTHPage.clickAddRecipient();

		provide_GTHPage.clickGovernmentOfficial();

		provide_GTHPage.goFullName().sendKeys(fullName);
		Thread.sleep(1000);

		provide_GTHPage.goEmployer().sendKeys(employer);
		Thread.sleep(1000);

		provide_GTHPage.goTitle().sendKeys(title);
		Thread.sleep(1000);

		provide_GTHPage.goHomeCountry(homeCountry);

		provide_GTHPage.goEmailAddress().sendKeys(email);
		Thread.sleep(2000);

		provide_GTHPage.qRecipientHaveInfluence();
		Thread.sleep(1000);

		provide_GTHPage.goNext();
		Thread.sleep(2000);

		provide_GTHPage.plusSupportCategory();

		provide_GTHPage.editSupportCategory();

		provide_GTHPage.qLocation(2);

		provide_GTHPage.updateSupportCategory();

		provide_GTHPage.saveAndCloseSupportCategory();

		provide_GTHPage.submitRequest();

		provide_GTHPage.approverManager(manager);

		provide_GTHPage.approverLocalLegalRecipient(localLegalRecipient);

		provide_GTHPage.approverComplianceOps(compalianceOps);

		provide_GTHPage.approverCompliance(compaliance);

		provide_GTHPage.finalRequestSumit();
		String apiURL = driver.getCurrentUrl();
		System.out.println(apiURL);
		Response response = RestAssured.post(apiURL);
		System.out.println(response.getStatusCode());
		Assert.assertEquals(response.getStatusCode(), 200);
		
	

	}

}
