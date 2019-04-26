
public class ReplaceCharacter {

	public static void main(String[] args) {
		String temp = "Hello World! This is ok.";
		ReplaceCharacter obj = new ReplaceCharacter();
		obj.getProcessedString(temp);
		System.out.println(temp.replace(" ", "%20"));
	}
	
	public void getProcessedString(String argWord) {
		StringBuilder result = new StringBuilder();
		
		for(Character c: argWord.toCharArray()) {
			if(c.toString().equals(" ")) {
				result.append("%20");
			} else {
				result.append(c);
			}
		}
		System.out.println(result);
	}

}
