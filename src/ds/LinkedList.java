package ds;

public class LinkedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void show() {

		Node sh = head;
		while (sh.next != null) {

			System.out.println(sh.data);
			sh = sh.next;
		}
		System.out.println(sh);
	}

}
