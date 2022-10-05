package Jlearn;

public class Swift extends Maruti {
	
	int a;
	int b;
	
	public void SwiftDsl()
	{
		System.out.println("Child class Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swift obj = new Swift();
		obj.a = 10;
		obj.b = 20;
		obj.z = 30;
		obj.Model();
		obj.SwiftDsl();

		
	}

}
