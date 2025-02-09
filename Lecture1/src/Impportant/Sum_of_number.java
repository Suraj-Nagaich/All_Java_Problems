package Impportant;

import java.util.*;

public class Sum_of_number {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
// 1 2 3 5