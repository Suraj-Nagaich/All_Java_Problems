package DSA;

public class Fibonnacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fibo(3 ));
	}

	private static int fibo(int i) {
		// TODO Auto-generated method stub
		if(i==0 || i==1) {
			return i;
		}
		int ch=fibo(i-1);
		int sh=fibo(i-2);
		int res=ch+sh;
        return res;
		
	}

}
