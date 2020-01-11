package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
/*
 * https://www.geeksforgeeks.org/counting-sort/
 */
public class CountingSort {

	@Test
	public void test() {
		int[] testArr = { 1, 4, 1, 2, 7, 5, 2 };
		int[] expectArr = { 1, 1, 2, 2, 4, 5, 7 };
		sort(testArr);
		System.out.println(Arrays.toString(testArr));
		assertArrayEquals(testArr, expectArr);
	}

	private void sort(int[] testArr) 
	{
		int n = testArr.length;
		int[] countArr = new int[10];
		int[] outputArr = new int[n];
		
		for (int i = 0; i < n; i++)
		{
			++countArr[testArr[i]];
		}
		System.out.println(Arrays.toString(countArr));
		for (int i = 1; i < 10; i++) {
			countArr[i] += countArr[i - 1];
		}
		//System.out.println(Arrays.toString(countArr));
		
		/*for (int j = n - 1; j >= 0; j--) {
			outputArr[countArr[testArr[j]] - 1] = testArr[j];
			--countArr[j];
		}*/
		for (int i = n-1; i>=0; i--) 
        { 
            outputArr[countArr[testArr[i]]-1] = testArr[i]; 
            --countArr[testArr[i]]; 
        } 
		 for (int i = 0; i<n; ++i) 
	            testArr[i] = outputArr[i];
		// System.out.println(Arrays.toString(outputArr));

	}

}
