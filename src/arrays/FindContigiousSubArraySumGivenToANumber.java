package arrays;

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
		findContinusSubArrayNonNegative(num, testArr);
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

}
