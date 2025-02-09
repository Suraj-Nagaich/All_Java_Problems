package Impportant;

import java.util.Scanner;

public class GCD {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		System.out.println("enter 2 number");
		int b=sc.nextInt();
		int g=0;;
		for(int i=1;i<=a;i++)
			{
			if(a%i==0 && b%i==0)
				g=i;
			}
			System.out.println("GCD is" +g);
			}
			}
