package String;
import java.util.*;

public class Rain_water_trapping {
	    public static void main(String[]args) {
	    	Scanner sc=new Scanner(System.in);
	    	        int ans=0;
	    	        int size=sc.nextInt();
	    	        int height[]=new int[size];
	    	        for(int i=0;i<height.length;i++)
	    	        {
	    	            int rmax=height[i];
	    	            int lmax=height[i];
	    	            for(int j=i+1;j<height.length;j++)
	    	            {
	    	                rmax=Math.max(rmax,height[j]);
	    	            }
	    	            for(int j=i-1;j>=0;j--)
	    	            {
	    	                lmax=Math.max(lmax,height[j]);
	    	            }
	    	            int val=Math.min(lmax,rmax);
	    	            ans+=val-height[i];
	    	        }
	    	        System.out.println(ans);
	    	    }
	    	}