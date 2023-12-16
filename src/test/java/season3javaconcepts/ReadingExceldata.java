package season3javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;


public class ReadingExceldata {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\seleniumpracticefolder\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		Row row=null;
		Cell cell=null;
		
		for(int i=0;i<=ws.getLastRowNum();i++) {
			row=ws.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++) {
				cell=row.getCell(j);
				if(cell.getCellType()==CellType.STRING) {
					System.out.println(cell.getStringCellValue());
				}
				if(cell.getCellType()==CellType.NUMERIC) {
					System.out.println(cell.getNumericCellValue());
				}
				if(cell.getCellType()==CellType.BOOLEAN) {
					System.out.println(cell.getBooleanCellValue());
				}
			}
		}
	}

}
