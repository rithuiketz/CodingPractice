package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddNumberOccurance {

	@Test
	public void test() {
		int[] arr = {1, 2, 3, 2, 3, 1, 3,4,3,3,4};
		int numberOccuredOddNumberTimes = checkOddOccurance(arr);	
		assertEquals(3, numberOccuredOddNumberTimes);
	}

	private int checkOddOccurance(int[] arr) 
	{
		int xor =0;
		for(int i : arr)
		{
			xor^=i;
		}
		return xor;
	}

}
