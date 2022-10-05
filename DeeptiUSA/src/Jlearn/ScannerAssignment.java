package Jlearn;

import java.util.Scanner;

public class ScannerAssignment {
	
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum is:"+c);
		return c;
		
	}
	public int sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Sub is:"+c);
		return c;
		
	}
	
	public int mul(int d, int e)
	{
		int f = d*e;
		System.out.println("Multiple is:"+f);
		return f;
	}
	public float div(int d, int e)
	{
		float f = d/e;
		System.out.println("Divisor is:"+f);
		return f;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number:");
		Scanner scan = new Scanner(System.in);
		
		int a1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int a2 = scan.nextInt();
		
		ScannerAssignment obj = new ScannerAssignment();
		int a= obj.sum(a1, a2);
		
		System.out.println("The value of a is:"+a);
		
		System.out.println("Enter Third number:");
		int a3 = scan.nextInt();
		
		int b = obj.sum(a, a3);
		System.out.println("The value of b is:"+b);
		
		System.out.println("Enter fourth number:");
		int a4 = scan.nextInt();
		
		int c = obj.mul(b, a4);
		
		System.out.println("The result of multiplication is:"+c);
		
		System.out.println("Enter fifth number:");
		int a5 = scan.nextInt();
		
		int d= obj.sub(c, a5);
		System.out.println("The result of subtraction is:"+d);
		
		System.out.println("Enter sixth number:");
		int a6 = scan.nextInt();
		
		float result = obj.div(d, a6);
		
		System.out.println("The final result of (((a1+a2)+a3*a4)-a5)/a6) is:"+result);
		
		System.out.println("**********************************************************************************");
		
		System.out.println("Enter first number:");
		int b1 = scan.nextInt();
		
		System.out.println("Enter second number:");
		int b2 = scan.nextInt();
		
		int x = obj.mul(b1, b2);
		
		System.out.println("Multiple is:"+x);
		
		System.out.println("Enter third number:");
		int b3 = scan.nextInt();
		
		int y = obj.sum(x, b3);
		System.out.println("The sum is:"+y);
		
		System.out.println("Enter fourth number:");
		int b4 = scan.nextInt();
		
		int z = obj.sum(y, b4);
		System.out.println("The sum is:"+z);
		
		System.out.println("Enter fifth number:");
		int b5 = scan.nextInt();
		
	    int z1 = obj.sub(z, b5);
	    System.out.println("The subtract is:"+z1);
	    
	    System.out.println("Enter sixth number:");
		int b6 = scan.nextInt();
		
	    float z2 = obj.div(z1, b6);
	    
	    System.out.println("The result of ((((b1*b2)+b3)+b4)-b5)/b6) is:"+z2);
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}
