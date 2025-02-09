package DSA;

public class Subset {

	public static void main(String[] args) {
		String str="abcd";
		sol(str," ");
		// TODO Auto-generated method stub

	}
public static void sol(String str,String ans)
{
	if(str.length()==0)
	{
		System.out.println(ans);
		return;
	}
	char ch=str.charAt(0);
	sol(str.substring(1),ans+ch);
	sol(str.substring(1),ans);
}

}
