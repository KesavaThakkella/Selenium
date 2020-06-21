package datafrmexcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFmExcel1 {

	public static void main(String[] args) throws Exception {

		File Src = new File("C:/Users/kesava/Downloads/Norway Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(Src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();

		System.out.println("Total no of rows" + rowcount + 1);

		for (int i = 0; i < rowcount; i++) {

			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();

			System.out.println("Data from Row" + i + " is " + data0);

		}

		wb.close();

	}

}
