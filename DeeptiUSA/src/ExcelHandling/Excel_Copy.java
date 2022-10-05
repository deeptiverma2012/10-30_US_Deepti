package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Excel_Copy {

	public static void main(String[] args) throws BiffException, IOException, WriteException {
		// TODO Auto-generated method stub

		File f = new File("../DeeptiUSA/Sampleexcel.xls");
	     Workbook wb =  Workbook.getWorkbook(f);
	     Sheet ws = wb.getSheet(0); 
	     int r =ws.getRows();
	     int c= ws.getColumns();
	     
		 File f1= new File("../DeeptiUSA/Data3.xls");
			WritableWorkbook wk = Workbook.createWorkbook(f1);
			WritableSheet sh = wk.createSheet("Deepti", 0);
				     
			
			for(int i=0; i<r;i++)
			 {
				 for(int j=0;j<c;j++)
				 {
					 Cell wc = ws.getCell(j, i);
					 String S = wc.getContents();
					 Label L = new Label(j, i, S);
					 sh.addCell(L);
				 }
			 }
			 wk.write();
			 wk.close();

		}
	}


