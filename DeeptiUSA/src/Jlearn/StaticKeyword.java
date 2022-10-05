package Jlearn;

public class StaticKeyword {
	
	int age =10; // Memory will be allocated at object level
	
	static int age1 = 10;  //Memory will be allocated at class level
	
	public void M()
	{
		age1= age1+1;
		System.out.println(age1);
	}
	
	public void M1()
	{
		age = age+1;
		System.out.println(age);
		
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword obj = new StaticKeyword();
		obj.M1();
		obj.M();// initial value 10+1 =11
		//StaticKeyword.age1;
		
		StaticKeyword obj1 = new StaticKeyword();  // Every object has it's own memory it means every object will store it's own value i.e, 11
		obj1.M1();	 
		obj.M();// next time value 11+1= 12 because static keyword allocates memory at class level
		

	}

}
