package aboutjava;

import java.util.Scanner;

public class Sort_color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int f=0;
			int s=arr.length-1;
			while(f<s)
			{
			if(arr[f]==0)
			{
				f++;
			}
			else if(arr[s]==1)
			{
				s--;
			}
			else
			{
				f=0;
				s=1;
			}
			
			
		}

	}

}
