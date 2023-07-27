package Demohandlingproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingProperty {
public static void main(String[] args) throws IOException {
	//get the java represntation object of the physical file 
	  FileInputStream fis = new FileInputStream("./data/commondata.property");
	//create an object of property class
	  Properties p = new Properties();
	  //load this file
	  p.load(fis);
	  //get the data (value) by using key
	   String url = p.getProperty("url");
	     String un = p.getProperty("username");
	     String pw= p.getProperty("pwd");
	     
	     
	     System.out.println(url);
	     System.out.println(un);
	     System.out.println(pw);
	     
}
}
