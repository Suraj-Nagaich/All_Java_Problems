package Exceptionhandling;

public class Return_valuers {
	class box{
	int age;
	String name;
	int rolln0;
	
}
	

	public static void main(String[] args) {
		Return_valuers s=new Return_valuers();
		box ans=s.sol();
		System.out.println(ans.name);
		System.out.println(ans.rolln0);
		System.out.println(ans.age);
		
		// TODO Auto-generated method stub

	}
	public box sol()
	{
		box b=new box();
		b.age=19;
		b.name="suraj";
		b.rolln0=67;
		return b;
	}

}
