package season3javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\eclipseworkspacefortesting\\hybridframework\\src\\test\\resources\\properties\\demo.properties");
		Properties pr=new Properties();
		pr.load(fis);
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("url"));
		
		

	}

}
