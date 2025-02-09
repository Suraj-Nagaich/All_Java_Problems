package aboutjava;

import java.util.*;

public class Distinct_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
		}
		HashSet<String>set=new HashSet<>();
		for(String k:arr) {
		set.add(k);
	}
		// TODO Auto-generated method stub
		System.out.print(set);
	
	}
}


