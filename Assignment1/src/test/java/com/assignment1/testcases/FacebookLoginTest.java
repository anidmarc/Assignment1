package com.assignment1.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignment1.base.Base;
import com.assignment1.pages.FacebookLoginPage;
import com.assignment1.util.ExcelFileReader;

public class FacebookLoginTest extends Base{

	FacebookLoginPage flp;

	public FacebookLoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		flp = new FacebookLoginPage();	
	}
	
	@Test
	public void pageTitleTest() {
	String LoginPageTitle =	flp.LoginPageTitle();
	System.out.println("The Page title is "+LoginPageTitle);
	}
	
	@Test
	public void userloginTest() {
		ExcelFileReader reader = new ExcelFileReader();
		reader.testData("D:\\Aniruddha_WorkSpace\\Assignment1-master\\Assignment1-master\\Assignment1\\src\\main\\java\\com\\assignment1\\testdata\\ExcelTestData.xlsx");
		String row = ExcelFileReader.sheet.getRow(1).getCell(0).getStringCellValue();
		String row1 = ExcelFileReader.sheet.getRow(1).getCell(1).getStringCellValue();
		flp.loginuser(row, row1);
		System.out.println("Hello World");
		}
	
	@AfterMethod
	public void teadDown() {
		driver.quit();
	}
}
