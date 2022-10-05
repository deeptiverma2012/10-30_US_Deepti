package Jlearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public  class TextFileRead {

	public void ReadDataFromParticularLine(int lineNo) throws IOException
	{
		File f = new File("../DeeptiUSA/TextRead.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		int count =0;
		
		while((s=b.readLine())!=null)
		{   count++;
			if(count==lineNo)
			{
				System.out.println(s);
				
			}
		}
				
	}
	
	public void ReadDataFromRange(int startline, int endline) throws IOException
	{
		File f = new File("../DeeptiUSA/TextRead.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String a;
		int count=0;
		for(int i=1; i<=10;i++)
		{
			if((a = br.readLine())!=null )
			{
				count++;
				if(count>=startline && count<=endline)
				{
					  System.out.println(a);
				}
	        
			}
		}		
	}
	
	public void writeData(int maxRow) throws IOException
	{
		File f = new File("../DeeptiUSA/TextRead.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Data:");
		
		
		
		int count=0;
	
		for(int i=1;i<=maxRow; i++)
		{
				String data = scan.nextLine();
				bw.write(data);			
				bw.newLine();
				
		}	
		bw.close();				
	}
	public void copyFile() throws IOException
	{
		File f = new File("../DeeptiUSA/TextRead.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);		
		String s;

		File f1= new File("../DeeptiUSA/Test1.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while((s=br.readLine())!=null)
		{
		    bw.write(s);
		   	bw.newLine();
		}
			br.close();
			bw.close();
					
		}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		TextFileRead obj = new TextFileRead();
		//obj.ReadDataFromParticularLine(1);
		
		//obj.ReadDataFromRange(2,4);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter max row number:");
		int rowNum = scan.nextInt();
		
		
		obj.writeData(rowNum);
		obj.copyFile();
		
		
						
	}

}
