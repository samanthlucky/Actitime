package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.actitime.generic.FileLib;

public class DemoGenericLibraray {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileLib f = new FileLib();
System.out.println( f.getpropertyData("username"));	
System.out.println(f.getExceldata("createcoustmer", 1, 3));
f.setExcelData("createcoustmer", 1, 5, "pass(or)fail");
}
} 
