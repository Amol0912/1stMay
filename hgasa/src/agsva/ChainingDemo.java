package agsva;

public class ChainingDemo {
	
	
	public ChainingDemo()
	{
		System.out.println("default constructor");
	}

	
	
	public ChainingDemo(String str)
	{
		this();
		System.out.println("constructor with single parameter");
	}
	
	
	public ChainingDemo(String str, int a)
	
	{
		this("Hi");
		
		System.out.println("constructor with double parameter");
	}
	
	public ChainingDemo(int a, int b,int c)
	{
		this("hello", 1);
		System.out.println("constructor with three parameter");
	}
	
	public void m1(){
		
		System.out.println(1+2);
	}
	
	public static void main(String[] args) {
		
		ChainingDemo obj = new ChainingDemo(1,2,3);
		obj.m1();
	}
}
