package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-
 * rotations-on-given-array-allowed/
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class MaximumArrayProduct {

	@Test
	public void test() 
	{
		int[]arr = {1, 20, 2, 10};
		int expectedVal=72;
		int maxVal =  maxProdSum(arr);
		assertEquals(expectedVal, maxVal);
	}
	
	private static int maxProdSum(int[] arr)
	{
		int currentVal=0,maxVal=0,sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			currentVal+=i*arr[i];
		}
		maxVal = maxVal > currentVal ? maxVal :  currentVal;
		
		for(int j=1;j<arr.length;j++)
		{
			currentVal+=  sum -arr.length*arr[arr.length-j];
			maxVal = maxVal > currentVal ? maxVal :  currentVal;
		}
		
		return maxVal;
	}

}
