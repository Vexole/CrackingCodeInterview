//An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and followed by
//the same number of non-zero elements. Write a function named isHollow that accepts an integer array and
//returns 1 if it is a hollow array, otherwise it returns 0
//Examples: isHollow({1,2,4,0,0,0,3,4,5}) returns 1. isHollow ({1,2,0,0,0,3,4,5}) returns 0. isHollow ({1,2,4,9,
//0,0,0,3,4, 5}) returns 0. isHollow ({1,2, 0,0, 3,4}) returns 0.
//If you are programming in Java or C#, the function signature is
//int isHollow(int[ ] a).
//If you are C or C++ programmer
//int isHollow(int[ ] a, int len)
//where len is the number of elements in the array

public class ZeroProblem {

	public static void main(String[] args) {
		int[] x = {1,2,3, 0,0,0,3,4,5};
		System.out.println(isHollow(x));
	}

	public static boolean isHollow(int[] x) {
		if (x.length < 9 || x.length % 3 != 0)
			return false;

		int length = x.length / 3;
		int size = x.length;

		for (int i = 0; i < length; i++) {
			if (x[i] == 0 || x[size - i - 1] == 0)
				return false;
		}

		for (int i = length; i < length * 2; i++) {
			if (x[i] != 0)
				return false;
		}
		return true;
	}

}
