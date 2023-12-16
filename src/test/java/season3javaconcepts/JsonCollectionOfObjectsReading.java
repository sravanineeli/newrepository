package season3javaconcepts;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class JsonCollectionOfObjectsReading {

	public static void main(String[] args) throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		JsonParser jparser=new JsonParser();
		Object jfile=jparser.parse(new FileReader("D:\\eclipseworkspacefortesting\\hybridframework\\src\\test\\resources\\json\\collectionofobjects.json"));
		
		JsonArray jsarray=(JsonArray)jfile;
		System.out.println(jsarray.size());
		Iterator<JsonElement> items=jsarray.iterator();
		JsonElement element=null;
		while(items.hasNext()) {
			element=items.next();
			JsonObject jobj=(JsonObject)element;
			System.out.println(jobj.get("name"));
			System.out.println(jobj.get("rollNo"));
			System.out.println(jobj.get("isTester"));
			System.out.println(jobj.get("hobbies"));
			
			
			
		}
	}

}
