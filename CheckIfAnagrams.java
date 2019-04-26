import java.util.HashMap;
import java.util.Map;

public class CheckIfAnagrams {

	public static void main(String[] args) {
		CheckIfAnagrams obj = new CheckIfAnagrams();
		obj.checkStrings("SILENT", "LISTEN");
	}

	public void checkStrings(String argWord1, String argWord2) {
		if (argWord1.length() != argWord2.length()) {
			System.out.println("No");
			System.exit(0);
		}

		Map<String, Integer> repetationTime = new HashMap<>();

		for (Character c : argWord1.toCharArray()) {
			if (repetationTime.get(c.toString()) == null) {
				repetationTime.put(c.toString(), 1);
			} else {
				repetationTime.put(c.toString(), repetationTime.get(c.toString()) + 1);
			}
		}

		for (Character c : argWord2.toCharArray()) {
			if (repetationTime.get(c.toString()) == null) {
				System.out.println("No");
				System.exit(0);
			} else {
				repetationTime.put(c.toString(), repetationTime.get(c.toString()) - 1);
			}
		}

		for (String key : repetationTime.keySet()) {
			if (repetationTime.get(key) != 0) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}
