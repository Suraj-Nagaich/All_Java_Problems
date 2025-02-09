package Impportant;

import java.util.Scanner;

public class Decimal_to_hexadecimal {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int hexadecimal=0;
		int base=1;
		while(n>0)
		{
			int rem=n%16;
			if(rem>=10)
			{
				System.out.print((char)(rem+55));
			}
			else
			{
				System.out.print((char)(rem+48));
			}
			n=n/16;
			hexadecimal=hexadecimal+rem*base;
			base=base*10;
		}
		System.out.println(hexadecimal);
		
		
	}

}
