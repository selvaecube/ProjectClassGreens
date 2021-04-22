package maven_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConcepts {

	public static void main(String[] args) throws IOException {

		// to pass the file location
		File f = new File("C:\\Users\\Selvakumar\\eclipse-workspace\\Old Eclipse Version\\maven_basics\\Excel\\DataDriven.xlsx");

		// to read values from excel
		FileInputStream e = new FileInputStream(f);

		Workbook W = new XSSFWorkbook(e);

		Sheet s = W.getSheet("ExcelWrite1");

		// Row r =s.getRow(2);
		//
		// Cell c = r.getCell(4);

		// System.out.println(c);

		int noofRows = s.getPhysicalNumberOfRows();

		// to iterate the number of rows
		for (int i = 0; i < noofRows; i++) {

			Row r = s.getRow(i);

			int noofcells = r.getPhysicalNumberOfCells();

			// to iterate the cells`

			for (int j = 0; j < noofcells; j++) {
				Cell C = r.getCell(j);
				
				// System.out.println(C);
				int type = C.getCellType();

				if (type == 1) {
					// string

					String Val = C.getStringCellValue();
					System.out.println(Val);
				} else if (DateUtil.isCellDateFormatted(C)) {
					
					Date d = C.getDateCellValue();
					
					SimpleDateFormat sim = new SimpleDateFormat("MM/dd/yyyy");
					String val = sim.format(d);
					System.out.println(val);
				} else {
					// number
					
					double d = C.getNumericCellValue();
					
					// Type casting -to convert double to long then to string bcoz we cannot direct
					// convert double to string

					long l = (long) d;

					String val = String.valueOf(l);
					System.out.println(val);
				}
			}
		}

	}

}
