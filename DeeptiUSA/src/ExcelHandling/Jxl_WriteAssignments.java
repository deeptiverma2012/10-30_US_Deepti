package ExcelHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Jxl_WriteAssignments {
	Scanner scan = new Scanner(System.in);
	
	public void writedata(int rowcount, int colcount) throws IOException, RowsExceededException, WriteException
	{
		File f = new File("../DeeptiUSA/Book2.xls");
		WritableWorkbook wb = Workbook.createWorkbook(f);
		WritableSheet ws = wb.createSheet("Deepti", 0);
		System.out.println("Please enter data");				
		for(int i=0; i<rowcount;i++)
		{  			
			for(int j=0;j<colcount;j++)
			{
				String data = scan.next();
				Label L = new Label(j, i, data);
				ws.addCell(L);
			}
		}
		wb.write();
		wb.close();
	}

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		// TODO Auto-generated method stub
		Jxl_WriteAssignments obj = new Jxl_WriteAssignments();
		obj.writedata(3, 3);
		

	}

}
