package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSort {

	@Test
	public void test() {
		int[] testArr = { 64, 25, 12, 22, 11 };
		int[] expectedArr = { 11, 12, 22, 25, 64 };
		sort(testArr);
		assertArrayEquals(expectedArr, testArr);
	}

	private void sort(int[] testArr) 
	{
		int j,key,i,length=testArr.length;
		for(i=1;i<length;i++)
		{
			j=i-1;
			key=testArr[i];
			while(j>=0 && testArr[j] > key)
			{
				testArr[j+1]=testArr[j];
				testArr[j] = key;
				--j;
			}
		}
		
	}

}
