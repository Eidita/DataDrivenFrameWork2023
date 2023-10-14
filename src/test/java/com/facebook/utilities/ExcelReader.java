package com.facebook.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	/*
	 * whole thing name of workbook workbook name == registration book sheet name
	 * ==sheet1,sheet2,sheet3 row ==start from 0 column==start from 0
	 * cell==intersection row and column
	 * faruq=registration.xlsx-->sheet1-->row1-->column0==string cell
	 * index(formula.ex-priority 0)==start from 0 row start from 0 column start from
	 * 0 row always come first
	 */

	public String filePath;
	public String sheetName;

	public ExcelReader(String filePath, String sheetName) {
		super();
		this.filePath = filePath;
		this.sheetName = sheetName;
	}

	public String getStringCellValue(int rowNum, int columnNum) {
		String cellData = null;// flag

		try {
			FileInputStream fis = new FileInputStream(filePath);// filePath=processed variable
			Workbook registrationBook = new XSSFWorkbook(fis);// its a formula//XSSF is an interface

			// Workbook=parent
			// registrationBook=driver/child/variable
			Sheet sheet = registrationBook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(columnNum);// import cell ss one
			cellData = column.getStringCellValue();
			System.out.println(cellData);
			registrationBook.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {// Exception e=is a big container //IOException e=biggest container

			e.printStackTrace();
		}

		return cellData;

	}

	public double getNumericCellValue(int rowNum, int columnNum) {
		double cellData = 0.0;// flag

		try {
			FileInputStream fis = new FileInputStream(filePath);// filePath=processed variable
			Workbook registrationBook = new XSSFWorkbook(fis);// its a formula//XSSF is an interface
			Sheet sheet = registrationBook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell column = row.getCell(columnNum);// import cell ss one
			cellData = column.getNumericCellValue();
			System.out.println(cellData);
			registrationBook.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {// Exception e=is a big container //IOException e=biggest container

			e.printStackTrace();
		}

		return cellData;

	}

	public static void main(String[] args) {
		String file = "src/test/resources/registration.xlsx";
		ExcelReader er = new ExcelReader(file, "Sheet1");
		er.getStringCellValue(1, 0);
		// er.getStringCellValue(0, 2);
		// er.getStringCellValue(0, 3);

		ExcelReader er1 = new ExcelReader(file, "Sheet3");
		er1.getNumericCellValue(1, 0);
		er1.getNumericCellValue(1, 1);
	}

}
