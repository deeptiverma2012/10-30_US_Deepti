package Jlearn;

import java.util.Scanner;

public class Prime_Number {
	
	public void PrimeCheck(int num)
	{
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num % i==0)
				{
					count++;
				}
			}
				if(count==2)
				{
					System.out.println("It's a Prime number");
				}
			
				else
				{
					System.out.println("Not a Prime Number");
				}
			}
		}
	
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int b = scan.nextInt();
		
		Prime_Number obj = new Prime_Number();
		obj.PrimeCheck(b);
		
	
		

	}

}
