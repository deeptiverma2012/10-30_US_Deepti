package Jlearn;

import java.util.Scanner;

public class Students_Marking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter marks:");
		
		int marks = scan.nextInt();
		
		if((marks>=0)&&(marks<=35))
		{
			System.out.println("Grade C");
		}
		else if((marks>=35)&&(marks<=50))
		{
			System.out.println("Grade B");
		}
		else if((marks>=50)&&(marks<=75))
		{
			System.out.println("Grade A");
		}
		else if((marks>=75)&&(marks<=100))
		{
			System.out.println("Grade A+");
		}
		else
		{
			System.out.println("Invalid marks");
		}
		

	}

}
