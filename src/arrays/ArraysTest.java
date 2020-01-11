package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import arrays.rotation.LeftRotateArrays;
import arrays.rotation.SearchElementInRotatedArray;

public class ArraysTest {

	@Test
	public void test() 
	{
		int[] testArr =  { 1, 9, 2, 67, 76, 1, 5 };
		int[] resultArr = {2,67,76,1,5,1,9};
		TestService testService  =  new LeftRotateArrays();
	    testArr =  testService.test(testArr);
	    System.out.println(Arrays.toString(testArr));
	    Assert.assertArrayEquals(resultArr, testArr);
	
	}
	
	@Test
	public void testSearch()
	{
		int[] testArr= {4,5,6,2,3};
		int searchEl  = SearchElementInRotatedArray.search(testArr, 3);
		System.out.println(searchEl);
		assertTrue(searchEl==4);
		
	}

}
