package Loops;

import java.util.*;
import java.io.*;
public class Reverse_1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int rev=0;
		int a=sc.nextInt();	
		while(a>0) {
		int b=a%10;
		rev=rev*10+b;
		a=a/10;
		}
		System.out.println(rev);
	}
	
}
