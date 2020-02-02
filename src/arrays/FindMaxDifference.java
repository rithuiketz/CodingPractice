package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Find maximum difference between two pairs in an array Such that larger
 * apperas after the smaller
 * 
 * @author Rithuik Yerrabrolu
 *         https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 *
 */
public class FindMaxDifference {

	@Test
	public void test() {
		int[] arr = { 468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392,
				105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 300, 36, 395, 204, 312,
				323 };
		int actual = findMaxDiff2(arr);
		int expected = 495;
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	// tracking min element
	private int findMaxDiff(int[] arr) {
		int minElement = arr[0], maxDiff = arr[1] - arr[0];
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - minElement > maxDiff)
				maxDiff = arr[i] - minElement;
			if (arr[i] < minElement)
				minElement = arr[i];

		}
		return maxDiff;
	}

	// tracking max element
	private int findMaxDiff2(int[] arr)
	{
		int maxDiff = -1,n=arr.length;

		// Initialize max element from right side
		int maxRight = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > maxRight)
				maxRight = arr[i];
			else {
				int diff = maxRight - arr[i];
				if (diff > maxDiff) {
					maxDiff = diff;
				}
			}
		}
		return maxDiff;
	}

}
