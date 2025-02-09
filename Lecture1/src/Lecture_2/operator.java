package Lecture_2;
import java.util.*;

public class operator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age ");
		int a=sc.nextInt();
		System.out.println("enter code ");
		int b=sc.nextInt();
		if (a>=18)
		{
			if(a%2==1)
		{
			if (b==0)
		{
			System.out.println("elligible for vote");
		}
		}
		}
		else
		{
			System.out.println("not elligible");
		}
	}

}
