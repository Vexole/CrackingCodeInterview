public class CStyleString {
	public static void main(String args[]){
		String s = "this is a demo test!";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String input){
		StringBuffer reversed = new StringBuffer();
		for(int i=input.length()-1; i>=0; i--) {
			reversed.append(input.charAt(i));
		}

		return reversed.toString();
	}
}
