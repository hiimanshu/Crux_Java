package Lecture13;

public class StackUsingLL {
	private LinkedList list;

	public StackUsingLL() {
		// TODO Auto-generated constructor stub
		list = new LinkedList();
	}

	public int size() {
		return this.list.size();
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void push(int item) {
		this.list.addFirst(item);
	}

	public int pop() throws Exception {
		int rv = this.list.getFirst();
		this.list.removeFirst();
		return rv;
	}

	public int top() throws Exception {
		int rv = this.list.getFirst();
		return rv;
	}

	public void display() {
		this.list.display();
	}
}
