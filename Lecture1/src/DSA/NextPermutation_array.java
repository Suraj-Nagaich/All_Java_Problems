package DSA;

import java.util.Arrays;

public class NextPermutation_array {

	public static void main(String[] args) {
		int arr[]= {3,4,5,2,1};
		int p=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1])
			{
				p=i;
				break;
			}	
		}
		int k=0;
		for(int i=arr.length-1;i>=0;i-- )
		{
			if(arr[i]>arr[p])
			{
				k=i;
				break;
			}
		}
		if(p==k)
		{
			reverse(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
		else
		{
			int temp=arr[k];
			arr[k]=arr[p];
			arr[p]=temp;
			reverse(arr,p+1,arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void reverse(int[] arr, int start, int end) {
		int st=start;
		int ed=end;
		while(st<end)
		{
			int temp=arr[st];
			arr[st]=arr[ed];
			arr[ed]=temp;
			st++;
			ed--;
		
	}
	

	}

}
