package ExcelHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class csvWrite {
	
	public static void writeCSV(int rowNum, int colNum) throws IOException
	{
		File f = new File("../DeeptiUSA/Test2.csv");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<rowNum; i++ )
		{
			for(int j=0;j<colNum; j++)
			{
				bw.write("My");
				bw.write(",");
			}bw.newLine();
		}bw.close();
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row Number:");
		int rownum = scan.nextInt();
		System.out.println("Enter col Number:");
		int colnum = scan.nextInt();
		
		csvWrite.writeCSV(rownum, colnum);
	}

}
