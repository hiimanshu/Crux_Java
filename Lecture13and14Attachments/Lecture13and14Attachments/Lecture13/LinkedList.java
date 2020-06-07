package Lecture13;

public class LinkedList {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;
	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		int counter = 0;
		Node temp = this.head;
		while (counter < index) {
			temp = temp.next;
			counter++;
		}

		return temp;
	}

	public void addAt(int data, int index) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node temp = this.getNodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		return this.tail.data;
	}

	public int getAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		return this.getNodeAt(index).data;

	}

	public void removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
	}

	public void removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = getNodeAt(this.size() - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
	}

	public void removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}
		if (index == 0) {
			this.removeFirst();
		} else if (index == this.size - 1) {
			this.removeLast();
		} else {
			Node temp = this.getNodeAt(index - 1);
			temp.next = temp.next.next;
			this.size--;
		}
	}

	public void reverseDI() throws Exception {
		int si = 0, li = this.size - 1;
		while (si <= li) {
			Node left = this.getNodeAt(si);
			Node right = this.getNodeAt(li);

			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			si++;
			li--;

		}

	}

	public void reversePI() {
		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node tempPrev = prev;
			Node tempCurr = curr;
			prev = curr;
			curr = curr.next;
			tempCurr.next = tempPrev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePR() {
		reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {
		if (node == this.tail) {
			return;
		}
		reversePR(node.next);
		node.next.next = node;
	}

	public void reverseDR() {
		HeapMover hm = new HeapMover(this.head);
		reverseDR(hm, this.head, 0);
	}

	private void reverseDR(HeapMover hm, Node right, int level) {
		if (right == null) {
			return;
		}
		reverseDR(hm, right.next, level + 1);
		if (level >= this.size() / 2) {
			int temp = hm.node.data;
			hm.node.data = right.data;
			right.data = temp;

			hm.node = hm.node.next;
		}
	}

	private class HeapMover {
		Node node;

		HeapMover(Node node) {
			this.node = node;
		}
	}

	public int mid() {
		return getMidNode().data;
	}

	private Node getMidNode() {
		Node slow = this.head, fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		return slow;
	}

	public int KthFromEnd(int index) throws Exception {
		if (index < 1 || index > this.size) {
			throw new Exception("Invalid Index");
		}

		Node slow = this.head, fast = this.head;

		for (int i = 0; i < index; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

	public LinkedList merge(LinkedList other) {
		LinkedList rv = new LinkedList();
		Node thistemp = this.head, othertemp = other.head;
		while (thistemp != null && othertemp != null) {
			if (thistemp.data < othertemp.data) {
				rv.addLast(thistemp.data);
				thistemp = thistemp.next;
			} else {
				rv.addLast(othertemp.data);
				othertemp = othertemp.next;
			}
		}

		while (thistemp != null) {
			rv.addLast(thistemp.data);
			thistemp = thistemp.next;
		}

		while (othertemp != null) {
			rv.addLast(othertemp.data);
			othertemp = othertemp.next;
		}

		return rv;
	}

	public void mergeSort() {
		LinkedList sorted = MergeSortHelper(this.head, this.tail);
	    this.head=sorted.head;
	    this.tail=sorted.tail;
	    this.size=sorted.size;
	}

	private LinkedList MergeSortHelper(Node low, Node high) {
		if (this.size() == 1) {
			return this;
		}
		Node mid = getMidNode();
		Node midNext = mid.next;
		mid.next = null;

		LinkedList list1 = new LinkedList(low, mid, (this.size() + 1) / 2);
		LinkedList list2 = new LinkedList(midNext, high, (this.size()) / 2);

		list1.mergeSort();
		list2.mergeSort();

		return list1.merge(list2);
	}

	LinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

}
