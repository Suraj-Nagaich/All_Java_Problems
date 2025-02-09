package OOPS;

public class First {
	{
		System.out.println("instance block main huu");
		sol();
	}
	static
	{
		System.out.println("Static block main huu");
		sol();
	}

	public static void main(String args[]) {
		System.out.println("inside main");
	}

	public static void sol() {
		System.out.println("inside sol");
	}

	public static void sol2() {
		System.out.println("inside sol2");
	}

	public void sol3() {
		System.out.println("inside sol3");
	}

}
