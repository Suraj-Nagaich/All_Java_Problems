package String;

import java.util.Scanner;

public class Anagram_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(int i=0;i<str1.length();i++)
		{
			++arr1[str1.charAt(i)-'a'];
		}
		for(int i=0;i<str2.length();i++)
		{
			++arr2[str2.charAt(i)-'a'];
		}
		for(int i=0;i<arr1.length;i++);
		{
			int i=0;
			++arr1[str2.charAt(i)-'a'];
		}
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("false");
					break;
				}
				else
				{
					System.out.println("true");
					break;
				}
			}
		}
	}

}
