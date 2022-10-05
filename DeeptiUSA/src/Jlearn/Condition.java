package Jlearn;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int a = scan.nextInt();
		
		if(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("Odd number");
			}
		}
		else
		{
			System.out.println("Please enter a valid/positive number");
		}
	}

}
