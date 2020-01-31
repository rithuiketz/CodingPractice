package arrays;

import java.util.HashMap;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/find-subarray-with-given-sum/
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class FindContigiousSubArraySumGivenToANumber {

	@Test
	public void test() {
		int num = 33;
		int[] testArr = { 1, 4, 20, 3, 10, 5 };
		findContinusSubArrayNegative(num, testArr);
	}

	private void findContinusSubArrayNonNegative(int num, int[] testArr) {
		int start = 0, i;
		int currSum = testArr[start];

		for (i = 1; i < testArr.length; i++) {
			while (currSum > num && i >= start) {
				currSum -= testArr[start];
				++start;
			}
			if (currSum < num)
				currSum += testArr[i];
			if (currSum == num) {
				System.out.println("Num Found Bn " + (start + 1) + " &" + i);
			}
		}

	}

	private void findContinusSubArrayNegative(int num, int[] testArr) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		int curSum=0;
		for(int i=0;i<testArr.length;i++)
		{
			curSum+=testArr[i];
			if(curSum==num)
			{
				System.out.println("Num Found Bn " + 0+ " &" + i);
			}
			if(map.containsKey(curSum-num))
			{
				int start = curSum-num;
				System.out.println("Num Found Bn " + (map.get(start)+1) + " &" + i);
				return;
			}			
			map.put(curSum, i);
		}
	
	}

}
