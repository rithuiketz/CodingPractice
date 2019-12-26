package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * https://en.wikipedia.org/wiki/Maximum_subarray_problem
 * https://www.geeksforgeeks
 * .org/maximum-subarray-sum-using-divide-and-conquer-algorithm/
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class MaximumSubArray {

	@Test
	public void test() {
		
		int[] test = {-2, -5, 6, -2, -3, 1, 5, -6};
		int sum  =  kandeAlgorithem(test);
		assertEquals(7, sum);

	}
	
	private static int kandeAlgorithem(int[] arr)
	{
		int maxSum = Integer.MIN_VALUE;
		int minSum = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			minSum+=arr[i];
			minSum  = minSum < 0 ? 0 : minSum;
			if(maxSum <  minSum)
				maxSum =minSum;			
		}		
		return maxSum;
	}

}
