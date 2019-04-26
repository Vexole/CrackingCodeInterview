import java.util.ArrayList;
import java.util.List;

public class DynamicStack {

	List<Integer> stack = new ArrayList<>();
	int top = 0;

	public void push(int data) {
		stack.add(data);
		top++;

	}

	public void pop() {
		if (top == 0) {
			System.out.println("Stack Underflow");
		} else {
			top--;
			System.out.println(stack.get(top));
			stack.set(top, 0);
		}
	}

	public void peek() {
		System.out.println(stack.get(top - 1));
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void show() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack.get(i));
		}
	}
}
