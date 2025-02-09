
class Solution {
    public String addBinary(String a, String b) {
    return sol(a,b);    
        
    }
    public String sol(String s1,String s2)
    {
        int val1=Integer.parseInt(s1);
        int val2=Integer.parseInt(s2);
        int r1=convert(val1);
        int r2=convert(val2);
        int sum=r1+r2;
        return Integer.toBinaryString(sum);
    }
    public int convert(int val)
    {
       
    	//binary to decimal
    	int ans=0;
        int multi=1;
        while(val>0)
        {
            int rem=val%10;
            ans=ans+(rem*multi);
            val=val/10;
            multi=multi*2;
        }
        return ans;
    }
}