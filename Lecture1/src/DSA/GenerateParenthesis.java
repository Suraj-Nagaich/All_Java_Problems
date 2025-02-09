package DSA;

public class GenerateParenthesis {

	public static void main(String[] args) {
		int n=2;
		sol(2*n,0,0," ");
		// TODO Auto-generated method stub

	}

	public static void sol(int n, int ob, int cb, String ans) {
		if(cb>ob || ob>n/2)
		{
			return;
		}
		if(ob+cb==n)
		{
			System.out.println(ans);
			return;
		}
		sol(n,ob+1,cb,ans+"( ");
		sol(n,ob,cb+1,ans+") ");
		
		
		// TODO Auto-generated method stub
		
	}

}
