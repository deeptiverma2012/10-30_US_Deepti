package Jlearn;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter No. 1:");
		int a = scan.nextInt();
		System.out.println("Please enter No. 2:");
		int b = scan.nextInt();
		
		System.out.println("Please enter operation:");
		int op = scan.nextInt();
		int c;
		
		
		switch(op)
		{
			case 1: 
				c=a+b;
				System.out.println(c);
				break;
			case 2: 
				c=a-b;
				System.out.println(c);
				break;
			case 3: 
				c= a*b;
				System.out.println(c);
				break;
			case 4: 
				c= a/b;
				System.out.println(c);
				break;
			default:
				break;
		}
				
				
				
				
			
		}
		
		

	}


