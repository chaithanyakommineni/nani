import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class KeywordDriver {
	static WebDriver driver;
	static ActionKeywords actionkeyword = new ActionKeywords();
	public static void main(String[] args) throws Exception {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\chaitu\\selenium Scripts\\New folder\\KEYWORD DRIVEN FRAMEWORK\\KeywordDriven.xlsx");
		XSSFWorkbook workbook = reader.getWorkBook();
		XSSFSheet sheet = reader.getSheetByIndex(workbook, 0);
		
		
		for(int i=2;i<=sheet.getLastRowNum();i++){
			XSSFRow row = sheet.getRow(i);
			String action = reader.getCellValueAsString(row.getCell(3));
			switch(action.trim()){
			  case "openBrowser":
				  String browsertype = reader.getCellValueAsString(row.getCell(4));
				  actionkeyword.openbrowser(browsertype);
				   break;
			  case "openURL":
				   actionkeyword.openurl(reader.getCellValueAsString(row.getCell(4)));
				  break;
			  case "typeEditBox":
				  String uielement = reader.getCellValueAsString(row.getCell(1));
				  String locatortype = reader.getCellValueAsString(row.getCell(2));
				  String value = reader.getCellValueAsString(row.getCell(4));
				  actionkeyword.typeEditBox(uielement, locatortype, value);
				  break;
			  case "clickButton":
				  String uielement1 = reader.getCellValueAsString(row.getCell(1));
				  String locatortype1 = reader.getCellValueAsString(row.getCell(2));
				  actionkeyword.Clickbutton(uielement1,locatortype1);
				  break;
				  
			  case "verifysuccessfulLogin":
				  String uielement2 = reader.getCellValueAsString(row.getCell(1));
				  String locatortype2 = reader.getCellValueAsString(row.getCell(2));
				  actionkeyword.VerifysuccessfulLogin(uielement2, locatortype2);
				  break;
			}
		}
	
	}
}


