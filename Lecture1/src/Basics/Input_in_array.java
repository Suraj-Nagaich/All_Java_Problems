package Basics;
import java.util.*;

public class Input_in_array extends Object {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("enter values in aray");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("output of array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}
}
