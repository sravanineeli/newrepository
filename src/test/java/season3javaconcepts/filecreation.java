package season3javaconcepts;

import java.io.File;
import java.io.IOException;

public class filecreation {

	public static void main(String[] args) throws IOException {
	       File f=new File("D:\\seleniumpracticefolder\\abc.txt");
	       f.createNewFile();
	       System.out.println("file created successfully....");

	}

}
