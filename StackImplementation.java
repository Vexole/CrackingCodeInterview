
public class StackImplementation {

	public static void main(String[] args) {
		Stack obj = new Stack();
		System.out.println(obj.isEmpty());
		obj.push(2);
		obj.push(1);
		obj.push(3);	
		obj.show();
		
		obj.pop();
		obj.show();
		
		obj.peek();
		
		obj.size();
	}

}
