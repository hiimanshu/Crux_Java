package Lecture2;

public class NthFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 13;
		int counter = 1;
		int fn = 0, sn = 1;
		while (counter <= N) {
			int next = fn + sn;
			fn = sn;
			sn = next;
			counter++;
		}
		System.out.println("The " + N + "th Fibonacci is " + fn);
	}

}
