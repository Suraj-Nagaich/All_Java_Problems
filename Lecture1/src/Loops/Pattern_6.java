package Loops;

public class Pattern_6 {
	public static void main(String[]args)
	{
		int nst=5;
		int n=5;
		int nsp=n-2;
		for(int row=0;row<n;row++)
		{
			if(row==0||row==n-1)
			{
				for(int cst=0;cst<nst;cst++)
				{
					System.out.print("*");
				}
			}
				else
				{
					System.out.print("*");
					for(int csp=0;csp<nsp;csp++)
					{
						System.out.print(" ");
					}
					System.out.print("*");
				}
			System.out.println();
			}
		}
	}

