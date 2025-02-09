package Impportant;

import java.util.*;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number");
		int n = sc.nextInt();
		int c = 0;
		while (n > 0) {
			c++;
			n = n / 10;
		}
		System.out.println(c);

	}
}
