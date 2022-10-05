package Jlearn;

import java.util.Scanner;

public class ArmstrongNo {
	
	public static void isArmstrong(int num)
	{
		int r;
		int cube=0;
		int temp;
		
		temp =num;
		
		while(num>0)
		{
			r=num%10;// To get the reminder with 10
			num=num/10;//To get the next number
			cube=cube+(r*r*r);
		}
		
		if(cube==temp)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an armstrong number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int a =scan.nextInt();
		ArmstrongNo.isArmstrong(a);
		

	}

}
