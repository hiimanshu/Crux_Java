package Lecture2;

public class FibonacciLessThanN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 55;
		int fn = 0, sn = 1;

		while (fn < N) {
			System.out.println(fn);
			int next = fn + sn;
			fn = sn;
			sn = next;
		}
	}

}
