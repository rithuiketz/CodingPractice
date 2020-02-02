package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/quick-sort/ * @author Rithuik Yerrabrolu
 *
 */
public class QuickSort {

	@Test
	public void test() {
		int[] testArr = { 411,575,686,364,887,183};
		int[] expectedArr = {183,364,411, 575,686,887};
		sort(testArr, testArr.length);
		System.out.println(Arrays.toString(testArr));
		assertArrayEquals(expectedArr, testArr);
	}

	private void sort(int[] testArr, int length) {
		quickSort(testArr, 0, length - 1);

	}

	private static void quickSort(int[] testArr, int lowIdx, int highIdx) {
		if (lowIdx < highIdx)
		{
			int pivot = partition(testArr, lowIdx, highIdx);
			quickSort(testArr, lowIdx, pivot - 1);
			quickSort(testArr, pivot, highIdx);
		}
	}

	private static int partition(int[] arr, int low, int high) 
	{
		int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
                swap(arr, i, j);
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        swap(arr, i+1, high);
         return i+1; 
	}
	
	private static void swap(int[] testArr,int srcIndx,int tgtIndx)
	{
		int temp =  testArr[srcIndx];
		testArr[srcIndx] = testArr[tgtIndx];
		testArr[tgtIndx] =temp;
	}
}
