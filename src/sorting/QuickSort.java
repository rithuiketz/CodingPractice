package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/quick-sort/ * @author Rithuik Yerrabrolu
 *
 */
public class QuickSort {

	@Test
	public void test() {
		int[] testArr = { 64, 25, 12, 22, 11 };
		int[] expectedArr = { 11, 12, 22, 25, 64 };
		sort(testArr, testArr.length);
		assertArrayEquals(expectedArr, testArr);
	}

	private void sort(int[] testArr, int length) {
		quickSort(testArr, 0, length - 1);

	}

	private static void quickSort(int[] testArr, int lowIdx, int highIdx) {
		if (lowIdx < highIdx) {
			int pivot = partition(testArr, lowIdx, highIdx);
			quickSort(testArr, lowIdx, pivot - 1);
			quickSort(testArr, pivot, highIdx);
		}
	}

	private static int partition(int[] testArr, int lowIdx, int highIdx) {
		
		int pivotIndex  = highIdx;
		for(int i=lowIdx;i<=highIdx;i++)
		{
			if( (i > pivotIndex && testArr[i] <testArr[pivotIndex]) || (i<pivotIndex && testArr[i] > testArr[pivotIndex]))
			{
				swap(testArr, i, pivotIndex);
			    pivotIndex = i;
			}
		}
		return pivotIndex;
	}
	
	private static void swap(int[] testArr,int srcIndx,int tgtIndx)
	{
		int temp =  testArr[srcIndx];
		testArr[srcIndx] = testArr[tgtIndx];
		testArr[tgtIndx] =temp;
	}
}
