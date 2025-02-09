package DSA;

public class Lexicographical_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(0, 50);

	}

	public static void sol(int ans, int n) {
		if(ans>50) {
			return;	
		}
		System.out.print(ans+" ");
		int i=0;
		if (ans == 0) {
			 i = 1;
		}
		for (; i <= 9; i++) {
			sol(ans*10+i, n);
			
		}
		

	}

}
