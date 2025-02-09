package Loops;

public class Pattern_7 {
	public static void main(String[]args)
	{
		int n=5;
		int nst=1;
		int nsp=4;
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
			nst+=2;
			nsp--;
			System.out.println();
		}
		
	}

}
