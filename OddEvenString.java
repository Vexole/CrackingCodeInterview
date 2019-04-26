import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddEvenString {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		List<String> inputs = new ArrayList<>();

		for (int j = 0; j < n; j++) {
			String i = scan.nextLine();
			inputs.add(i);
		}

		for (String s : inputs) {
			String even = "";
			String odd = "";
			for (int i = 0; i < s.length(); i++) {
				if (i % 2 == 0) {
					even += s.charAt(i);
				} else {
					odd += s.charAt(i);
				}
			}
			System.out.println(even + " " + odd);
		}
		scan.close();
	}
}
