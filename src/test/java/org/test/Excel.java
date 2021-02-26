package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Nanda kishare\\eclipse-workspace\\Nanda\\ExcelRead\\Data\\Test.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook w = new XSSFWorkbook(stream);
		
		Sheet sheet = w.getSheet("Test");
		
		Row row = sheet.getRow(4);
		
		
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
		int pn = sheet.getPhysicalNumberOfRows();
		System.out.println(pn);
		
		Sheet sheet2 = w.getSheet("test");
		Row row2 = sheet.getRow(2);
		
		int phs = row.getPhysicalNumberOfCells();
		System.out.println(phs);
		
		
		
		
		}
}
