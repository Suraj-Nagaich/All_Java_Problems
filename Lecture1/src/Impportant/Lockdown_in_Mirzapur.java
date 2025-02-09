package Impportant;
import java.util.*;

public class Lockdown_in_Mirzapur {
		public static long fact(long n ){
			long f = 1;
			while(n>0){
				f = f*n;
				n--;
			}
	        return f;

		}

	    public static void main (String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			while(n-->0)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				long res=fact(a)/(fact(a-b)*fact(b));
			
			System.out.println(res);
			


	    }
	}
	}
