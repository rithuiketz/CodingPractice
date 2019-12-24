package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * http://users.monash.edu/~lloyd/tildeAlgDS/Sort/Flag/
 * https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
 * 
 * @author Rithuik.Yerrabrolu
 *
 */
public class SeperateZeroOneNTwo {

	@Test
	public void test()
	{
		int[] testArr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int[] expecArr = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2};
		sortArray(testArr);		
		assertArrayEquals(expecArr, testArr);
	}

	private void sortArray(int[] testArr) 
	{
		int high = testArr.length-1,low=1,mid=1,temp;
		while(mid <= high)
		{
			if(testArr[mid] == 0)
			{
				temp  =  0;
				testArr[mid] = testArr[low];
				testArr[low] =  temp;
				++low;
				++mid;
			}
			else if(testArr[mid] == 1)
			{
				++mid;
							
			}
			else
			{
				temp = testArr[mid];
				testArr[mid] = testArr[high];
				testArr[high] = temp;	
				--high;
			}
		}
		
		
	}

}
