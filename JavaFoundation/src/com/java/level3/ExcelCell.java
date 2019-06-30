package com.java.level3;

import java.util.Iterator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelCell {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		File anExcelFile = new File ("D:\\codespace\\JavaFoundation\\src\\resources\\Excel2Read.xlsx");
		FileInputStream fileInputObj = new FileInputStream(anExcelFile);
		XSSFWorkbook excel2ReadHandle = new XSSFWorkbook(fileInputObj);
		XSSFSheet cityNames = excel2ReadHandle.getSheet("City");
		
		Iterator<Row> rowsOfCity = cityNames.rowIterator();
		Row currentRow;
		while(rowsOfCity.hasNext()){
			currentRow=rowsOfCity.next();
			currentRow.forEach(currentCellRead -> {
				switch (currentCellRead.getCellType()){
					case Cell.CELL_TYPE_NUMERIC:
						System.out.println(currentCellRead.getNumericCellValue());
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.println(currentCellRead.getStringCellValue());
						break;
				}
			});
		}

		excel2ReadHandle.close();
		fileInputObj.close();
	}
}