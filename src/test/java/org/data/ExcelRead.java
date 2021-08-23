package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[]args) throws IOException {
	File f=new File("C:\\Users\\Pradeep\\eclipse-workspace\\Framework\\testdatafile\\Asharead.xlsx");
	FileInputStream fin=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fin);
	Sheet sh = w.getSheet("greens");
	int phyrows = sh.getPhysicalNumberOfRows();
	System.out.println("Total number rows:"+phyrows);
	Row rw = sh.getRow(2);
	int phycels = rw.getPhysicalNumberOfCells();
	System.out.println("total number of cells:"+phycels);
	
}
}
