package Basics;
import java.util.*;

public class Array_maxsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter the value of k");
		int k=sc.nextInt();
		int sum=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-k;i++)
		{
			for(int j=1;j<=k;j++)
			{
				
				sum+=arr[j+i];
			}
			
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
