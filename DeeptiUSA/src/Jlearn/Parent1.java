package Jlearn;

public class Parent1 {
	
	public void m1()
	{
		this.m1(1, 2, 3);
	
		System.out.println("Parent default method");
	}
	public void m1(int a)
	{
		System.out.println("Parent one parameterized method");
	}
	public void m1(int a, int b)
	{
		this.m1();
		this.m1(1);
		System.out.println("Parent two parameterized method");
	}
	public void m1(int a, int b, int c)
	{
		System.out.println("Parent three parameterized method");
	}


}
