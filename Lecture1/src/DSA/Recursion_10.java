package DSA;

public class Recursion_10 {

	public static void main(String[] args) {
		sol(20);

		// TODO Auto-generated method stub

	}

	public static void sol(int i) {
		if (i <= 0)
			return;
		sol(i - 1);
		System.out.println(i);

		// TODO Auto-generated method stub

	}

}
