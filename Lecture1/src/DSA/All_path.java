package DSA;

public class All_path {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		int res=sol(0,0,arr.length-1,arr[0].length-1);
		System.out.print(res);;
		// TODO Auto-generated method stub

	}
	public static int sol(int cr,int cc,int er,int ec)
	{
		if(cr==er&&cc==ec)    // cr=current row ; er=end row; cc=current column; ec=end column;
		{
			return 1;
		}
		if(cc>ec)
		{
			return 0;
		}
		if(cr>er)
		{
			return 0;
		}
		int h=sol(cr,cc+1,er,ec);
		int v=sol(cr+1,cc,er,ec);
		return h+v;
	}

}
