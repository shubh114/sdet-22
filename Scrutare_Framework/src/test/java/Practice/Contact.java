package Practice;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class Contact {
@Test
public void org(XmlTest xml) {
	System.out.println("excute1");
	String url = xml.getParameter("url");
	String admin = xml.getParameter("username");
    System.out.println(url);
    System.out.println(admin);
}
}