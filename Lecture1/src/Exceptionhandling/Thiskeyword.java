package Exceptionhandling;

public class Thiskeyword {
	public Thiskeyword()
	{		this(5);
		System.out.println("default");

	}
	public Thiskeyword(int val)
	
	{		this(10,20);
		System.out.println("default1");

	}
	public Thiskeyword(int a,int b)
	{
	System.out.println("suraj");
	}
	public static void main(String args[])
	{
		Thiskeyword f=new Thiskeyword(1);
	}

}
