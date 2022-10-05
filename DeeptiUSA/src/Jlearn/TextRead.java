package Jlearn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextRead {
	
	public static void ReadFile() throws IOException
	{
		File f= new File("../DeeptiUSA/TextRead.txt");
		FileReader fr = new FileReader(f);
		
		int a;
		while((a = fr.read())!=-1)
		{
			System.out.println((char)a);
			
		}
	}
	
	public static void ReadLineByLine() throws IOException
	{
		File f= new File("../DeeptiUSA/TextRead.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
	    String S; 
		while((S =br.readLine())!=null)
				{
			      System.out.println(S);
				}
	}
	
	public static void WriteInFile() throws IOException
	{
		File f= new File("../DeeptiUSA/TextRead.txt");
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f);// File writer will write only in a single line. 
		//fw.write("I am writing in text file");
		//fw.close();
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Content for line no. 1");
		bw.newLine();
		bw.write("Line No. 3");
		bw.close();
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//TextRead.ReadFile();
		
		TextRead.WriteInFile();
		TextRead.ReadLineByLine();

	}

}
