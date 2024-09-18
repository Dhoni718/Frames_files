package Frames;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InsertDataIntoExcelsheet {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh =wb.createSheet("Logindata");
		
		XSSFRow r=sh.createRow(0);
		XSSFCell c=r.createCell(0);
		XSSFCell c1=r.createCell(1);
		c.setCellValue("username");
		c1.setCellValue("password");
		
		XSSFRow	 r1=sh.createRow(1);
		XSSFCell c2=r1.createCell(0);
		XSSFCell c3=r1.createCell(1);
		c2.setCellValue("vamshi@gmail.com");
		c3.setCellValue("vamshi@123");
		
		XSSFRow	 r2=sh.createRow(2);
		XSSFCell c5=r2.createCell(0);
		XSSFCell c6=r2.createCell(1);
		c5.setCellValue("dhoni@gmail.com");
		c6.setCellValue("dhoni@123");
		
		XSSFRow	 r3=sh.createRow(3);
		XSSFCell c7=r3.createCell(0);
		XSSFCell c8=r3.createCell(1);
		c7.setCellValue("student");
		c8.setCellValue("Password123");
		
		
		


         FileOutputStream fo=new FileOutputStream("D:\\maven_project\\Sheet1\\vamshidetails.xlsx");
         FileOutputStream f1=new FileOutputStream("D:\\maven_project\\Excel\\Book2.xlsx");
         wb.write(f1);
         wb.write(fo);




	}

}
