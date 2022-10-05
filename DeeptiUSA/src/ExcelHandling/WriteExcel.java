package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteExcel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
		File f = new File("../DeeptiUSA/Data.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		 WritableSheet ws=   wb.createSheet("Deepti", 0);	 
	
		 
		 for(int i=0; i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 Label L = new Label(j, i, "Deepti");
				 ws.addCell(L);
			 }
		 }
		 wb.write();
		 wb.close();

	}

}
