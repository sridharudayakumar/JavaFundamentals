package day5;

public class MethodsDemo {

	public static void main(String[] args) {
		//Object Creation
		MethodsDemo greeting = new MethodsDemo();
		
		//Access method without parameter
		greeting.sayHello();
		
		//Access method with parameter
		greeting.sayHi("Jaswant");

	}
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	public void sayHi(String name)
	{
		System.out.println("Hi "+name);
	}

}
