package Loops;

import java.util.Scanner;

public class Decimal_to_binary {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number in decimal format");
		int n=sc.nextInt();
		int binary=0;
		int base=1;
		while(n!=0)
		{
			int rem=n%2;
			n=n/2;
			binary=binary+rem*base;
			base=base*10;
		}
		System.out.println(binary);
	}

}
