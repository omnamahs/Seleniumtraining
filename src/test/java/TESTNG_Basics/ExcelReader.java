package TESTNG_Basics;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {


	public static void main(String args[]) throws IOException {
		String filepath = "/src/test/java/Admin file.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filepath);
		XSSFSheet sheet = wb.getSheet("data");
		//System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		//System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for (int row = 0; row < rowcount;row++) {
			for (int col = 0; col < colcount; col++) {
				System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
			}
			
		}
	}

	
	

}
