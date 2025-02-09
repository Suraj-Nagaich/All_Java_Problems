package Impportant;

public class Reverse_array {
	public static void main(String[]args)
	
	{
		int arr[]= {1,2,3,4,5};
		int res[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			res[j]=arr[i];
			j++;
		}
		arr=res;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
