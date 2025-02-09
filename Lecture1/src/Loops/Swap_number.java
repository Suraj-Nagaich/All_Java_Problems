package Loops;

import java.util.Scanner;

public class Swap_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 number");
		int a = sc.nextInt();
		System.out.println("enter 2 number");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.print(b);
		System.out.println(a);
	}

}
