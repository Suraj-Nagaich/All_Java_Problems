package Loops;

public class Pattern_5 {
	public static void main(String[]args)
	{
	int n=5;
	int nst=5;
	int nsp=0;
	for(int row=0;row<n;row++)
	{
		for(int csp=0;csp<nsp;csp++)
		{
			System.out.print(" ");
		}
		for(int cst=0;cst<nst;cst++)
		{
			System.out.print("*");
		}
		System.out.println();
		nst--;
		nsp+=2;
	}

}
}
