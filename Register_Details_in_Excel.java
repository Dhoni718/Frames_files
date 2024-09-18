package Frames;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register_Details_in_Excel {
	@Test
	public void verifydata() throws IOException {

		XSSFWorkbook wk= new XSSFWorkbook();
		XSSFSheet sh1=wk.createSheet("RD");
		XSSFRow   r=	sh1.createRow(0);
		XSSFCell  c=    r.createCell(0);
		XSSFCell  c1=    r.createCell(1);
		XSSFCell  c2=    r.createCell(2);
		XSSFCell  c3=    r.createCell(3);
		c.setCellValue("FIRST NAME");
		c1.setCellValue("LAST NAME");
		c2.setCellValue("PHONE NUMBER");
		c3.setCellValue("E-MAIL");

		XSSFRow  r1=sh1.createRow(1);
		r1.createCell(0).setCellValue("Dhoni");
		r1.createCell(1).setCellValue("Mahi");
		r1.createCell(2).setCellValue("7717727737");
		r1.createCell(3).setCellValue("Dhoni@gmail.com");

		XSSFRow r2=sh1.createRow(2);
		r2.createCell(0).setCellValue("Virat");
		r2.createCell(1).setCellValue("Kohli");
		r2.createCell(2).setCellValue("1818181818");
		r2.createCell(3).setCellValue("Virat@gmail.com");



		XSSFRow  r3=sh1.createRow(3);
		r3.createCell(0).setCellValue("Sachin");
		r3.createCell(1).setCellValue("Tendulkar");
		r3.createCell(2).setCellValue("1010101010");
		r3.createCell(3).setCellValue("Sachin@gmail.com");

		XSSFRow  r4=sh1.createRow(4);
		r4.createCell(0).setCellValue("Akshay");
		r4.createCell(1).setCellValue("Kumar");
		r4.createCell(2).setCellValue("9999999999");
		r4.createCell(3).setCellValue("Akshay@gmail.com");

		FileOutputStream fr= new FileOutputStream("D:\\maven_project\\Register_details\\Book45.xlsx");
		wk.write(fr);

	}
	@Test
	public void modifydata() throws IOException  {

		FileInputStream fi =new FileInputStream("D:\\maven_project\\Register_details\\Book45.xlsx");
		XSSFWorkbook we=new XSSFWorkbook(fi);
		XSSFSheet	sd=we.getSheet("RD");
		XSSFRow  r=sd.getRow(3);
		XSSFCell c=	r.getCell(0);
		c.setCellValue("Sachin Ton");
		FileOutputStream fm= new FileOutputStream("D:\\\\maven_project\\\\Register_details\\\\Book45.xlsx");
		we.write(fm);

	}

	@Test
	public void Get_Rows_And_Coloums() throws IOException {
		FileInputStream fi =new FileInputStream("D:\\maven_project\\Register_details\\Book45.xlsx");
		XSSFWorkbook we=new XSSFWorkbook(fi);
		XSSFSheet sd=we.getSheet("RD");
		int	totalnoofrows=	sd.getLastRowNum();
		System.out.println(totalnoofrows);
		for (int i = 0; i < totalnoofrows; i++) {
			XSSFRow r= sd.getRow(i);
			int cellcount=r.getLastCellNum();
			for (int j = 0; j < cellcount; j++) {
				System.out.println(r.getCell(j)+" ");
			}
			System.out.println();

		}
	}

	@Test
	public void Get_Particular_Value() throws IOException {
		FileInputStream fi =new FileInputStream("D:\\maven_project\\Register_details\\Book45.xlsx");
		XSSFWorkbook we=new XSSFWorkbook(fi);
		XSSFSheet	sd=we.getSheet("RD");
		XSSFRow rw=sd.getRow(2);
		String  data=rw.getCell(0).getStringCellValue();
		System.out.println(data);
	}
	@Test
	public void Get_Total_Row_Values() throws IOException {
		FileInputStream fi =new FileInputStream("D:\\maven_project\\Register_details\\Book45.xlsx");
		XSSFWorkbook we=new XSSFWorkbook(fi);
		XSSFSheet sd=we.getSheet("RD");
		int	totalnoofrows=	sd.getLastRowNum(); 
		for (int i = 0; i < totalnoofrows; i++) {
			XSSFRow	r=	sd.getRow(3);
			System.out.println(r.getCell(i).getStringCellValue());
		}

	}
	@Test
	public void login_with_multiple_values() throws IOException, InterruptedException {
		FileInputStream fd=new FileInputStream("D:\\maven_project\\Sheet1\\vamshidetails.xlsx");
		XSSFWorkbook wq=new XSSFWorkbook(fd);
		XSSFSheet	rt=wq.getSheet("Logindata");
		int totalnoofrows=rt.getLastRowNum();
		for (int i = 1; i <=totalnoofrows; i++) {
			XSSFRow	r=	rt.getRow(i);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			WebElement uname=	driver.findElement(By.id("username"));
			uname.sendKeys(r.getCell(0).getStringCellValue());
			Thread.sleep(2000);
			WebElement pwd=driver.findElement(By.id("password"));
			pwd.sendKeys(r.getCell(1).getStringCellValue());
			Thread.sleep(2000);
			WebElement login=driver.findElement(By.id("submit"));
			login.click();
			Thread.sleep(2000);


		}








	}
}




