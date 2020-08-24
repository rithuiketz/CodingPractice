package arrays;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

public class SubArraySum {

	@Test
	public void test() {
		
		
		int[] arr=  {1, 2 ,3 ,7 ,5};
		int reqSum =12;
		printIndexes(arr, reqSum);
	}
	
	public static void printIndexes(int[] arr,int req)
	 {
	     int sp = 0;
	     int mp = 1;
	     BigInteger reqSum  = BigInteger.valueOf(req);
	     BigInteger sum = findSubArraySum(arr,sp,mp);
	     while(true)
	     {
	    	 
	    	 if(mp >= arr.length)
	    	 {
	    		 System.out.println(-1);
	    		 return;
	    	 }
	    	 
	    	 if(sum.equals(reqSum))
	    	 {
	    		 System.out.println((sp+1)+" "+(mp+1));
	    		 return;
	    	 }
	    	 else if(sum.compareTo(reqSum) == -1)
	    	 {
	    		 mp+=1;
	    		 sum = findSubArraySum(arr, sp, mp);
	    		 continue;
	    	 }
	    	 else if(sum.compareTo(reqSum) == 1)
	    	 {
	    		 sp = sp+1;
	    		 mp = sp+1;
	    		 sum =  findSubArraySum(arr, sp, mp);
	    		 continue;
	    	 }
	    	 
	     }
	    		 
	 }

	private static BigInteger findSubArraySum(int[] arr, int sp, int mp) {
		BigInteger sum =BigInteger.valueOf(0);
		for(int i=sp;i<=mp && i<arr.length;i++)
		{
			sum =sum.add(BigInteger.valueOf(arr[i]));
		}
		return sum;
	}

}
