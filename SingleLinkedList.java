public class SingleLinkedList<T> {
	Node head;

	public SingleLinkedList() {
		this.head = null;
	}

	public void add(T val) {
		head = new Node(val, head);
	}

	/**
	 * Finds the kth to last element of the linked list.
	 * If k is bigger than the size of the list, the value of the head 
	 * node is returned. 
	 */
	public T kToLast(int k) {
		if (k < 0) {
			throw new IllegalArgumentException("k must be 0 or positive");
		} else if (head == null) {
			throw new IllegalArgumentException("The linked list is empty");
		} else if (head.getNext() == null) {
			return head.geVal();
		}

		Node last = head;
		Node kLast = head;

		for (int i = 0; i < k; i++) {
			last = last.next;
			if (last.getNext() == null) {
				return kLast.val;
			}
		}

		while (last.next != null) {
			last = last.getNext();
			kLast = kLast.getNext();
		}

		return kLast.geVal();
	}
	
	class Node {
		T val;
		Node next;

		public Node(T val, Node next) {
			this.val = val;
			this.next = next;
		}

		Node getNext() {
			return this.next;
		}

		T geVal() {
			return this.val;
		}
	}
}
