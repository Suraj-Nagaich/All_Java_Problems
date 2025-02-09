package Lecture_2;
import java.util.*;
public class sum {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
				int a=sc.nextInt();
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			a=a/10;
			sum+=rem;
		}
	
		System.out.println(sum);
	}
	
	

}
