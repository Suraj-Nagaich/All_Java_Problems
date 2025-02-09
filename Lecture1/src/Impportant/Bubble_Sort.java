package Impportant;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();// TODO Auto-generated method stub
		}
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			boolean flag=false;
			for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
			
		}
			if(!flag)break;

	}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

}
}
