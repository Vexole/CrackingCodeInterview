
public class Swap {

	public static void main(String args[]){
		Integer a=4;
		Integer b =5;		
		swap(a,b);
		System.out.println(a + " " + b);
		
		a = returnVal(b, b=a);
		System.out.println(a + " " + b);
	}
	
	public static void swap(Integer x, Integer y) {
		int temp = x;
		x = y;
		y = temp;		
	}
	
	public static int returnVal(int x, int y) {
		return x;
	}
}
