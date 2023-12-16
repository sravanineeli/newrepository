package season3javaconcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonFileReading {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		
		JsonParser jparser=new JsonParser();
		Object jfile=jparser.parse(new FileReader("src\\test\\resources\\json\\demo.json"));
		
		//converting object(jfile) of Object class into jsonObject and storing in jsonObject variable
		JsonObject jsobj=(JsonObject)jfile;
		String fname=jsobj.toString();
		
		
		JsonElement name=jsobj.get("firstname");
		JsonElement age=jsobj.get("age");
		JsonElement phone=jsobj.get("phone");
		
		System.out.println(name);  
		System.out.println(age);
		System.out.println(phone);
	      
		
		//System.out.println(obj.get("firstname"));
		//System.out.println(obj.get("age"));
		//System.out.println("phone");
	}

}
