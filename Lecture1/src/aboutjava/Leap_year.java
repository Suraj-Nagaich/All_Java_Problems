package aboutjava;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int a=sc.nextInt();
		if (a%400==0 || a%4==0 )
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}

}
