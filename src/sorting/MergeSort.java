package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSort {

	@Test
	public void test() {
		int[] testArr = {};
		mergeSort(testArr, 0, testArr.length - 1);
	}

	private void mergeSort(int[] testArr, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(testArr, left, middle);
			mergeSort(testArr, middle + 1, right);
			merge(testArr, left, middle, right);
		}
	}

	private void merge(int[] testArr, int left, int middle, int right) {
		int leftArr[] = new int[middle - left + 1];
		int rightArr[] = new int[right - middle];
		for (int i = 0; i < leftArr.length; i++)
			leftArr[i] = testArr[left + i];
		for (int i = 0; i < rightArr.length; i++)
			rightArr[i] = testArr[middle + 1 + i];

		int i = 0, j = 0, k = left;
		while (i < leftArr.length && j < rightArr.length) {

			if (leftArr[i] < rightArr[j]) {
				testArr[k] = leftArr[i];
				++i;
			}
			if (rightArr[j] < leftArr[i]) {
				testArr[k] = rightArr[j];
				++j;
			}

			++k;
		}
		while (i < leftArr.length) 
		{
			testArr[k] =leftArr[i];
			++i;
			++k;
		}
		while(j<rightArr.length)
		{
			testArr[k]=rightArr[j];
			++j;
			++k;
		}

	}

}
