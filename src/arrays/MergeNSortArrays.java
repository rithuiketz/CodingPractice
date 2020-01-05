package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/merging-two-unsorted-arrays-sorted-order/
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class MergeNSortArrays {

	@Test
	public void test() {
		int a[] = { 10, 5, 15 };
		int b[] = { 20, 3, 2 };
		int[] sorted = sort(a, b);
		int[] expectedArr = { 2, 3, 5, 10, 15, 20 };
		System.out.println();
		assertArrayEquals(expectedArr, sorted);
	}

	private int[] sort(int[] a, int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i=0,j=0,k=0;
		int[] mergedArr =  new int[a.length+b.length];
		while(i<a.length &&j< b.length)
		{
			if(a[i] <= b[j])
			{
				mergedArr[k] =a[i];
				++i;
			}
			else
			{
				mergedArr[k] =b[j];
				++j;
			}
			++k;
		}
		while(i < a.length)
		{
			mergedArr[k] = a[i];
			++i;
		}
		while(j < b.length)
		{
			mergedArr[k] =b[j];
			++j;
		}
		return mergedArr;
	}

}
