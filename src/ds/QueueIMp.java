package ds;

public class QueueIMp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(8);
		q.enQueue(3);
		q.deQueue();
		q.enQueue(5);
		q.enQueue(8);
		q.enQueue(3);
		System.out.println("Size : "+ q.getSize());
		q.show();

	}

}
