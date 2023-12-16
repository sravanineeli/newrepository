package season3javaconcepts;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\seleniumpracticefolder\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		System.out.println(ws.getPhysicalNumberOfRows());
		System.out.println(ws.getLastRowNum());
		System.out.println(ws.getRow(0).getPhysicalNumberOfCells());
		System.out.println(ws.getRow(0).getLastCellNum());

	}

}
