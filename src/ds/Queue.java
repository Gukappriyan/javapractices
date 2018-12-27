package ds;

public class Queue {

	int queue[] = new int[5];
	int front;
	int rear;
	int size;

	public void enQueue(int data) {

		if (!isFull()) {
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		} else {
			System.out.println("Full");
		}
	}

	public int deQueue() {
		int data = queue[front];
		if(!isEmpty()) {
		
		front = (front + 1) % 5;
		size = size - 1;
		}else {
			System.err.println("Empty");
		}
		return data;
	}

	public void show() {

		System.out.println("Element : ");
		for (int i = 0; i < size; i++) {
			System.err.println(queue[(front + i) % 5] + " ");
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public boolean isFull() {

		return size == 5;
	}

}
