package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

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
		
		int[] test = {-2, -3, 4, -1, -2, 1, 5, -3};
		//int sum  =  kandeAlgorithem(test);
		//assertEquals(7, sum);
		int[] indices = getTheStartAndEndIndices(test);
		int[] expectedIndices={2,6};
		System.out.println(Arrays.toString(indices));
		assertArrayEquals(expectedIndices, indices);

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
	private static int[] getTheStartAndEndIndices(int[] arr)
	{
		int maxSum = Integer.MIN_VALUE;
		int minSum = arr[0];
		int startIndex=0,start = 0,end = 0;
		for(int i=0;i<arr.length;i++)
		{
			minSum+=arr[i];
			if(minSum < 0)
			{
				minSum=0;
				++startIndex;			
			}
			if(maxSum <  minSum)
			{
				maxSum =minSum;	
				start=startIndex;
				end =i;
			}
		}		
		int[] indices= {startIndex,end};
		return indices;
	}

}
