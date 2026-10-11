package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static String getCellData(int rowNum, int colNum) {
		String value = "";
		
		try {
			FileInputStream fis = new FileInputStream("src/test/resources/testdata.xlsx");
			
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet("Sheet1");
			value = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			workbook.close();
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
			return value;
	}
}
