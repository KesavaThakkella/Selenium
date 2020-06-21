package datafrmexcel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFmExcel {

	public static void main(String[] args) throws Exception {

		File Src = new File("C:/Users/kesava/Downloads/Norway Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(Src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();

		System.out.println("Data from Excel" + data0);
		System.out.println("Data from Excel" + data1);

		wb.close();

	}

}
