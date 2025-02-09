package DSA;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="LzLAAUTDFGHJKdfgh@ZzRSYFDH";
		int arr[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			arr[ch]+=1;
			}
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(arr[ch]==1)
					{
					System.out.print(ch);
					return;
					}
			
		}

	}

}
