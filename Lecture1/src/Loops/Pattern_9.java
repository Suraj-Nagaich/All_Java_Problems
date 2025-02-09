package Loops;

public class Pattern_9 {
	public static void main(String[]args)
	{
		 int nsp1=4;
		 int nsp2=3;
		 int nst=1;
		 int n=5;
		 for(int row=0;row<5;row++)
		 {
			 for(int csp=0;csp<nsp1;csp++)
			 {
				 System.out.print("  ");
			 }
			 for(int cst=0;cst<nst;cst++)
			 {
				 System.out.print("*");
			 
			 for(int csp=0;csp<nsp2;csp++)
			 {
				 System.out.print(" ");
			 }
			 }
			 System.out.println();
		 
		 nsp1--;
		 nst++;
		 
	}

}
}