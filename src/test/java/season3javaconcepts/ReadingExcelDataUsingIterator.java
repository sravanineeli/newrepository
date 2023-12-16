package season3javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelDataUsingIterator {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\seleniumpracticefolder\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet2");
		Iterator<Row> rows=ws.rowIterator();
		Row r=null;
		Cell c=null;
		while(rows.hasNext()) {
			r=rows.next();	
			Iterator<Cell> cells=r.cellIterator();
			while(cells.hasNext()) {
				c=cells.next();
				if(c.getCellType()==CellType.STRING) {
					System.out.println(c.getStringCellValue());
				}
				if(c.getCellType()==CellType.NUMERIC) {
					System.out.println(c.getNumericCellValue());
				}
				if(c.getCellType()==CellType.BOOLEAN) {
					System.out.println(c.getBooleanCellValue());
				}
			}
		}
		

	}

}
