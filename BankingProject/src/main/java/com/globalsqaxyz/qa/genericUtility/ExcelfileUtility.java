package com.globalsqaxyz.qa.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelfileUtility {
	FileInputStream fis;
	
	public String readExcelFile(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		fis=new FileInputStream("C:\\Users\\adigo\\eclipse-workspace\\BankingProject\\src\\test\\resources\\BankingTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		return wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	}

}
