package ExcelHandling;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Jxl_ReadAssignments {
	
	public void ReadDataBasedUponRowNoAndColNo(int RowNo, int ColNo) throws BiffException, IOException
	{
		File f = new File("../DeeptiUSA/Sampleexcel.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int r = s.getRows();
		int c= s.getColumns();
		
		for(int i=0; i<=RowNo;i++)
		{
			for(int j=0;j<=ColNo; j++)
			{
				Cell cs = s.getCell(j, i);
				System.out.println(cs.getContents());
				
			}
		}
		
		wb.close();
	}
	
	public void ReadDataBasedUponRowNo(int RowCount) throws BiffException, IOException
	{
		File f = new File("../DeeptiUSA/Sampleexcel.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int r = s.getRows();
		int c= s.getColumns();
	    //int count=0;
		
		for(int i=0; i<r;i++)
		{
			for(int j=0;j<c; j++)
			{	if(i==RowCount)
			    {
				       Cell cs = s.getCell(j, i);				
				      System.out.println(cs.getContents());
				}
				
			}
		}
		
		wb.close();
	}
	public void ReadDataBasedUponRange(int initialRow, int endRow) throws BiffException, IOException
	{
		File f = new File("../DeeptiUSA/Sampleexcel.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int r = s.getRows();
		int c= s.getColumns();
	   
		
		for(int i=initialRow; i<=endRow;i++)
		{
			for(int j=0;j<c; j++)
			{	
			     Cell cs = s.getCell(j, i);				
				 System.out.println(cs.getContents());
				}			
			}		
		wb.close();
	}	

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
				
		Jxl_ReadAssignments obj = new Jxl_ReadAssignments();
		//obj.ReadDataBasedUponRowNoAndColNo(1,1 );		
		//obj.ReadDataBasedUponRowNo(2);
		obj.ReadDataBasedUponRange(2, 4);

	}

}
