package Lecture13;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addFirst(10);
		// list.addAt(20, 1);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);

		list.addAt(25, 2);
		list.display();

		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAt(2));

		list.removeFirst();
		list.display();

		list.removeLast();
		list.display();

		list.removeAt(2);
		list.display();

		// list.removeAt(0);
		// list.display();
		//
		// list.removeAt(3);
		// list.display();

		list.reverseDR();
		list.display();
	}

}
