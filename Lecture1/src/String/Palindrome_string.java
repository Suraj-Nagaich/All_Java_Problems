package String;
import java.util.*;

public class Palindrome_string {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		int start=0;
		int end=str.length()-1;
		while(start<end) {
		if(str.charAt(start)!=str.charAt(end))
				{
					System.out.println(" not palindrome");
					return;
				}
		start++;
		end--;
		}
		System.out.println("palindrome");
		
		// TODO Auto-generated method stub

	}

}


