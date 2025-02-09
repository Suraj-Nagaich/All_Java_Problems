package Exceptionhandling;

public class Throw_handling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		sol(10);

	}
	public static void sol(int val) throws Exception
	{
		try
	{
		int temp=val/0;
	}
		catch(Exception e)
		{
			throw new Exception("exception aaye hai");
		}
		finally {
			System.out.println("chalega hi chalega");
		}

}
	
}
