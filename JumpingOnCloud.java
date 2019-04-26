
public class JumpingOnCloud {
	public static void main(String[] args) {
		int[] c = { 0, 0, 1, 0, 0, 1, 0 };
		int count = 0;
		int i = 0;

		while (i < c.length - 2) {

			// if (c[i + 2] == 0) {
			// i += 2;
			// } else {
			// i++;
			// }
			i = c[i + 2] == 0 ? i + 2 : i + 1;
			count++;
		}

		if (i <= c.length - 2) {
			count++;
		}

		System.out.println(count);
	}
}
