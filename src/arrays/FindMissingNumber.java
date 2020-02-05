package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMissingNumber {

	@Test
	public void test() {
		int[] arr ={1, 2, 4,6, 3, 7, 8};
		int expec =5;
		assertEquals(expec, method1(arr));
		assertEquals(expec, method2(arr));
		assertEquals(expec, method3(arr));
	}
	
	public static int method1(int[] arr)
	{
		int n = Integer.MIN_VALUE;
		int sum = 0;
		for(int i : arr)
		{
			sum+=i;
			n = i > n ? i:n;
		}
	    int val = (n*(n+1))/2;	
		
		return val-sum;
	}
	
	public static int method2(int[] arr)
	{
		int temp=1;
		for(int i=2;i<arr.length+1;i++)
		{
			temp+=i;
			temp-=arr[i-2];
		}
		return temp;
	}
	
	public static int method3(int[] arr)
	{
		int totalXor=arr[0],arrXor=0;
		for(int i=1;i<arr.length;i++)
		{
			totalXor^=arr[i];
		}
		for(int i=1;i<=arr.length+1;i++)
		{
			arrXor^=i;
		}
		
		return totalXor^arrXor;
	}

}
