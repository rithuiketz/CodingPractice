package sorting;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
/**
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class SelectionSort {

	@Test
	public void test()
	{
		int[] testArr = {64,25,12,22,11};
		int[] expectedArr ={11,12,22,25,64};
		sort(testArr);
		assertArrayEquals(expectedArr, testArr);
	}

	private void sort(int[] testArr) 
	{
		for(int i=0;i<testArr.length;i++)
		{
			int minIndex = i;
			for(int j=i+1;j<testArr.length;j++)
			{
				if(testArr[j] < testArr[minIndex])
				{
					minIndex=j;
				}
					
			}
			int temp = testArr[minIndex];
			testArr[minIndex]  =testArr[i];
			testArr[i] = temp;
		}
		
		
	}

}
