package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import baselibrary.Baselibrary;

public class Excelutility extends Baselibrary {

	static String path = "C:\\Users\\Dell\\git\\Selenium\\18-Automation\\webtablet.xlsx";
	static String data = "";

	public static String getdataexcel(int rownum, int colnum) {

		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			data = sheet.getRow(rownum).getCell(colnum).getStringCellValue();

		} catch (Exception e) {
			System.out.println("issue in getdataexcel" + e);

		}
		return data;

	}

	public static int rowcount() {

		int rownum = 0;
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			rownum = sheet.getLastRowNum();

		} catch (Exception e) {
			System.out.println("issue in rowcount" + e);
		}
		return rownum;
	}

}
