package Jlearn;

public class Child1 extends Parent1 {
	public void c1()
	{
	   super.m1(1, 2);
		System.out.println("Child default method");
	}
	public void c1(int a)
	{   this.c1(1, 2); 
		System.out.println("Child one parameterized method");
	}
	public void c1(int a, int b)
	{
       this.c1(1, 2, 3);	
		System.out.println("Child two parameterized method");
	}
	public void c1(int a, int b, int c)
	{   this.c1();
		System.out.println("Child three parameterized method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 obj = new Child1();
		obj.c1(1);

	}

}
