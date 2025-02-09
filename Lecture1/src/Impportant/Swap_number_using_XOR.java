package Impportant;

import java.util.Scanner;

public class Swap_number_using_XOR {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println(n1);
		System.out.println(n2);

}
}
