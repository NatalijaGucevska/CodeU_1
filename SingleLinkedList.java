public class SingleLinkedList<T> {
	Node head;

	public SingleLinkedList() {
		this.head = null;
	}

	public void add(T val) {
		if(head == null) {
			head = new Node(val);
		} else {
			Node currNode = head; 
			while(currNode.hasNext()) {
				currNode = currNode.getNext(); 
			}
			currNode.setNext(val);
		}
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
			return head.getVal();
		}

		Node last = head;
		Node kLast = head;

		for (int i = 0; i < k; i++) {
			last = last.getNext();
			if (!last.hasNext()) {
				return kLast.getVal();
			}
		}

		while (last.hasNext()) {
			last = last.getNext();
			kLast = kLast.getNext();
		}

		return kLast.getVal();
	}
	
	class Node {
		T val;
		Node next;

		public Node(T val) {
			this.val = val;
			this.next = null;
		}

		Node getNext() {
			return this.next;
		}
		
		void setNext(T val) {
			this.next = new Node(val); 
		}
		
		boolean hasNext() {
			return this.next != null; 
		}
		
		T getVal() {
			return this.val;
		}
	}
}
