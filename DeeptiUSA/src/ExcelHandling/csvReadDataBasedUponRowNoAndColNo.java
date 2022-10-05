package ExcelHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class csvReadDataBasedUponRowNoAndColNo {
	
	public static void readCSVByRownCol() throws IOException 
	{
		File f = new File("..//DeeptiUSA/Test.csv");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);	
	
		String s;
		while((s= b.readLine())!=null)
		{
		  String s1[]= s.split(",");
		  
		  int L = s1.length;
		  
		   for(int i=0; i<L; i++)		  
		   {
		      System.out.println(s1[i]);
		     
		      		      
		}		
		   
		   
	}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		csvReadDataBasedUponRowNoAndColNo.readCSVByRownCol();
	}

}
