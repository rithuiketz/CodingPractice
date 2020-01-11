package arrays.rotation;

import arrays.TestService;

public class LeftRotateArrays implements TestService{

	@Override
	public int[] test(int[] arr) 
	{
		//arr =  tempArrMethod(arr);
		reversalAlgorithem(arr);
		return arr;
	}
	
	public static int[] tempArrMethod(int[] arr)
	{
		int i,length;
		length = arr.length;
		int[] tempArr =  new int[length];
		for(i=0;i<length;i++)
		{
			int destination = ((length+i)-2)%length;
			tempArr[destination] = arr[i];
			
		}
		return tempArr;
	}
	
	public static void reversalAlgorithem(int[] arr)
	{
		
		reverseArray(arr,0,1);
		reverseArray(arr,2,arr.length-1);
		reverseArray(arr,0,arr.length-1);
		
	}

	private static void reverseArray(int[] arr, int start, int end) 
	{
		
		int temp,i,j;
		i=start;
		j=end;
		for(;i<=end && i<j;i++)
		{
			temp = arr[i];
			arr[i] =arr[j];
			arr[j]=temp;
			--j;
		}
		
	}


}
