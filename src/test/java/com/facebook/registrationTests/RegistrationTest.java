package com.facebook.registrationTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.base.BaseTest;
import com.facebook.registrationPages.RegistrationPage;
import com.facebook.utilities.ExcelReader;

public class RegistrationTest extends BaseTest {
	RegistrationPage regPage;
	ExcelReader exReader;// make instance
	String file = "src/test/resources/registration.xlsx";
	String sheetName = "Sheet1";

	@BeforeMethod
	public void openFacebook() {
		openApp();

	}

	@Test
	public void createRegistrationTest() {
		regPage = new RegistrationPage(driver);
		regPage.createNewAccountButton();
		exReader = new ExcelReader(file, sheetName);
		regPage.firstNameMethod(exReader.getStringCellValue(1, 0));
		regPage.lastNameMethod(exReader.getStringCellValue(1, 1));
		regPage.mobileOrEmailMethod(exReader.getStringCellValue(1, 2));
		regPage.mobileOrEmail1Method(exReader.getStringCellValue(1, 3));
		regPage.newPasswordMethod(exReader.getStringCellValue(1, 4));
		regPage.monthDropDownMethod(exReader.getStringCellValue(1, 5));
		regPage.dayDropDownMethod(exReader.getStringCellValue(1, 6));
		regPage.yearDropDownMethod(exReader.getStringCellValue(1, 7));
		regPage.radioButton(exReader.getStringCellValue(1, 8));
		

	}
	@Test
	public void fabihaRegistrationTest() {
		regPage = new RegistrationPage(driver);
		regPage.createNewAccountButton();
		exReader = new ExcelReader(file, sheetName);
		regPage.firstNameMethod(exReader.getStringCellValue(2, 0));
		regPage.lastNameMethod(exReader.getStringCellValue(2, 1));
		regPage.mobileOrEmailMethod(exReader.getStringCellValue(2, 2));
		regPage.mobileOrEmail1Method(exReader.getStringCellValue(2, 3));
		regPage.newPasswordMethod(exReader.getStringCellValue(2, 4));
		regPage.monthDropDownMethod(exReader.getStringCellValue(2, 5));
		regPage.dayDropDownMethod(exReader.getStringCellValue(2, 6));
		regPage.yearDropDownMethod(exReader.getStringCellValue(2, 7));
		regPage.radioButton(exReader.getStringCellValue(2, 8));
		
	}
	@Test
	public void faizaRegistrationTest() {
		regPage = new RegistrationPage(driver);
		regPage.createNewAccountButton();
		exReader = new ExcelReader(file, sheetName);
		regPage.firstNameMethod(exReader.getStringCellValue(3, 0));
		regPage.lastNameMethod(exReader.getStringCellValue(3, 1));
		regPage.mobileOrEmailMethod(exReader.getStringCellValue(3, 2));
		regPage.mobileOrEmail1Method(exReader.getStringCellValue(3, 3));
		regPage.newPasswordMethod(exReader.getStringCellValue(3, 4));
		regPage.monthDropDownMethod(exReader.getStringCellValue(3, 5));
		regPage.dayDropDownMethod(exReader.getStringCellValue(3, 6));
		regPage.yearDropDownMethod(exReader.getStringCellValue(1, 7));
		regPage.radioButton(exReader.getStringCellValue(3, 8));
		
	}

	// @AfterMethod
	public void closeFacebook() {
		closeApp();
	}

}
