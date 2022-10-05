package Jlearn;

import java.util.Scanner;

public class Table {
	
	public void tab(int num)
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println(num*i );
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int x= scan.nextInt();
		Table obj = new Table();
		obj.tab(x);
		

	}

}
