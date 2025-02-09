package String;

public class String_basic {
	public static void main(String[]args)
	{
		String str="hello";
		String str1=new String("hello");
		String str2="hello";
		System.out.println(str.length());
		System.out.println(str.indexOf("l"));
		System.out.println(str.indexOf("h"));
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.substring(1,5));
		System.out.println(str.substring(1));
		System.out.println(str.charAt(0));
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str.equals(str1));
		
	}

}
