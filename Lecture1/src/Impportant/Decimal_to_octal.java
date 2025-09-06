package Impportant;

import java.util.Scanner;

public class Decimal_to_octal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int octal=0;
		int base=1;
		while(n>0)
		{
			int rem=n%8;
			n=n/8;
			octal=octal+rem*base;
			base=base*10;
		}
		System.out.println(octal);
		// TODO Auto-generated method stub

	}

}

