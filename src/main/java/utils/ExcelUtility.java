package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static FileInputStream fileStream;
	static XSSFWorkbook workBook;
	static XSSFSheet sheet;

	public static Object[][] ReadData(String filePath, String sheetName) throws IOException {
		fileStream = new FileInputStream(filePath); 
		workBook = new XSSFWorkbook(fileStream); 
		sheet = workBook.getSheet(sheetName); 
		
		Row row = sheet.getRow(0);
		Cell cell;
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = row.getLastCellNum();
		
		Object[][] dataObj = new Object[rowCount][colCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				row = sheet.getRow(i); 
				cell = row.getCell(j); 

				switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						dataObj[i][j] = (int) cell.getNumericCellValue();
						break;
					case Cell.CELL_TYPE_STRING:
						dataObj[i][j] = cell.getStringCellValue();
						break;
					case Cell.CELL_TYPE_BOOLEAN:
						dataObj[i][j] = cell.getBooleanCellValue();
						break;
					case Cell.CELL_TYPE_BLANK:
						dataObj[i][j] = "";
						break;
					default:
						dataObj[i][j] = null;
						break;
				}
			}
		}

		return dataObj;
	}

}
