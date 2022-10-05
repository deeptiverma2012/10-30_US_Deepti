package ExcelHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvRead {
	
	public static void readCSV() throws IOException
	{
		File f = new File("..//DeeptiUSA/Test.csv");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		while((s = b.readLine())!= null)
		{
			//System.out.println(s);// It will show result like My, name, is, Deepti, I, am, looking, for, a, solution. below is the soln.
			String S1[]=  s.split(",");
			int L = S1.length;
			System.out.println(L);
			
			
			for(int i=0; i<L; i++)
			{
				System.out.println(S1[i]);
				
			}
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		csvRead obj = new csvRead();
		
		csvRead.readCSV();
		
	}

}
