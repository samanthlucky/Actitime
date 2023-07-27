package Demohandlingproperty;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./data/Testscript.Excel.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    String data = wb.getSheet("createcoustmer").getRow(1).getCell(3).toString();
    System.out.println(data);
}
}
