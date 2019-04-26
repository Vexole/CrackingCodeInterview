
public class Queue {
	int queue[] = new int[10];
	int size;
	int front = 0;
	int rear = 0;

	public void enQueue(int data) {
		if (isFull()) {
			System.out.println("Queue Full");
		} else {
			queue[rear] = data;
			rear = (++rear) % 10;
			size++;
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue Empty");
			return 0;
		} else {
			int temp = queue[front];
			queue[front] = 0;
			front = (++front) % 10;
			size--;
			return temp;
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}

	public boolean isFull() {
		return getSize() == 10;
	}

	public void show() {
		for (int i = 0; i < rear; i++) {
			System.out.println(queue[(front + i) % 10]);
		}
	}
}
