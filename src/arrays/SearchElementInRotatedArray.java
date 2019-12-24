package arrays;

/**
 * https://www.geeksforgeeks.org/search-an-element-in-a-sorted-and-pivoted-array
 *@author Rithuik.Yerrabrolu
 *
 */
public class SearchElementInRotatedArray {

	public static int search(int[] arr, int searchEl) {
		int pivot = findPivot(arr, 0, arr.length - 1);
		if (pivot == -1)
			return binarySearch(arr, 0, arr.length - 1, searchEl);
		if (arr[pivot] == searchEl)
			return arr[pivot];
		else if (searchEl < arr[pivot])
			return binarySearch(arr, pivot + 1, arr.length - 1, searchEl);
		else
			return binarySearch(arr, 0, pivot - 1, searchEl);
	}

	private static int binarySearch(int[] arr, int start, int end, int searchEl) {
		if (start < end) {
			int middle = (start + end) / 2;
			if (arr[middle] == searchEl)
				return middle;
			if (arr[start] == searchEl)
				return start;
			if (arr[end] == searchEl)
				return end;
			if (arr[middle] > searchEl)
				return binarySearch(arr, start + 1, middle, searchEl);
			else
				return binarySearch(arr, middle + 1, end - 1, searchEl);
		}
		return -1;
	}

	public static int findPivot(int[] arr, int low, int high) {
		if (low > high)
			return -1;
		if (low == high)
			return high;
		int middle = (low + high) / 2;
		if (arr[middle] > arr[middle + 1])
			return middle;
		if (arr[middle - 1] > arr[middle])
			return middle - 1;
		if (arr[low] >= arr[middle])
			return findPivot(arr, low, middle - 1);
		return findPivot(arr, middle + 1, high);
	}

}
