package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-
 * in-a-with-sum-as-x/
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class PairSumEqualstoGivenNumber {

	@Test
	public void test() {
		int sum = 99;
		int[] arr = { 1, 4, 45, 6, 10, 8 };
		assertEquals(false, method2(arr, sum));
	}

	private boolean method1(int[] arr, int sum) 
	{
		Set<Integer> set = new HashSet<>();
		for(int value : arr)
		{
			int key = sum-value;
			if(set.contains(key))
				return true;
			else
				set.add(value);
			
		}
		return false;
	}
	private boolean method2(int[] arr,int sum)
	{
		Arrays.sort(arr);
		int start=0,end =arr.length-1;
		while(start<end)
		{
			if(arr[start]+arr[end] == sum)
				return true;
			else if(arr[start]+arr[end] >  sum)
				--end;
			else if(arr[start]+arr[end] <  sum)
				++start;
		}
		return false;
	}

}
