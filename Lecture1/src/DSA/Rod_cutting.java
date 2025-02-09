package DSA;

public class Rod_cutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,8,9,10,17,17,20};
		int ans=sol(8,0,arr);
		System.out.print(ans);

	}
	public static int sol(int len,int profit,int arr[])
	{
		if(len==0)
		{
			return profit;
		}
		int ans=0;
		for(int cut=1;cut<=len;cut++)
		{
			int res=sol(len-cut,profit+arr[cut-1],arr);
			ans=Math.max(ans,res);
			
		}
		return ans;
	}

}
