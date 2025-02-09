package Basics;

import java.util.*;

public class Linear_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int number[] = new int[size];
		for (int i = 0; i < size; i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("enter number which have to find");
		int x = sc.nextInt();
		for (int i = 0; i < size; i++) {
			if (number[i] == x) {
				System.out.println("True");
			} else {
				System.out.println("false");
				break;
			}
		}
		// TODO Auto-generated method stub

	}

}
