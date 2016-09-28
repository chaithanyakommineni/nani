import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\chaitu\\Desktop\\Daily tracker0.xlsx")));
		XSSFSheet sheet=workbook.getSheetAt(0);
		int rows=sheet.getLastRowNum();
		for(int i=0;i<rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int cellscount=row.getLastCellNum();
			for(int j=0;j<cellscount;j++)
			{
				XSSFCell cell=row.getCell(j);
				
				System.out.println("Data in row,cell:"+i+","+j+" is :"+cell.getStringCellValue());
			}
			workbook.close();
		}
	}

}
