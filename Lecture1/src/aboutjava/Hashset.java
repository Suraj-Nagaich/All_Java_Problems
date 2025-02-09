package aboutjava;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		HashSet<Integer>set=new HashSet();
		for(int i=0;i<size;i++)
		{
			set.add(arr[i]);
		}
		
		
			System.out.print(set+" ");
			System.out.println(set.contains(65));
			// TODO Auto-generated method stub

	}

}
