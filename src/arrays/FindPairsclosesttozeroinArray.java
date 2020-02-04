package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class FindPairsclosesttozeroinArray {

	@Test
	public void test() {
		
		int expected  =  -68;
		int[] arr= {-8,-66,-60};
		int minSum = getMinSum(arr);
		assertEquals(expected, minSum);
	}

	private int getMinSum(int[] arr) {
		
		int minSum=Integer.MAX_VALUE;
		Arrays.sort(arr);
		int l=0,r=arr.length-1;
		while(l < r)
		{
			if(Math.abs(minSum) > Math.abs(arr[l]+arr[r]))
			{
				minSum = arr[l]+arr[r];
			}
			else
			{
				if(arr[l]+arr[r] < 0)
				{
					l++;
				}
				else
				{
					r--;
				}
			}
			
			
			
		}
		return minSum;
	}

}
