package Jlearn;

public class ClassA {
	
	public ClassA()
	{
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}

	public ClassA(int a)
	{   this();
		System.out.println("One Parameterized Constructor");
	}
	public ClassA(int a, int b)
	{
		this(2);
		System.out.println("Two Parameterized Constructor");
	}
	public ClassA(int a, int b, int c)
	{
		this(2,3);
		System.out.println("Three Parameterized Constructor");
	}
	public ClassA(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Constructor");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassA obj = new ClassA(1,2,3);
        
	}

}
