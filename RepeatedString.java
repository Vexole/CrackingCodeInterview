
public class RepeatedString {

	public static void main(String[] args) {
		String s = "a";
		long n = 100000000000000L;
		long count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}

		long times = n / s.length();
		long extra = n % s.length();

		count *= times;
		for (int i = 0; i < extra; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println(count);

	}

}
