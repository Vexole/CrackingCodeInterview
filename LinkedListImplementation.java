public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.insert(3);
		obj.insert(2);
		obj.insert(1);
		obj.show();

		obj.insertAtStart(7);
		obj.insertAt(3, 5);
		obj.show();

		obj.deleteAt(3);
		obj.show();
	}
}
