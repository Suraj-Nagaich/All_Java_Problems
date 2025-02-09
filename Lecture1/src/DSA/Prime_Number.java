package DSA;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		int count=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count+=1;
				System.out.print(i+" ");
			}
		}

	}

}
