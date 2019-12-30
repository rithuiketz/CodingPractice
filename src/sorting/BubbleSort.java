package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {

	@Test
	public void test() {
		int[] testArr = { 64, 25, 12, 22, 11 };
		int[] expectedArr = { 11, 12, 22, 25, 64 };
		nonRecursiveSort(testArr);
		System.out.println(Arrays.toString(testArr));
		assertArrayEquals(expectedArr, testArr);
	}

	private void nonRecursiveSort(int[] testArr) 
	{
		boolean sorted = true;
		for (int i = 0; i < testArr.length; i++) 
		{
			for (int j = 0; j < testArr.length - 1; j++) 
			{
				if (testArr[j] > testArr[j + 1]) {
					int temp = testArr[j];
					testArr[j] = testArr[j + 1];
					testArr[j + 1] = temp;
					sorted =  false;
				}
			}
			if(sorted)
				return;
		}

	}
}
