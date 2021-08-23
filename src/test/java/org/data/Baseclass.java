package org.data;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	public static  WebDriver driver;
	public static Robot r;
	public static JavascriptExecutor js;
	public static Actions a;
	public static Select s;
	public static Alert al;
	public static TakesScreenshot tk;
	public static void chromeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}
	public static void urlTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
	
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void fillText(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void clickPr(WebElement ref) {
		ref.click();
	}
	public static String getData(int rowNumber, int colmNumber) throws IOException {
		File f=new File("C:\\Users\\Pradeep\\eclipse-workspace\\Framework\\testdatafile\\Mukesh Login.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fin);
		Sheet sh = w.getSheet("greens");
		Row rw  = sh.getRow(rowNumber);
		Cell cl = rw.getCell(colmNumber);
		int cellType = cl.getCellType();		
		String value="";
		if(cellType==1) {
			value = cl.getStringCellValue();
		}
			
			else if(cellType==0) {
				if(DateUtil.isCellDateFormatted(cl)) {
					Date d = cl.getDateCellValue();
					SimpleDateFormat sim=new SimpleDateFormat("mm-dd-yyyy");
					 value = sim.format(d);
				}
				else {
					double dl = cl.getNumericCellValue();
					long l=(long)dl;
					 value = String.valueOf(l);
					
				}
			}
		
		return value;
			}
		
	}
	



