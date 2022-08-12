package Jlearn;

public class Calculation {
	
	public int Sum(int a, int b)
	{
		int c = a + b;
		System.out.println("Sum is:"+c);
		return c;
	}
	
	public int Sub(int a1, int b1)
	{
		int d = a1 - b1;
		System.out.println("Sub is:"+d);
		return d;
	}

	public int Mul(int a2, int b2)
	{
		int e= a2*b2;
		System.out.println("Mul is:"+e);
		return e ;
	}
	public int Div(int a3, int b3)
	{
		int f= a3/ b3;
		System.out.println("Div is:"+f);
		return f ;
	}		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation Cal = new Calculation();
		int S1= Cal.Sum(10, 2);
		int S2 = Cal.Sum(S1, 2);
		System.out.println(S2);
		int S3 = Cal.Sub(S2, 2);
		System.out.println(S3);
		int S4 = Cal.Mul(S3, 2);
		System.out.println(S4);
		int S5 = Cal.Div(S4, 2);
		System.out.println("The Result of ((((10+2)+2)-2)*2)/2)is :"+S5);
		System.out.println("*******************************************************");
		
		int A = Cal.Sub(10, 2);		
		int B = Cal.Sum(A, 2);
		int C = Cal.Sub(B, 2);
		int D = Cal.Mul(C, 2);
		int E = Cal.Div(D, 2);
		System.out.println("The Result of ((((10-2)+2)-2)*2)/2)is :"+E);
		
		System.out.println("End of the Program");
		
		
		
		

	}

}
