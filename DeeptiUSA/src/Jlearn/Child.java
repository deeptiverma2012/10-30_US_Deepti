package Jlearn;

public class Child extends Parent {
	
	public Child()
	{
		
		this(1,2);
		System.out.println("Child default Constructor");
	}
	public Child(int a)
	{
		this();
		System.out.println("Child One Parameterized Constructor");
	}
	  public Child(int a, int b)
	
	{
		super(1,2);
		System.out.println("Child two Parameterized Constructor");
	}
	public Child(int a, int b, int c)
	{
		this(1);
		System.out.println("Child three Parameterized Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
       Child obj = new Child(1,2,3);
       
       
       
	}

}
