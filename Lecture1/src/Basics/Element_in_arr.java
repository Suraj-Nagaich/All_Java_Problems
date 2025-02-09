package Basics;
import java.util.*;

public class Element_in_arr {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int search=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==search)
				
			{ System.out.println("true");	
			break;
			}
			else
			{
				System.out.println("false");
				break;
			}
	}
		

}
}

