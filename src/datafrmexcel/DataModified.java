package datafrmexcel;

import lib.ExcelDataConfig;

public class DataModified {

	public static void main(String[] args) {

		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\kesava\\Downloads\\Test Data.xlsx");

		System.out.println(excel.getData(0, 0, 0));
		System.out.println(excel.getData(0, 0, 1));

	}

}
