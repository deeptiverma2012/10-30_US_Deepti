package Jlearn;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
         int a =scan.nextInt();
         
         if(a%2==0)
         {
        	 System.out.println("It's an even number");
         }
         else
         {
        	 System.out.println("It's an odd number");
         }
	}

}
