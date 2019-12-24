package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Rithuik.Yerrabrolu
 * https://www.geeksforgeeks.org/given-a-sorted-and-rotated
 * -array-find-if-there-is-a-pair-with-a-given-sum/
 */
public class RotatedArrayPairSum {

	@Test
	public void test() 
	{
		int[] testArr= {4,5,6,2,3};
		int sum  = 9;
		boolean isSumPairExisits = checkSumPair(testArr,sum);
		assertEquals(true, isSumPairExisits);
		assertEquals(2, countSumPair(testArr,sum));
	}

	private boolean checkSumPair(int[] arr,int sum) 
	{
		int pivot  = SearchElementInRotatedArray.findPivot(arr, 0, arr.length-1);
		int right = (pivot+1)%arr.length;
		int left = pivot;
	    while(left != right)
	    {
	    	if(arr[left]+arr[right] == sum)
	    		return true;
	    	else if(arr[right] + arr[left] > sum)
	    		left  = --left%arr.length;
	    	else if(arr[left]+arr[right] < sum)
	    		right=++right%arr.length;
	    }		
		return false;
	}
	
	private int  countSumPair(int[] arr,int sum) 
	{
		int pivot  = SearchElementInRotatedArray.findPivot(arr, 0, arr.length-1);
		int right = (pivot+1)%arr.length;
		int left = pivot;
		int count=0;
	    while(left != right)
	    {
	    	if(arr[left]+arr[right] == sum)
	    	{
	    		++count;
	    		
	    	}
	    	else if(arr[right] + arr[left] > sum)
	    		left  = --left%arr.length;
	    	else if(arr[left]+arr[right] < sum)
	    		right=++right%arr.length;
	    }		
	    System.out.println(count);
		return count;
	}

}
