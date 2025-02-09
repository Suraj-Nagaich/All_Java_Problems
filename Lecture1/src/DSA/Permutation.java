package DSA;

public class Permutation {

	public static void main(String[] args) {
		sol("abc","");

	}
	public static void sol(String str,String ans)
	
	{
		if(str.length()==0)
		{
			System.out.println(ans);
		}
		for(int i=0;i<str.length();i++)
		{
			sol(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
		}
	}

}
