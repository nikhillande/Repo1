package jsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P37 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));//create static
		
		wb.getSheet("Actitime").createRow(10).createCell(0).setCellValue("PHONE");
		wb.getSheet("Actitime").getRow(10).createCell(1).setCellValue("MOBILE");
		FileOutputStream f1 = new FileOutputStream(path);
		wb.write(f1);
		System.out.println("The End");
		

	}

}
