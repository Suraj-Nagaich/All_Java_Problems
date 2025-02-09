package Impportant;

import java.util.Scanner;

public class Octal_to_decimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int decimal = 0;
		int base = 1;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			decimal = decimal + rem * base;
			base = base * 8;
		}
		System.out.println(decimal);

	}

}
