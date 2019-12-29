package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LargestNSecondLargest {

	@Test
	public void test() 
	{
		int[] testArr = {12, 35, 1, 10, 34, 1};
		int[] expectedArr = {35,34};
		testArr = findFirstNSecondLargest(testArr);
		System.out.println(Arrays.toString(testArr));
		assertArrayEquals(expectedArr, testArr);
		
		
	}

	private int[] findFirstNSecondLargest(int[] testArr) 
	{
		int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
		for(int i=1;i<testArr.length;i++)
		{
			if(testArr[i] >  first)
			{
				second = first;
				first=testArr[i];
			}
			else if(first > testArr[i] && testArr[i] > second)
			{
				second =  testArr[i];
			}
			
			
			
		}
		int[] arr= {first,second};
		return arr;
	}

}
