package DSA;

public class Bubble_sort_Optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,1};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
