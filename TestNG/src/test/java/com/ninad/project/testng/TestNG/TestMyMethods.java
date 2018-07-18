package com.ninad.project.testng.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninad.project.constants.Myconstants;
import com.ninad.project.entities.User;
import com.ninad.project.serviceImpl.UserServiceImpl;
import com.ninad.project.utility.Authenticate;

public class TestMyMethods {

	
	@Test (dataProvider="ninad")	
	public void testAuthenticateMethod (String username , String password , String op) throws InterruptedException{
		
		UserServiceImpl userService = new UserServiceImpl();
		
		String actop =Authenticate.authenticate(username, password);
		System.out.println("*** method op = " + actop + " for uname "+username+ " password "+ password );
		Assert.assertEquals(actop, op);
	
		
		
	}
	
	@DataProvider(name="ninad")
	public Object [][] getData () throws InvalidFormatException, IOException{
		
		File f = new File("E:\\testngTests.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet= wb.getSheetAt(0);
		
		
		Object [][] obarr = new Object [sheet.getPhysicalNumberOfRows()][3];		
		
		for (int i = 0 ; i<sheet.getPhysicalNumberOfRows(); i++ ){
			
			for (int j = 0 ; j<3 ; j++){				
				
				try {
				obarr[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
				catch (NullPointerException e){
					obarr[i][j]="";
				}				
			}	
		}
		
		return obarr;		
	}
			
		
		
		/*
		obarr [0][0] ="ninad";
		obarr [0][1] ="ninad123";
		obarr [0][2] = Myconstants.success ;
		
		obarr [1][0] =null;
		obarr [1][1] =null;
		obarr [1][2] = Myconstants.fieldscantbenull;*/
		

	
	
	
	
}
