import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		RemoveDuplicateCharacters obj = new RemoveDuplicateCharacters();
		System.out.println(obj.getProcessedData("aaaa"));
	}

	public String getProcessedData(String argWord) {
		if (argWord != null) {
			Set<String> uniqueCharacters = new HashSet<String>();
			StringBuilder processedWord = new StringBuilder();

			for (Character c : argWord.toCharArray()) {
				if (!uniqueCharacters.contains(c.toString())) {
					processedWord.append(c);
					uniqueCharacters.add(c.toString());
				}
			}
			return processedWord.toString();
		}
		return "";
	}
}
