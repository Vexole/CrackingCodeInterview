
public class CountingValley {
	public static void main(String[] args) {

		String s = "DUDUDU";
		
		int valleys = 0;
		int state = 0;
		
		for(char c: s.toCharArray()) {
			if (c == 'U') {
				state++;
			} else {
				state--;
			}
			
			if (state == 0 && c == 'U') {
				valleys++;
			}
		}
		System.out.println(valleys);
	}
}
