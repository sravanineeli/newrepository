package season3javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingaRowinExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("D:\\seleniumpracticefolder\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("sheet1");
		
		//creating a cell in a specified row and writing data
        ws.getRow(3).createCell(3).setCellValue("happy");
        
        FileOutputStream fos=new FileOutputStream ("D:\\seleniumpracticefolder\\Book1.xlsx") ;
        wb.write(fos);
        wb.close();
        System.out.println("program executed....");
	}

}
