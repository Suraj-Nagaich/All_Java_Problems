package Basics;

import java.util.Scanner;

public class Ramu_codathon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tcs=sc.nextInt();
		while(tcs-->0)
		{
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			int c3=sc.nextInt();
			int c4=sc.nextInt();
			int  m=sc.nextInt();
			int n=sc.nextInt();
			int rick[]=new int[n];
			int cab[]=new int[m];
			for(int i=0;i<rick.length;i++)
			{
				rick[i]=sc.nextInt();
			}
			for(int i=0;i<cab.length;i++)
			{
				cab[i]=sc.nextInt();
			}
			int ans=0;
			int rk=0;
			int ca=0;
			 for(int i=0;i<rick.length;i++)
			{
				int val=rick[i]*c1;
				rk +=Math.min(val, c2);
			}
			rk=Math.min(rk,c3);
		
		for(int i=0;i<cab.length;i++)
		{
			int val=cab[i]*c1;
			ca+=Math.min(val, c2);
		}
		ca=Math.min(ca,c3);
		ans=rk+ca;
		System.out.println(Math.min(ans, c4));
		
		// TODO Auto-generated method stub

	}

}
	}
