package Ethics;
import java.util.*;

public class Sliding_window {

	public static void main(String[] args) {
		int  max=0;
		int sum=0;
		int k=2;
		int size=10;
		Scanner sc=new Scanner(System.in);
//		int arr[]=new int[size];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		int arr[]= {10,5,1,88,6,10};
		for(int i=0;i<k;i++)
		{
			sum+=arr[i];
			max=sum;
		}
		for(int i=k;i<arr.length;i++)
		{
			sum+=arr[i];
			sum-=arr[i-k];
			
		}
		max=Math.max(sum, max);
		System.out.println(max);
		
		// TODO Auto-generated method stub

	}

}
