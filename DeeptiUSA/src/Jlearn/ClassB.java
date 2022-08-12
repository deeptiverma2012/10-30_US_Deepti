package Jlearn;

public class ClassB {
	
	public void method1()
	{
		System.out.println("Default Method");
	}

	public void method2(int a)
	{   
		System.out.println("One Parameterized Method");
	}
	public void method3(int a, int b)
	{
	
		System.out.println("Two Parameterized Method");
	}
	public void method4(int a, int b, int c)
	{	
		System.out.println("Three Parameterized Method");
		this.method1();
		this.method5(1, 2, 3,4);
		this.method2(2);
		this.method3(1, 2);
		
	}
	public void method5(int a, int b, int c, int d)
	{
		System.out.println("Four Parameterized Method");
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassB obj = new ClassB();
        obj.method4(1, 2, 3);
        
        
	}

}
