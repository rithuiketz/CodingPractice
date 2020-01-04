package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BinarySearch {

	@Test
	public void test() {
		
		int[] arr = {1,4,8,3,56,79};
		Arrays.sort(arr);
		int searchElement = 56;
		int pos =4;
		int index = iterativeBinarySearch(arr,searchElement);//binarySearch(arr,0,arr.length-1,searchElement);
		assertEquals(pos, index);
	}

	private int binarySearch(int[] arr, int start, int end, int searchElement) 
	{
		int index = -1;
		if(start < end)
		{
			int middle = (start+end)/2;
			if(arr[middle] == searchElement)
				return middle;
			else if(searchElement >  arr[middle])
				return binarySearch(arr, middle+1, end, searchElement);
			else if(searchElement <  arr[middle])
				return binarySearch(arr, start, middle-1, searchElement);
		}
		return index;
	}
	
	private int iterativeBinarySearch(int[] arr,int searchElement)
	{
		int defaultIndex =-1,start=0,end=arr.length-1;
		while(start<end)
		{
			int middle = (start+end)/2;
			if(arr[middle] == searchElement)
				return middle;
			else if(searchElement < arr[middle])
			{
				end = middle;				
			}
			else if(searchElement > arr[middle])
			{
				start =middle+1;
			}
		}
		return defaultIndex;
	}

}
