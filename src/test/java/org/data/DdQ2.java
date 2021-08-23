package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DdQ2 {
	public static void main(String[]args) throws IOException {
		File f=new File("C:\\Users\\Pradeep\\eclipse-workspace\\Framework\\testdatafile\\Asharead.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("greens");
	
		
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
			Row rw = sh.getRow(i);
			for(int j=0;j<rw.getPhysicalNumberOfCells();j++) {
				Cell cl = rw.getCell(j);
				System.out.println(cl);
				
			}
		}
	}
}
		
	

