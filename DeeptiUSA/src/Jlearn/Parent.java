package Jlearn;

public class Parent {
	
	int a;
	public Parent()
	{
		this(1,2,3);
		System.out.println("Parent default Constructor");
	}
	public Parent(int a)
	{
		this();
		System.out.println("Parent One Parameterized Constructor");
	}
	public Parent(int a, int b)
	{
		this(1);
		System.out.println("Parent two Parameterized Constructor");
	}
	public Parent(int a, int b, int c)
	{   
		System.out.println("Parent three Parameterized Constructor");
	}
	

}


