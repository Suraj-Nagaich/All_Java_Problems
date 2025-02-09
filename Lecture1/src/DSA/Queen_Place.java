package DSA;

public class Queen_Place {

	public static void main(String[] args) {
		int arr[][]=new int[1][4];
		sol(arr,0,arr.length-1,0,arr[0].length-1,0,2,new boolean[1][4],"");
		
		// TODO Auto-generated method stub

	}

	private static void sol(int[][] arr, int cr, int er, int cc, int ec, int qp, int tq, boolean[][] visited,String ans) {
		if(tq==qp)
		{
			System.out.println(ans);
			return;
		}
		if(cc>ec)return;
		visited[cr][cc]=true;
		sol(arr,cr,er,cc+1,ec,qp+1,tq,visited,ans+"{ "+cr+" "+cc+" "+"}");
		visited[cr][cc]=false;
		sol(arr,cr,er,cc+1,ec,qp,tq,visited,ans);
		// TODO Auto-generated method stub
		
	}

}
