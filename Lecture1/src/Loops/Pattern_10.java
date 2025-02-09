package Loops;

public class Pattern_10 {
	public static void main(String[] args) {
		int n = 5;
		int nsp = 4;
		int nst = 1;
		for (int row = 0; row < 2 * n - 1; row++) {
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print(" ");
			}
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("*");
			}
			if (row < n - 1) {
				nsp--;
				nst++;
			} else {
				nsp++;
				nst--;
			}
			System.out.println();
		}
	}

}
