package Basics;

import java.util.Scanner;

public class String_differentline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		

	}

}
