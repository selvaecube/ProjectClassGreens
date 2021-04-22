package maven_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// to pass the file location
				File f = new File("C:\\Users\\Selvakumar\\eclipse-workspace\\Old Eclipse Version\\maven_basics\\Excel\\DataDriven.xlsx");
				
				FileInputStream e = new FileInputStream(f);

				Workbook W = new XSSFWorkbook(e);
				
				Sheet s =W.getSheet("ExcelWrite1");
				
				Row r =s.getRow(1);
				
				 Cell c = r.getCell(1);
				 
				 String val =c.getStringCellValue();
				 
				 if(val.equals("Selva"))
				 {
					 c.setCellValue("Ridhu");
					 FileOutputStream fn =new FileOutputStream(f);
					 W.write(fn);
					 
				 }
				 
				 
				 
				 
				 
				 
				
	}

}
