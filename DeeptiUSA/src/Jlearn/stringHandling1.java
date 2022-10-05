package Jlearn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class stringHandling1 {
	
	public static void occurenceChecker()
	{
		// Code to count number of occurrence of e in string 
				String s = "My name is Deepti";
				int L = s.length();
				int count =0;
						
				for(int i=0; i<L; i++)
				{
					System.out.println(s.charAt(i));// Code to traverse string character by character
					char value = 'e';
					if(value==s.charAt(i))
					{
					  count++;
					}
				}
				System.out.println("Total count of e is:"+ count);	

				System.out.println("************Assignment count of occurrence of e*********************************************");
	}
	public static void traversingWordWise() {
		// Code to show  a string word wise
		
		  String s = "My name is Deepti";	
		  String S[]= s.split(",");
		  int len = S.length;
		  for(int j=0; j<len; j++)
		  {
			  System.out.println(S[j]);
		  }
		  
	}
	public static void myoccurenceChecker()
	{
		// Code to count number of occurrence of my in string 
				String s = "My name is Deepti. My name is My";
				String S[] = s.split(" ");
				int L = S.length;
				String value ="My";
				int count=0;
				for(int i=0; i<L; i++)
				{
				if(value.contentEquals(S[i]))
				{
					count++;
				}
				}
				System.out.println("The occurrence of My in the String is:"+ count);

				System.out.println("************Assignment count of occurrence of My*********************************************");
	}
	
	public static void reverseString()
	{
		String s= "My name is Deepti";
		
		String[] s1 = s.split(" ") ;
		int L = s1.length;
		
		for(int i=L-1; i>=0; i--)
		{
			System.out.println(s1[i]);
		}
		
	}
	
	public static void reverseEachWord()
	{
       String s= "My name is Deepti"; // Original String
		
		String[] words = s.split(" ") ;// Split into multiple parts
		String reverseString ="";
		
		for(String w: words)
		{
			String reverseWord ="";
			
			for(int i=w.length()-1;i>=0; i-- )
			{
				reverseWord = reverseWord+w.charAt(i);
			}
			reverseString = reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);
		
		
	}
	public static void reversingTheReverseString()
	{
		String s = "My name is Deepti";
		String Str[] = s.split(" ");
		int L = Str.length;
		String revStr ="";
		for(int i=L-1;i>=0; i-- )
		{
			revStr= revStr+" "+Str[i];// storing reverse string in a String variable
			
		}
		System.out.println(revStr);
		
		String[] words= revStr.split(" ");
		int len = words.length;
	
		String str1 ="";
		
		for(String w : words)
		{
			String revWord = "";
			for(int j=w.length()-1; j>=0; j--)
			{
				revWord = revWord+w.charAt(j);				
				
			}
			System.out.println(revWord);
			str1 = str1 +revWord+" ";
			
			}
	     	System.out.println(str1);		
		}
	
	public static void pallindromeString()
	{
		String s = "NITIN";
		int L = s.length();
		String rev ="";
		for(int i=L-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
	System.out.println(rev);
	
	if(rev.equals(s))
	{
		System.out.println("It's  a palindrome String");
	}
	else
	{
		System.out.println("Not a palindrome String");
	}
		
		
	}
	
	
	public static void linesCounter() throws IOException
	{
	  File f = new File("../DeeptiUSA/Test1.txt");
	  FileReader fr = new FileReader(f);
	  BufferedReader b = new BufferedReader(fr);
	  
	  String S;
	  int count =0;
	  while((S= b.readLine())!= null)
	  {
		  count++;// Count will get incremented each time a line is read
		  System.out.println(S);
		  
	  }
	  System.out.println("The number of lines is:"+count);
	}
	
	public static void wordsCounter() throws IOException
	{
		File f = new File("../DeeptiUSA/Test1.txt");
		  FileReader fr = new FileReader(f);
		  BufferedReader b = new BufferedReader(fr);
		  
		  String S;
		  int count=0;
		  while((S= b.readLine())!=null)
		  {
			  String S1[] = S.split(" ");
			  int len = S1.length;
			  count = count+len;
		  }
		  System.out.println("The number of words is:"+count);
		
		  
		  
	} 
		
		 
	
		
		
		
	
		
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		stringHandling1.occurenceChecker();
		stringHandling1.traversingWordWise();
		stringHandling1.myoccurenceChecker();
		stringHandling1.reverseString();
		stringHandling1.reverseEachWord();
		stringHandling1.reversingTheReverseString();
		stringHandling1.pallindromeString();
		stringHandling1.linesCounter();
		stringHandling1.wordsCounter();
		
		
		
	}
}
