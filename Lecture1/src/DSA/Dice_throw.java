package DSA;

public class Dice_throw {
	public static void main(String[]args)
	{
		int ans=sol(0,6,6," ");
	}
	public static int sol(int strt,int dest,int dice,String ans)
	{
		if(dest==strt)
		{
			System.out.println(ans);
			return 1;
		}
		if(dest<strt)
		return 0;
		int tc=0;
		for(int jump=1;jump<=dice;jump++)
		{
			tc+=sol(strt+jump,dest,dice,ans+jump+" ");
		}
		return tc;
	}

}
