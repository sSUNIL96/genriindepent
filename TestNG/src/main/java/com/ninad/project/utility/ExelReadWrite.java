package com.ninad.project.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReadWrite {

	public static void main(String[] args) throws IOException {
		readExel("E:\tesngTests");
	}
	
	public  static void readExel ( File file ){
		
	}
   public  static void readExel ( String filepath ) throws IOException{
		
	   File file = new File(filepath);
	   //URL u = new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
	   //InputStream in = u.openStream();
	   
	   FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet= wb.getSheetAt(0);
		System.out.println("printing first cell " +sheet.getRow(0).getCell(0).getStringCellValue());
		
	}
  
	
	
}
