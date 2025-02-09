package aboutjava;
import java.util.*;
public class Hashmap {
	public static void main(String[]args)
	{
		HashMap<Integer,Integer>map=new HashMap<>();
//		int arr[]= {1,2,3,4,5,1,2,1};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			{
			arr[i]=sc.nextInt();
			}
			for(int i=0;i<arr.length;i++)
			
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i], 1);
			}
			else
			{
				int prevfreq=map.get(arr[i]);
				map.put(arr[i], prevfreq+1);
			}
		}
		System.out.println(map);
	}

}
