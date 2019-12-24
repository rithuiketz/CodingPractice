package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedArrayPairSumTest {

	@Test
	public void test() 
	{
		int[] arr = {2,8,9,10,15};
		int sum  = 25;
		boolean isSumExists = isSumExists(arr,sum);
		assertEquals(true, isSumExists);
	}

	private static boolean  isSumExists(int[] arr, int sum) 
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j] < sum)
				i++;
			if(arr[i]+arr[j] >sum)
				j++;
			if(arr[i]+arr[j] == sum)
				return true;
		}
		return false;
	}

}
