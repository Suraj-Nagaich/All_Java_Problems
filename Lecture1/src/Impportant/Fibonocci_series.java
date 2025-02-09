package Impportant;

import java.util.Scanner;

public class Fibonocci_series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		for (int i = 1; i <= n; i++) {
			int n3 = n1 + n2;
			System.out.print(n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
