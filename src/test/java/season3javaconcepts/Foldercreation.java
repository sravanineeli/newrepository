package season3javaconcepts;

import java.io.File;

public class Foldercreation {

	public static void main(String[] args) {
		File f=new File("D:\\seleniumpracticefolder\\abc");
	    f.mkdir();  //returns boolean if there is no folder with this name it creates one and returns true,if there already a folder with same name it won't create and returns false
	    System.out.println("folder created successfully....");

	}

}
