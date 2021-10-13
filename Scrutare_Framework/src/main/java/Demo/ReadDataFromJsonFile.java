package Demo;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadDataFromJsonFile {

	/**This method will return json value based on json key
@param jsonKey
@return jsonValue
@throws Throwable
*/
	
//public void getDataFromJson() throws Throwable {
//FileReader reader=new FileReader ("./data/CommonData.json") ;
//JSONParser parser=new JSONParser();
//Object object = parser.parse(reader);
//JSONObject jsonObject = (JSONObject)object;
// String url=jsonObject.get("url").toString();
// String browser=jsonObject.get("browser").toString();
// String username=jsonObject.get("username").toString();
// String password=jsonObject.get("password").toString();
//System.out.println(url);
//System.out.println(browser);
//System.out.println(username);
//System.out.println(password);
//}
	
	@Test
	public void getDataFromJson() throws Throwable {
		//read the data from json file
		FileReader file=new FileReader ("./data/CommonData.json") ;
		
		//convert the json object into java project
		JSONParser jsonobj=new JSONParser();
		Object jobj = jsonobj.parse(file);
		
		//typecast java object to hashmap
         HashMap map=(HashMap)jobj;
		String url=map.get("url").toString();
		 String browser=map.get("browser").toString();
		 String username=map.get("username").toString();
		 String password=map.get("password").toString();
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		}
}