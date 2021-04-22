package maven_basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivenwrite {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Selvakumar\\eclipse-workspace\\Old Eclipse Version\\maven_basics\\Excel\\DataDriven.xlsx");
		
		Workbook W = new XSSFWorkbook();
		
		Sheet s =W.createSheet("ExcelWrite1");
		
		Row r =s.createRow(1);
		
		Cell c =r.createCell(1);
		
		c.setCellValue("Selva");
		
		FileOutputStream fo =new FileOutputStream(f);
		
		W.write(fo);
		
		System.out.println("Printed");
		
		
		
	}

}
