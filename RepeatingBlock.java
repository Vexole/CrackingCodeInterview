//Write a function fill with signature
// 
//int[ ] fill(int[ ] arr, int k, int n) 
//
//which does the following: It returns an integer array arr2 of length n whose first k elements are the same as the first k elements of arr, and whose remaining elements consist of repeating blocks of the first k elements.  You can assume array arr has at least k elements. The function should return null if either k or n is not positive.  
//
//Examples:  
//fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}. 
//fill({4, 2, -3, 12}, 1, 5)  returns {4, 4, 4, 4, 4}. 
//fill({2, 6, 9, 0, -3}, 0, 4) returns null.

public class RepeatingBlock {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
//		int[] arr = { 4, 2, -3, 12 };
		int[] res = fill(arr, 3, 10);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static int[] fill(int[] arr, int k, int n) {

		if (k < 1 || n < 1)
			return null;

		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr2[i] = arr[i % k];
		}

//		for (int i = 0; i < k; i++) {
//			arr2[i] = arr[i];
//		}
//
//		for (int i = 0; i < (n - k); i++) {
//			arr2[i + k] = arr2[i];
//		}

		return arr2;

	}
}
