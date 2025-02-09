package aboutjava;

import java.util.*;
public class Hashmap_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.next();
		HashMap<Character,Integer>map=new HashMap<>();
		for(char c:str.toCharArray())
		{   
			map.put(c,map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);

	}

}
