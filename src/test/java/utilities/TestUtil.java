package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class TestUtil extends BaseTest {
	public static String testData_Path = (System.getProperty("user.dir")
			+ "/src/test/resources/testdata/testdata.xlsx");
	public static String testData_Path2 = (System.getProperty("user.dir")
			+ "/src/test/resources/testdata/DemoTestData.xlsx");
	static Workbook workbook;
	static Sheet sheet;
	static ReadXLSXData reader;

	public static Object[][] getTestData(String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(testData_Path);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				// System.out.println(data[i][j]);

			}
		}

		return data;

	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");

		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new ReadXLSXData(testData_Path2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// for (int rowNum = 2; rowNum <= reader.getRowCount("pgth"); rowNum++) {
		int rowNum = 2;

		String requestName = reader.getCellData("pgth", "RequestName", rowNum);
		String giftDescription = reader.getCellData("pgth", "GiftDescription", rowNum);
		String additionalInfo = reader.getCellData("pgth", "AdditionalInfo", rowNum);
		String sortDescription = reader.getCellData("pgth", "SortDescription", rowNum);
		String amount = reader.getCellData("pgth", "Amount", rowNum);
		String fullName = reader.getCellData("pgth", "FullName", rowNum);
		String employer = reader.getCellData("pgth", "Employer", rowNum);
		String title = reader.getCellData("pgth", "Title", rowNum);
		String homeCountry = reader.getCellData("pgth", "HomeCountry", rowNum);
		String email = reader.getCellData("pgth", "Email", rowNum);
		String manager = reader.getCellData("pgth", "Manager", rowNum);
		String localLegalRecipient = reader.getCellData("pgth", "LocalLegalRecipient", rowNum);
		String complianceOps = reader.getCellData("pgth", "ComplianceOps", rowNum);
		String compliance = reader.getCellData("pgth", "Compliance", rowNum);
		
		

		Object obj[] = { requestName, giftDescription, additionalInfo, sortDescription, amount, fullName, employer,
				title, homeCountry, email, manager, localLegalRecipient, complianceOps, compliance  };
		myData.add(obj);

		// }
		return myData;

	}

}
