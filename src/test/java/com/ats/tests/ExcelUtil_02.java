package com.ats.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ats.helper.CustomAssertion;
import com.ats.utils.ExcelUtil;

public class ExcelUtil_02 {

	
	ExcelUtil excelUtil;
	String sheetName = "ContactUS";
	
	Logger logger = Logger.getLogger(ExcelUtilTests.class.getName());
	
	@BeforeClass
	public void intialize() {
		String excelFilePath = "./src/test/resources/Excel_testData.xlsx";
		logger.info("Excel file path : "+excelFilePath);
		excelUtil = new ExcelUtil(excelFilePath);
	}
	
//	@Test(priority=1)
//	public void getCellDataWithColumnName_Test() {	
//		String cellData = excelUtil.getCellData(sheetName, "Email", 1);
//		CustomAssertion.isEqual("", cellData, "Get cell data with column name");
//	}
	
	@Test(priority=5)
	public void getCellData_Test() {	
		String cellData = excelUtil.getCellData(sheetName, 1, 0);
		CustomAssertion.isEqual("", cellData, "Get cell data");
	}
	

}
