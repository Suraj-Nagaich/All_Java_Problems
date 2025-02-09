package aboutjava;
import java.util.*;

public class Ifelse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int rem = a % 2;
		if (rem == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

}
