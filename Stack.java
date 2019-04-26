
public class Stack {

	int stack[] = new int[5];
	int top = 0;

	public void push(int data) {
		if (top > 4) {
			System.out.println("Stack Full");
		} else {
			stack[top] = data;
			top++;
		}
	}

	public void pop() {
		if (top == 0) {
			System.out.println("Stack Underflow");
		} else {
			top--;
			System.out.println(stack[top]);
			stack[top] = 0;
		}
	}

	public void peek() {
		System.out.println(stack[top - 1]);
	}

	public int size() {
		return top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void show() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
