package Loops;

public class Pattern_12 {
public static void main(String[]args)
{
	int nst=1;
	int nsp1=4;
	int nsp2=1;
	int n=5;
	for(int row=0;row<n;row++)
	{
		for(int csp=0;csp<nsp1;csp++)
		{
			System.out.print("");
		}
		for(int cst=0;cst<nst;cst++)
		{
			System.out.print("*");
		for(int csp=0;csp<nsp2;csp++)
		{
			System.out.print("!");
		}
		}
		System.out.println();
		nsp1--;
		nst++;
		
	}
}
}
