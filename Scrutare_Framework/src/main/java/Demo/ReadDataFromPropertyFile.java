package Demo;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
@Test
public void readDataFromPropertyFile() throws Throwable {
	/*read the data properties file */
	//step 1:get the java representation object of the physical file
	FileInputStream fis=new FileInputStream("./data/CommomData.properties");
	//step 2:create an object of the properties class & load the all keys:value pair
	Properties pobj=new Properties();
	pobj.load(fis);
	//step :read the value using getproperty("key")
	String url = pobj.getProperty("url");
	String un = pobj.getProperty("username");
	String pw = pobj.getProperty("password");
	String browser = pobj.getProperty("browser");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pw);
	System.out.println(browser);
	
}
}
