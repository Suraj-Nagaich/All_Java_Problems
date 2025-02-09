package Impportant;

import java.util.Scanner;

public class Sum_at_last_digit {
	public static void main (String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		while(n>=10)
		{ int sum=0;
			while(n>0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;;
		}
			n=sum;
			System.out.println(sum);
		}
	}

}
