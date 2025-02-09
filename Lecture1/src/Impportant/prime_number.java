package Impportant;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number");
		int n = sc.nextInt();
		int c = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				c = 1;
				System.out.print(i+" ");
			}
		}
		
//		if (c == 0) {
//			System.out.println("Prime number");
//		} else {
//			System.out.println(" not a Prime number");
//		}
	}
}
