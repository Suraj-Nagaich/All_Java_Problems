package Exceptionhandling;

public class First {
	public static void main(String args[])
	{
		System.out.println("suraj");
		sol(10);
	}
	public static void sol(int val)
	{
		fun(20);
	}
	public static void fun(int val)
	{
		int temp;
		try
		{
			temp = val/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
	