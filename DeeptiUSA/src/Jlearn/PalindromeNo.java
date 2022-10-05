package Jlearn;

import java.util.Scanner;

public class PalindromeNo {
	public static void isPalindromeNo(int num)
	{
		int r;
		int sum=0;
		int temp;
		
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum =(sum*10)+r;
			num = num/10;
				
		}
		if(temp==sum)
		{
			System.out.println("Palindome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number:");
		int x =scan.nextInt();
		PalindromeNo.isPalindromeNo(x);
		

	}

}
