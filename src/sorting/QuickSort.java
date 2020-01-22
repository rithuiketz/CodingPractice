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
		int[] testArr = {64,25,12,22,11};
		int[] expectedArr ={11,12,22,25,64};
		sort(testArr,testArr.length);
		assertArrayEquals(expectedArr, testArr);
	}

	private void sort(int[] testArr,int length) 
	{
	
		
	}

}
