package com.crm.Actitime.GernericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {
	public String readDataFromExcel(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		String data = wbf.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;

	}
}
