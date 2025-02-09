package Inheritence;

public class override {
	@Override
	public String toString()
	{
		return "second class ka toString method call hoga";
	}
	class box{
		int age=19;
		String name="suraj";
	}
	box arr[]=new box[5];
	public void sol()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[]args)
	{
		override s=new override();
		s.sol();
		System.out.println(s);
	}

}
