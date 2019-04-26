import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterCheck {

	public static void main(String[] args) {

		String testString = "Helo Wrd";
		Set<String> visited = new HashSet<>();

		for (int i = 0; i < testString.length(); i++) {
			String currentChar = String.valueOf(testString.charAt(i));
			if (visited.contains(currentChar)) {
				System.out.println("Not Unique");
				System.exit(0);
			}
			visited.add(currentChar);
		}
		System.out.println("Unique");
		
		System.out.println(isUniqueChars(testString));
	}

	public static boolean isUniqueChars(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}
}
