package Impportant;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,2,1,0};
		for(int i=0;i<arr.length-1;i++)
		{
			int midx=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[midx]>arr[j])
				{
					midx=j;
				}
			}
			int temp=arr[midx];
			arr[midx]=arr[i];
			arr[i]=temp;
			
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");

	}
	}

}
