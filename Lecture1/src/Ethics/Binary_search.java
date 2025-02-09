package Ethics;
import java.util.*;

public class Binary_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter the value of key");
		int key=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int str=0;
		int end=arr.length-1;
		for(int i=0;i<n;i++) {
		while(str<=end)
		{
			int mid=str+((end-str)/2);
			if(arr[mid]==key)
			{
				System.out.println(mid);
				return;
			}
			else if(key>arr[mid])
			{
				str=mid+1;

			}
			else
			{
				end=mid-1;
				
			}
			
		}
		}
		
	}

}
