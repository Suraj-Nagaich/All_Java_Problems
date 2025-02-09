package Ethics;

import java.util.Scanner;

public class Prime_no {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		if (n == 2) {
			System.out.println("prime number");
		} else if (n % 2 == 0) {
			System.out.println("not prime number");
		} else {
			System.out.println("prime number");
		}

	}

}
