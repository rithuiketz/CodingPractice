package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class EvenOddNumbers {

	@Test
	public void test() 
	{
		int[] testArr = {1, 2, 1, 4, 5, 6, 8, 8};
		int[] expectedArr= {4,5,2,6,1,8,1,8};
		testArr = shiftArr(testArr,testArr.length);
		assertArrayEquals(expectedArr, testArr);
	
	}

	private  static int[] shiftArr(int[] testArr, int length) 
	{
		int midIndex = length-length/2;
		int arr[] =  new int[length];
		arr = Arrays.copyOf(testArr, length);
		Arrays.sort(arr);
		int j = midIndex-1;
		for(int i=0;i<length;i+=2)
		{
			testArr[i] = arr[j];			
			--j;
		}
		j=midIndex;
		for(int i=1;i<length;i+=2)
		{
			testArr[i] = arr[j];			
			++j;
		}
		return testArr;
	}

}
