package ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiCopyPaste {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

		File sourceFile = new File("../DeeptiUSA/Sample.xlsx");
		FileInputStream fi = new FileInputStream(sourceFile);
		XSSFWorkbook wb = new XSSFWorkbook(); 
		
		
		File destinationFile = new File("../DeeptiUSA/Sample5.xlsx");
		FileOutputStream fo = new FileOutputStream(destinationFile);
		XSSFWorkbook wb1 =new XSSFWorkbook(); 
		XSSFSheet sh1 = wb.createSheet("Deepti");
	    int r = sh1.getPhysicalNumberOfRows() ;
	    
	    for(int i=0; i<r; i++)
	    {
	    	XSSFRow xr = sh1.createRow(i);
	    	int c = xr.getPhysicalNumberOfCells();
	    	
	    	for(int j=0; j<c; j++)
	    	{
	    		XSSFCell cl = xr.createCell(j);
	    		System.out.println(cl.getStringCellValue());
	    	}
	    }wb1.write(fo);
	    fo.flush();
	    fo.close();
	
		
		
	}

}
