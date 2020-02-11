package arrays;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/*
 * 
 * Given a non-negative number represented as an array of digits,

 add 1 to the number ( increment the number represented by the digits ).

 The digits are stored such that the most significant digit is at the head of the list.

 Example:

 If the vector has [1, 2, 3]

 the returned vector should be [1, 2, 4]

 as 123 + 1 = 124.
 */
public class AddOne {

	@Test
	public void test() 
	{
		List<Integer> testList = Arrays.asList(2, 5, 6, 8, 6, 1, 2, 4, 5 );
		List<Integer> expectedList = Arrays.asList(2,5,6,8,6,1,2,4,6);
		testList =  addOneAndGet(testList);
		System.out.println(testList.toString());
		assertArrayEquals(expectedList.toArray(), testList.toArray());
		
	}

	private List<Integer> addOneAndGet(List<Integer> testList) 
	{
		ArrayList<Integer> result = new ArrayList<>(testList.size());
		int size = testList.size(),power =0,num=0;
		for(int i=size-1;i>=0;i--)
		{
			num+= (testList.get(i)*(int)Math.pow(10, power));
			++power;
		}
		num+=1;
		int index = size-1;
		int[] arr =  new int[size];
		int temp = num;
		while(temp >10)
		{
			arr[index] =temp%10;
			temp=temp/10;
			index-=1;
		}	
		arr[index] =temp;
		for(int i :arr)
		{
			result.add(i);
		}
		return result;
	}

}
