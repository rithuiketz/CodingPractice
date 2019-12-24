package arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
/**
 * https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 * @author Rithuik Yerrabrolu
 *
 */
public class SeperateZerosAndOnes {

	@Test
	public void test() 
	{
		int[] testArr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		int[] expecArr= {0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
		
		pointerMethod(testArr, testArr.length);
		
		System.out.println(Arrays.toString(testArr));
		assertArrayEquals(expecArr, testArr);
	}
	
	public static void sumMethod(int[] arr,int length) 
	{
		int sum=0,noZeros;
		for(int i1 : arr)
		{
			sum+=i1;
		}
		System.out.println(sum);
		noZeros =  length-sum;
		for(int j=0;j<noZeros;j++)
		{
			arr[j]=0;
		}
		for(int k=noZeros; k<length;k++)
		{
			arr[k] =1;
		}
		
	}
	
	public static void pointerMethod(int[] arr, int length)
	{
		
		int i=0,j=length-1,temp;
		while(i<j)
		{
			while(arr[i] != 1)
				++i;
			while(arr[j] !=0)
				--j;
			if(i<j)
			{
				arr[i] =0;
				arr[j]=1;
			}
			
			
		}
		
		
	}
	
	
	
	

}
