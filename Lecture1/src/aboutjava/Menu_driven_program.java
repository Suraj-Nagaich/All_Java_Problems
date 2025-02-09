package aboutjava;

import java.util.*;

public class Menu_driven_program {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your input from to 1 to 4");
		int a = sc.nextInt();
		if (a == 1) {
			System.out.println("enter two numbets for aaaition");
			System.out.println("enter first number");
			int b = sc.nextInt();
			System.out.println("enter 2na number");
			int c = sc.nextInt();
			System.out.println("your result is" + b + c);
		} else if (a == 2)

		{
			System.out.println("enter two numbets for subtraction");
			System.out.println("enter first number");
			int b = sc.nextInt();
			System.out.println("enter 2na number");
			int c = sc.nextInt();
			System.out.println(b - c);

		} else if (a == 3) {
			System.out.println("enter two numbets for multiplication");
			System.out.println("enter first number");
			int b = sc.nextInt();
			System.out.println("enter 2na number");
			int c = sc.nextInt();
			System.out.println(b * c);

		} else if (a == 4) {
			System.out.println("enter two numbets for aivision");
			System.out.println("enter first number");
			int b = sc.nextInt();
			System.out.println("enter 2na number");
			int c = sc.nextInt();
			System.out.println(b / c);

		} else {
			System.out.println("invalia number that you have entered ");
		}

	}

}
