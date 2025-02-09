package Impportant;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int row=0;
		int start=1;
		while(row<n)
		{
		int i=0;
		int val=1;
		while(i<start)
		{
			System.out.print(val+" ");
			val=(val*(row-i))/(i+1);
			i++;
		}
		System.out.println();
		start++;
		row++;
		}
		// TODO Auto-generated method stub

	}

}
